package com.ndesai163257.comp_6057_finalprojectg12;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public enum Sport {
    BASKETBALL("Basketball",20,Duration.ofMinutes(120)),
    BADMINTON("Badminton", 4, Duration.ofMinutes(90)),
    VOLLEYBALL("Volleyball",12,Duration.ofMinutes(120)),
    PICKLEBALL("Pickleball",4,Duration.ofMinutes(60)),
    DODGEBALL("Dodgeball",20,Duration.ofMinutes(90));

    private static final Map<String, Sport> SPORT_NAME = new HashMap<>();
    private static final Map<Integer, Sport> MAX_PLAYERS_PER_COURT = new HashMap<>();
    private static final Map<Duration, Sport> TOTAL_PLAY_TIME = new HashMap<Duration, Sport>();

    static {
        for (Sport e : values()) {
            SPORT_NAME.put(e.sportName, e);
            MAX_PLAYERS_PER_COURT.put(e.maxPlayersPerCourt, e);
            TOTAL_PLAY_TIME.put(e.totalPlayTime, e);
        }
    }
    public final String sportName;
    public final int maxPlayersPerCourt;
    public final Duration totalPlayTime;


    private Sport(String sportName, int maxPlayersPerCourt, Duration totalPlayTime) {
        this.sportName = sportName;
        this.maxPlayersPerCourt = maxPlayersPerCourt;
        this.totalPlayTime = totalPlayTime;
    }

    public static Sport valueOfLabel(String sportName) {
        return SPORT_NAME.get(sportName);
    }

    public static Sport valueOfAtomicNumber(int maxPlayersPerCourt) {
        return MAX_PLAYERS_PER_COURT.get(maxPlayersPerCourt);
    }

    public static Sport valueOfAtomicWeight(Duration totalPlayTime) {
        return TOTAL_PLAY_TIME.get(totalPlayTime);
    }

}
