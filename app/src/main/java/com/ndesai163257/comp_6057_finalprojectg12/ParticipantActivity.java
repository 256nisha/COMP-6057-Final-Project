package com.ndesai163257.comp_6057_finalprojectg12;
import io.realm.RealmObject;
public class ParticipantActivity extends RealmObject {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String membershipNumber;
    private String sessionId;

    // Required empty constructor
    public ParticipantActivity() {}

    // Getters and setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getMembershipNumber() { return membershipNumber; }
    public void setMembershipNumber(String membershipNumber) { this.membershipNumber = membershipNumber; }

    public String getSessionId() { return sessionId; }
    public void setSessionId(String sessionId) { this.sessionId = sessionId; }
}
