package com.ndesai163257.comp_6057_finalprojectg12;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ParticipantListAdapter extends RecyclerView.Adapter<ParticipantListAdapter.MyViewHolder>{

    private static List<Participant> participantList;
    // Constructor
    public ParticipantListAdapter(List<Participant> participantList) {
        this.participantList = participantList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_participant_adddrop, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Participant participant = participantList.get(position);
        holder.participantName.setText(participant.getFirstName() + " " + participant.getLastName());

    }

    @Override
    public int getItemCount() {
        return participantList.size();
    }

    // ViewHolder class
    static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView participantName;
        Button addButton, dropButton;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            participantName = itemView.findViewById(R.id.participantName);
            addButton = itemView.findViewById(R.id.addButton);
            dropButton = itemView.findViewById(R.id.dropButton);

            //Add particular signed up participant to current session then remove it from signed up list
            addButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(),participantList.get(getAdapterPosition()).firstName+" Added!", Toast.LENGTH_LONG).show();
                    participantList.remove(getAdapterPosition());
                    MyViewHolder.this.notify();
                }
            });

            //Drop particular signed up participant then remove it from signed up list
            dropButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(),participantList.get(getAdapterPosition()).firstName+" Dropped!", Toast.LENGTH_LONG).show();
                    participantList.remove(getAdapterPosition());
                    MyViewHolder.this.notify();
                }
            });
        }
    }

}
