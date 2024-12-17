package com.wfederico97.flightify.service;

import com.wfederico97.flightify.model.DTO.PutPilotModelDTO;
import com.wfederico97.flightify.model.PilotModel;
import com.wfederico97.flightify.repo.PilotRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PilotService {

    private final PilotRepo repo;

    @Autowired
    public PilotService(PilotRepo repo) {
        this.repo = repo;
    }

    public List<PilotModel> returnAllPilotPosts() {
        return repo.returnAllPilotPosts();
    }
    public PilotModel getPilotById(int id) {
        return repo.getPilotById(id);
    }

    public void addPilotPost(PilotModel pilotModel) {
        repo.addPilotPost(pilotModel);
    }
    public int updatePilot(int id, PutPilotModelDTO pilotModelDTO) {
        return repo.updatePilot(id, pilotModelDTO);
    }

    public void deletePilot(int id) {
        repo.deletePilot(id);
    }
}
