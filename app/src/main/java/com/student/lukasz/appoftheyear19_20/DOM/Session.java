package com.student.lukasz.appoftheyear19_20.DOM;

import java.util.ArrayList;
import java.util.List;

public class Session {
    public int sessionID;
    List<Speler> spelersList = new ArrayList<Speler>();
    List<Vragen> vragenList = new ArrayList<Vragen>();


    public Session(int sessionID, List<Speler> spelersList, List<Vragen> vragenList){
        this.sessionID  =sessionID;
        this.spelersList = spelersList;
        this.vragenList = vragenList;
    }

    public int getSessionID() {
        return sessionID;
    }

    public void setSessionID(int sessionID) {
        this.sessionID = sessionID;
    }

    public List<Speler> getSpelersList() {
        return spelersList;
    }

    public void setSpelersList(List<Speler> spelersList) {
        this.spelersList = spelersList;
    }

    public List<Vragen> getVragenList() {
        return vragenList;
    }

    public void setVragenList(List<Vragen> vragenList) {
        this.vragenList = vragenList;
    }
}
