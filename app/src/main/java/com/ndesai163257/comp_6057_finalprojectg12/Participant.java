package com.ndesai163257.comp_6057_finalprojectg12;

import java.util.UUID;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Participant extends RealmObject {
    @PrimaryKey
    public int firstName;
    private String id = UUID.randomUUID().toString(); // unique

    private String lastName;
    private String phone;
    private String clubMembership;
    private int sessionId;

    public char[] getFirstName() {
        return new char[0];
    }

    public Object getLastName() {
        return null;
    }

    // Getters & setters
}
