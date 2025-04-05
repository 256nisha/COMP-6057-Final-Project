package com.ndesai163257.comp_6057_finalprojectg12;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Employee extends RealmObject {
    @PrimaryKey
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}