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
        return repo.findAll();
    }
    public PilotModel getPilotById(int id) {
        return repo.findById(id).orElse(new PilotModel());
    }

    public void addPilotPost(PilotModel pilotModel) {
        repo.save(pilotModel);
    }
    public int updatePilot(int id, PutPilotModelDTO pilotModelDTO) {
        PilotModel indexedPilot = repo.findById(id).orElse(null);
        if(indexedPilot == null) return 0;
        if(pilotModelDTO.getPostProfile() != null) indexedPilot.setPostProfile(pilotModelDTO.getPostProfile());
        if(pilotModelDTO.getPostDesc() != null) indexedPilot.setPostDesc(pilotModelDTO.getPostDesc());
        if(pilotModelDTO.getCommActivity() != null) indexedPilot.setCommActivity(pilotModelDTO.getCommActivity());
        if(pilotModelDTO.getAircraftType() != null) indexedPilot.setAircraftType(pilotModelDTO.getAircraftType());
        repo.save(indexedPilot);
        return 1;
    }

    public void deletePilot(int id) {
        repo.deleteById(id);
    }

    public void load() {
        List<PilotModel> pilots = List.of(
                new PilotModel(1, "Jorge Gonzalez", "Fleet Captain", "Civil Aviation", "Aircraft"),
                new PilotModel(2, "Maria Perez", "First Officer", "Military Aviation", "Helicopter"),
                new PilotModel(3, "Juan Rodriguez", "Captain", "General Aviation", "Jet"),
                new PilotModel(4, "Carlos Sanchez", "Second Officer", "Commercial Aviation", "Cargo Plane"),
                new PilotModel(5, "Ana Martinez", "First Officer", "General Aviation", "Aircraft")
        );
        repo.saveAll(pilots);
    }
}
