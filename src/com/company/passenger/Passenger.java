package com.company.passenger;

import com.company.Game;
import com.company.emotion.Emotion;
import com.company.Ticket;
import com.company.emotion.EmotionType;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class Passenger {
    private String name;
    private Ticket ticket;
    private final HashMap<EmotionType, Integer> emotions;
    private ArrayList<String> failCauses;

    public Passenger(String name) {
        this.emotions = new HashMap<>();
        this.name = name;
    }

    private void update() {

    }

    public abstract void feelingHappier();
    public abstract void feelingLessHappy();
    public abstract void feelingStressed();
    public abstract void feelingLessStressed();
    public abstract void feelingAngry();
    public abstract void feelingLessAngry();

    private String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getEmotion(EmotionType type) {
        return emotions.get(type);
    }

    public HashMap<EmotionType, Integer> getEmotions() {
        return this.emotions;
    }

    public void setEmotion(EmotionType type, Integer value) {
        this.emotions.put(type, value);
    }

    public void removeEmotion(EmotionType type) {
        this.emotions.remove(type);
    }

    private Ticket getTicket() {
        return this.ticket;
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private ArrayList<String> getFailCauses() {
        return this.failCauses;
    }

    private void addFailCause(String failCause) {
        this.failCauses.add(failCause);
    }

    private void removeFailCause(String failCause) {
        this.failCauses.remove(failCause);
    }
}
