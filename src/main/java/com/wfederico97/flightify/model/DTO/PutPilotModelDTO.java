package com.wfederico97.flightify.model.DTO;

public class PutPilotModelDTO {
    private String postProfile;
    private String postDesc;
    private String commActivity;
    private String aircraftType;

    public String getPostProfile() {
        return postProfile;
    }

    public void setPostProfile(String postProfile) {
        this.postProfile = postProfile;
    }

    public String getPostDesc() {
        return postDesc;
    }

    public void setPostDesc(String postDesc) {
        this.postDesc = postDesc;
    }

    public String getCommActivity() {
        return commActivity;
    }

    public void setCommActivity(String commActivity) {
        this.commActivity = commActivity;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }
}
