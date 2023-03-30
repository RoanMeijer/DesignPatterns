package com.company.passenger;

import com.company.emotion.EmotionType;

public class Businessman extends Passenger {
    public Businessman(String name) {
        super(name);
        setEmotion(EmotionType.ANGRY, 2);
        setEmotion(EmotionType.STRESSED, 2);
        setEmotion(EmotionType.HAPPY, 5);
    }
}
