package com.wfederico97.flightify.controller;

import com.wfederico97.flightify.model.DTO.PutPilotModelDTO;
import com.wfederico97.flightify.model.PilotModel;
import com.wfederico97.flightify.service.PilotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PilotController {

    private final PilotService service;
    @Autowired
    public PilotController(PilotService service) {
        this.service = service;
    }

    @PostMapping(path = "/addPilot", consumes = "application/json",name = "addPilot")
    public void addPilot(@RequestBody PilotModel model) {
        service.addPilotPost(model);
    }
    @GetMapping(path="pilots",produces = "application/json",name = "pilots")
    public List<PilotModel> getAllPilots(Model model) {
         return service.returnAllPilotPosts();
    }
    @GetMapping(path = "/pilot/{id}",name = "pilot")
    public PilotModel getPilotById(@PathVariable int id) {
        return service.getPilotById(id);
    }
    @PutMapping(path = "/updatePilot/{id}", consumes = "application/json",name = "updatePilot")
    public void updatePilot(@PathVariable int id, @RequestBody PutPilotModelDTO pilotModelDTO) {
        service.updatePilot(id, pilotModelDTO);
    }
    @DeleteMapping(path = "/deletePilot/{id}",name = "deletePilot")
    public void deletePilot(@PathVariable int id) {
        service.deletePilot(id);
    }

    @GetMapping("load")
    public String loadData(){
        service.load();
        return "Success";
    }

}
