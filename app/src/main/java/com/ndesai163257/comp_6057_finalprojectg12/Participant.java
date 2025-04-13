package com.ndesai163257.comp_6057_finalprojectg12;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Participant extends RealmObject implements Serializable {

    @PrimaryKey
    private long participantId;
    public String firstName;
    public String lastName;
    public String phoneNumber;
    public String clubMembershipNumber;
    public String sessionId;

    public long getParticipantId() {
        return participantId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getClubMembershipNumber() {
        return clubMembershipNumber;
    }

    public void setClubMembershipNumber(String clubMembershipNumber) {
        this.clubMembershipNumber = clubMembershipNumber;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
