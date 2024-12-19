package com.wfederico97.flightify.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
public class PilotModel {
    @Id
    private int pilotId;
    private String postProfile;
    private String postDesc;
    private String commActivity;
    private String aircraftType;
}