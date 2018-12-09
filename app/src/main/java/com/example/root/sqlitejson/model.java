package com.example.root.sqlitejson;

public class model {

    private String id , team ,  manager , stadium ;

    public model(String id, String team,  String manager, String stadium) {
        this.id = id;
        this.team = team;
        this.manager = manager;
        this.stadium = stadium;
    }

    public String getIds() {
        return id;
    }

    public void setIds(String id) {
        this.id = id;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

}
