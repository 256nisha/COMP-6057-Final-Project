package com.ndesai163257.comp_6057_finalprojectg12;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SessionListAdapter extends RecyclerView.Adapter<SessionListAdapter.MyViewHolder>{

    private List<Session> sessionList;
    private OnClickListener onClickListener;
    // Constructor
    public SessionListAdapter(List<Session> sessionList) {
        this.sessionList = sessionList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_home_session, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Session session = sessionList.get(position);
        holder.sportName.setText(session.getSport().toString());
        holder.totalParticipants.setText(session.getTotalParticipants());
        holder.timeFrame.setText(String.valueOf(session.getTimeFrame().toMinutes()) + " mins");
        holder.gymNo.setText(session.getGymNumber());

        //Set OnClick listener "5. A Session details page" redirection
        holder.itemView.setOnClickListener(view -> {
            if (onClickListener != null) {
                onClickListener.onClick(position, session);
            }
        });
    }

    @Override
    public int getItemCount() {
        return sessionList.size();
    }

    // ViewHolder class
    static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView sportName, totalParticipants, timeFrame, gymNo;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            sportName = itemView.findViewById(R.id.sportName);
            totalParticipants = itemView.findViewById(R.id.totalParticipants);
            timeFrame = itemView.findViewById(R.id.timeFrame);
            gymNo = itemView.findViewById(R.id.gymNo);
        }
    }

    // Setter for the click listener
    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    // Interface for the click listener
    public interface OnClickListener {
        void onClick(int position, Session session);
    }

}