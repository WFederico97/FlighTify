package com.wfederico97.flightify.repo;

import com.wfederico97.flightify.model.DTO.PutPilotModelDTO;
import com.wfederico97.flightify.model.PilotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public interface PilotRepo extends JpaRepository<PilotModel, Integer> {

}
//    private final List<PilotModel> pilots = new ArrayList<>();

//
//    public List<PilotModel> returnAllPilotPosts() {
//        return pilots;
//    }
//
//    public PilotModel getPilotById(int id) {
//        return pilots.stream().filter(pilot -> pilot.getPilotId() == id).findFirst().orElse(null);
//    }
//
//    public void addPilotPost(PilotModel pilotModel) {
//        pilots.add(pilotModel);
//    }
//    public int updatePilot(int id, PutPilotModelDTO pilotModelDTO){
//        int affectedRows = 0;
//        PilotModel indexedPilot = pilots.stream().filter(pilot -> pilot.getPilotId() == id).findFirst().orElse(null);
//        if(!Objects.equals(indexedPilot.getPostProfile(), pilotModelDTO.getPostProfile())){
//            indexedPilot.setPostProfile(pilotModelDTO.getPostProfile());
//        } if(!Objects.equals(indexedPilot.getPostDesc(), pilotModelDTO.getPostDesc())){
//            indexedPilot.setPostDesc(pilotModelDTO.getPostDesc());
//        } if(!Objects.equals(indexedPilot.getCommActivity(), pilotModelDTO.getCommActivity())){
//            indexedPilot.setCommActivity(pilotModelDTO.getCommActivity());
//        } if(!Objects.equals(indexedPilot.getAircraftType(), pilotModelDTO.getAircraftType())){
//            indexedPilot.setAircraftType(pilotModelDTO.getAircraftType());
//        }
//        affectedRows = 1;
//
//        return affectedRows;
//    }
//
//    public void deletePilot(int id) {
//        pilots.removeIf(pilot -> pilot.getPilotId() == id);
//    }
