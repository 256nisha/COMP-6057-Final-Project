package com.ndesai163257.comp_6057_finalprojectg12;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;

public class HomeActivity extends AppCompatActivity {

    Realm realm;
    List<Session> sessionList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //initialize realm db object
        Realm.init(this);
        realm = Realm.getDefaultInstance();

        //get session list from realm db
        sessionList = new ArrayList<>();
        sessionList = realm.where(Session.class).findAll();

        //set up recyclerview with custom adapter
        //This will list all Sessions from realm db
        RecyclerView sessionListRV = findViewById(R.id.sessionList);
        SessionListAdapter sessionListAdapter = new SessionListAdapter(sessionList);
        sessionListRV.setAdapter(sessionListAdapter);

        //Redirect to session details page on click - point 5
        sessionListAdapter.setOnClickListener(new SessionListAdapter.OnClickListener() {
            @Override
            public void onClick(int position, Session session) {
                Intent intent = new Intent(HomeActivity.this, SessionViewActivity.class);
                // Passing the data to the session view screen
                intent.putExtra("session_view_screen", session);
                startActivity(intent);
            }
        });

    }


}
