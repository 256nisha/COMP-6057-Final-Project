package com.ndesai163257.comp_6057_finalprojectg12;

import java.io.Serializable;
import java.time.Duration;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Session extends RealmObject implements Serializable{

    @PrimaryKey
    private long sessionId;
    private Sport sport;
    private int totalParticipants;
    private Duration timeFrame;
    private String gymNumber;

    public long getSessionId() {
        return sessionId;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public int getTotalParticipants() {
        return totalParticipants;
    }

    public void setTotalParticipants(int totalParticipants) {
        this.totalParticipants = totalParticipants;
    }

    public Duration getTimeFrame() {
        return timeFrame;
    }

    public void setTimeFrame(Duration timeFrame) {
        this.timeFrame = timeFrame;
    }

    public String getGymNumber() {
        return gymNumber;
    }

    public void setGymNumber(String gymNumber) {
        this.gymNumber = gymNumber;
    }
}
