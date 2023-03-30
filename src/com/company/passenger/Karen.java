package com.company.passenger;

import com.company.emotion.EmotionType;

public class Karen extends Passenger {
    public Karen(String name) {
        super(name);
        setEmotion(EmotionType.ANGRY, 2);
        setEmotion(EmotionType.STRESSED, 2);
        setEmotion(EmotionType.HAPPY, 5);
    }
}