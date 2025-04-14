package com.ndesai163257.comp_6057_finalprojectg12;



import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class PlayActivity extends AppCompatActivity {

    private TextView  timerText, roundText;
    private Button startRoundBtn;
    private CountDownTimer countDownTimer;
    private long roundDurationInMillis;
    private int roundNumber = 1;
    private String sport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_activity);
        TextView sportNameText = findViewById(R.id.sportNameText);
        timerText = findViewById(R.id.timerText);
        roundText = findViewById(R.id.roundText);
        startRoundBtn = findViewById(R.id.startRoundBtn);

         sport = "Basketball";
        sportNameText.setText(getString(R.string.sport_label, sport));

        roundDurationInMillis = getRoundTimeForSport(sport);

        startRoundBtn.setOnClickListener(v -> startRound());
    }

    private void startRound() {
        if (countDownTimer != null) countDownTimer.cancel();

        roundText.setText(getString(R.string.round_label, roundNumber));


        countDownTimer = new CountDownTimer(roundDurationInMillis, 1000) {
            public void onTick(long millisUntilFinished) {
                long minutes = millisUntilFinished / 60000;
                long seconds = (millisUntilFinished % 60000) / 1000;
                timerText.setText(getString(R.string.time_remaining, minutes, seconds));



            }

            public void onFinish() {
                roundNumber++;
                timerText.setText(getString(R.string.round_finished));
                startRoundBtn.setText(getString(R.string.start_next_round));

            }
        };
        countDownTimer.start();
    }

    private long getRoundTimeForSport(String sport) {
        switch (sport) {
            case "Basketball": return 10 * 60 * 1000; // 10 minutes
            case "Badminton": return 5 * 60 * 1000;   // 5 minutes
            case "Volleyball": return 8 * 60 * 1000;  // 8 minutes
            case "Cricket": return 15 * 60 * 1000;    // 15 minutes
            case "Football": return 12 * 60 * 1000;   // 12 minutes
            default: return 5 * 60 * 1000;
        }
    }
}
