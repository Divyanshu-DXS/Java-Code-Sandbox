package com.dev.dxs.MavenProjectDemo1;

public class Profession {

    String jobRole;

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public String yourProfession(String jobRole){
        return "Woring as a : "+jobRole;
    }


    @Override
    public String toString() {
        return "Profession{" +
                "jobRole='" + jobRole + '\'' +
                '}';
    }
}
