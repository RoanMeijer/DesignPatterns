package com.company.passenger;

import com.company.emotion.Emotion;
import com.company.Ticket;
import com.company.emotion.EmotionType;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class Passenger {
    private String name;
    private ArrayList<Emotion> emotions;
    private Ticket ticket;
    private HashMap<EmotionType, Float> emotionModifiers;
    private ArrayList<String> failCauses;

    public Passenger(String name) {
        this.emotions = new ArrayList<>();
        this.name = name;
    }

    private void update() {

    }

    private String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private ArrayList<Emotion> getEmotions() {
        return this.emotions;
    }

    private void addEmotion(Emotion emotion) {
        this.emotions.add(emotion);
    }

    private void removeEmotion(Emotion emotion) {
        this.emotions.remove(emotion);
    }

    private Ticket getTicket() {
        return this.ticket;
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private HashMap<EmotionType, Float> getEmotionModifiers() {
        return this.emotionModifiers;
    }

    private void addEmotionModifier(EmotionType emotionType, Float value) {
        this.emotionModifiers.put(emotionType, value);
    }

    private void removeEmotionModifier(EmotionType emotionType) {
        this.emotionModifiers.remove(emotionType);
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
