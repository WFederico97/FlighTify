package com.wfederico97.flightify.repo;

import com.wfederico97.flightify.model.DTO.PutPilotModelDTO;
import com.wfederico97.flightify.model.PilotModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class PilotRepo {

    List<PilotModel> pilots = new ArrayList<>(
            List.of(
                    new PilotModel(1, "Pilot Profile 1", "Pilot Description 1", "Yes","Plane"),
                    new PilotModel(2, "Pilot Profile 2", "Pilot Description 2", "No","Helicopter"),
                    new PilotModel(3, "Pilot Profile 3", "Pilot Description 3", "Yes","Plane"),
                    new PilotModel(4, "Pilot Profile 4", "Pilot Description 4", "No","Helicopter"),
                    new PilotModel(5, "Pilot Profile 5", "Pilot Description 5", "Yes","Plane"),
                    new PilotModel(6, "Pilot Profile 6", "Pilot Description 6", "No","Helicopter")
            )
    );


    public List<PilotModel> returnAllPilotPosts() {
        return pilots;
    }

    public PilotModel getPilotById(int id) {
        return pilots.stream().filter(pilot -> pilot.getPilotId() == id).findFirst().orElse(null);
    }

    public void addPilotPost(PilotModel pilotModel) {
        pilots.add(pilotModel);
    }
    public int updatePilot(int id, PutPilotModelDTO pilotModelDTO){
        int affectedRows = 0;
        PilotModel indexedPilot = pilots.stream().filter(pilot -> pilot.getPilotId() == id).findFirst().orElse(null);
        if(!Objects.equals(indexedPilot.getPostProfile(), pilotModelDTO.getPostProfile())){
            indexedPilot.setPostProfile(pilotModelDTO.getPostProfile());
        } if(!Objects.equals(indexedPilot.getPostDesc(), pilotModelDTO.getPostDesc())){
            indexedPilot.setPostDesc(pilotModelDTO.getPostDesc());
        } if(!Objects.equals(indexedPilot.getCommActivity(), pilotModelDTO.getCommActivity())){
            indexedPilot.setCommActivity(pilotModelDTO.getCommActivity());
        } if(!Objects.equals(indexedPilot.getAircraftType(), pilotModelDTO.getAircraftType())){
            indexedPilot.setAircraftType(pilotModelDTO.getAircraftType());
        }
        affectedRows = 1;

        return affectedRows;
    }

    public void deletePilot(int id) {
        pilots.removeIf(pilot -> pilot.getPilotId() == id);
    }
}
