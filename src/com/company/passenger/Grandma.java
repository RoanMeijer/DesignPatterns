package com.company.passenger;

import com.company.emotion.EmotionType;

public class Grandma extends Passenger {
    public Grandma(String name) {
        super(name);
        setEmotion(EmotionType.ANGRY, 0);
        setEmotion(EmotionType.STRESSED, 0);
        setEmotion(EmotionType.HAPPY, 10);
    }


    @Override
    public void feelingHappier() {
        int value = getEmotion(EmotionType.HAPPY);
        if (value != 10) {
            if (value >= 8) {
                value = 10;
            } else {
                value += 2;
            }
            this.setEmotion(EmotionType.HAPPY, value);
        }
    }

    @Override
    public void feelingLessHappy() {
        int value = getEmotion(EmotionType.HAPPY);
        if (value != 0) {
            value -= 1;
            this.setEmotion(EmotionType.HAPPY, value);
        }
    }

    @Override
    public void feelingStressed() {
        int value = getEmotion(EmotionType.STRESSED);
        if (value != 0) {
            if (value >= 7) {
                value = 10;
            } else {
                value += 3;
            }
            this.setEmotion(EmotionType.HAPPY, value);
        }
    }

    @Override
    public void feelingLessStressed() {
        int value = getEmotion(EmotionType.STRESSED);
        if (value != 0) {
            value -= 1;
            this.setEmotion(EmotionType.HAPPY, value);
        }
    }

    @Override
    public void feelingAngry() {
        int value = getEmotion(EmotionType.ANGRY);
        if (value != 10) {
            value += 1;
            this.setEmotion(EmotionType.HAPPY, value);
        }
    }

    @Override
    public void feelingLessAngry() {
        int value = getEmotion(EmotionType.ANGRY);
        if (value != 0) {
            value -= 1;
            this.setEmotion(EmotionType.HAPPY, value);
        }
    }
}
