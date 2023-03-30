package com.company.emotion;

public class Emotion {
    private int value;
    private final EmotionType emotionType;

    public Emotion(EmotionType emotionType, int value) {
        this.emotionType = emotionType;
        this.value = value;
    }

    public EmotionType getEmotionType() {
        return this.emotionType;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
