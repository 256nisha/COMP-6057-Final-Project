package com.ndesai163257.comp_6057_finalprojectg12;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;

public class SessionViewActivity extends AppCompatActivity {

    Realm realm;
    List<Participant> participantList;
    Session session;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session_view);

        if (getIntent().hasExtra("session_view_screen")) {
            // get the Serializable Session class with the details in it
            session =  (Session) getIntent().getSerializableExtra("session_view_screen");
        }

        //initialize realm db object
        Realm.init(this);
        realm = Realm.getDefaultInstance();

        //Get all signed up participants by sessionId selected on previous screen
        participantList = new ArrayList<>();
        participantList = realm.where(Participant.class).equalTo("sessionId", session.getSessionId()).findAll();

        //Assign all returned participants to recyclerview - participantList
        RecyclerView participantListRV = findViewById(R.id.participantList);
        ParticipantListAdapter sessionListAdapter = new ParticipantListAdapter(participantList);
        participantListRV.setAdapter(sessionListAdapter);

    }
}