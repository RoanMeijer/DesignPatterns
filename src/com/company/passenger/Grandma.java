package com.company.passenger;

import com.company.emotion.EmotionType;

public class Grandma extends Passenger {
    public Grandma(String name) {
        super(name);
        setEmotion(EmotionType.ANGRY, 0);
        setEmotion(EmotionType.STRESSED, 0);
        setEmotion(EmotionType.HAPPY, 10);

        this.happyMultiplier = 1;
        this.angryMultiplier = 0;
        this.stressMultiplier = 2;
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
        checkForLose();
    }
}
