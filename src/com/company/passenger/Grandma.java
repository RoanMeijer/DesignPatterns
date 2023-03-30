package com.company.passenger;

import com.company.emotion.EmotionType;

public class Grandma extends Passenger {
    public Grandma(String name) {
        super(name);
        setEmotion(EmotionType.ANGRY, 0);
        setEmotion(EmotionType.STRESSED, 0);
        setEmotion(EmotionType.HAPPY, 10);
    }
}
