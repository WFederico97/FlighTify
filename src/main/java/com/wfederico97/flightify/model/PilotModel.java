package com.wfederico97.flightify.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PilotModel {
    private int pilotId;
    private String postProfile;
    private String postDesc;
    private String commActivity;
    private String aircraftType;
}