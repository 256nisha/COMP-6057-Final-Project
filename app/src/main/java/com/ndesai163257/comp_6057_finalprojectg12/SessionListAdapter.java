package com.ndesai163257.comp_6057_finalprojectg12;

import java.util.concurrent.TimeUnit;

class AdaptSession {
    private String sport;
    private int totalParticipants;
    private long timeValue; // like 2
    private TimeUnit timeUnit; // like TimeUnit.HOURS
    private int gymNumber;

    public AdaptSession(String sport, int totalParticipants, long timeValue, TimeUnit timeUnit, int gymNumber) {
        this.sport = sport;
        this.totalParticipants = totalParticipants;
        this.timeValue = timeValue;
        this.timeUnit = timeUnit;
        this.gymNumber = gymNumber;
    }

    public String getSport() {
        return sport;
    }

    public int getTotalParticipants() {
        return totalParticipants;
    }

    public long getTimeValue() {
        return timeValue;
    }

    public TimeUnit getTimeUnit() {
        return timeUnit;
    }

    public int getGymNumber() {
        return gymNumber;
    }
}
