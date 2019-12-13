package com.student.lukasz.appoftheyear19_20.DOM;

public class Speler {
    public int playerID;
    public String playerName;
    public int score;
    public int streak;
    public boolean answered;
    public boolean owner;


    public Speler(int playerID, String playerName, int score, int streak, boolean answered, boolean owner) {
        this.playerID = playerID;
        this.playerName = playerName;
        this.score = score;
        this.streak = streak;
        this.answered = answered;
        this.owner = owner;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setAnswered(boolean answered) {
        this.answered = answered;
    }

    public int getScore() {
        return score;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public int getStreak() {
        return streak;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setStreak(int streak) {
        this.streak = streak;
    }

}
