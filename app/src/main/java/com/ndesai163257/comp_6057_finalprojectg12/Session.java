package com.ndesai163257.comp_6057_finalprojectg12;

import com.ndesai163257.comp_6057_finalprojectg12.Participant;

import java.util.concurrent.TimeUnit;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Session extends RealmObject {
    @PrimaryKey
    private int id;
    private String sport;
    private String timeFrame;
    private int gymNumber;
    private int maxPlayers;
    private int durationMinutes;
    private RealmList<Participant> participants;

    public Integer getSessionId() {
        return null;
    }

    public Object getSport() {
        return null;
    }

    public int getTotalParticipants() {
        return 0;
    }

    public TimeUnit getTimeFrame() {
        return null;
    }

    public int getGymNumber() {
        return 0;
    }

    // Getters & setters
}
