package com.company.passenger;

import com.company.emotion.EmotionType;

public class Hooligan extends Passenger {
    public Hooligan(String name) {
        super(name);
        setEmotion(EmotionType.ANGRY, 6);
        setEmotion(EmotionType.STRESSED, 2);
        setEmotion(EmotionType.HAPPY, 2);
    }
}
