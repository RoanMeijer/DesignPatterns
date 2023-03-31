package com.company.passenger;

import com.company.emotion.EmotionType;

public class Businessman extends Passenger {
    public Businessman(String name) {
        super(name);
        setEmotion(EmotionType.ANGRY, 0);
        setEmotion(EmotionType.STRESSED, 0);
        setEmotion(EmotionType.HAPPY, 10);

        this.happyMultiplier = 2;
        this.angryMultiplier = 1;
        this.stressMultiplier = 3;
    }

    @Override
    public void changeEmotion(EmotionType emotionType, int value) {
        int currentMultiplier = 0;
        switch(emotionType){
            case HAPPY -> currentMultiplier = happyMultiplier;
            case ANGRY -> currentMultiplier = angryMultiplier;
            case STRESSED -> currentMultiplier = stressMultiplier;
        }

        this.setEmotion(emotionType, getEmotion(emotionType) + value * currentMultiplier);
    }
}
