package com.company.passenger;

import com.company.emotion.EmotionType;

public class Businessman extends Passenger {
    public Businessman(String name) {
        super(name);
        setEmotion(EmotionType.ANGRY, 2);
        setEmotion(EmotionType.STRESSED, 2);
        setEmotion(EmotionType.HAPPY, 5);
    }


    // Happy doesn't go higher than 10
    @Override
    public void increaseHappiness() {
        System.out.println("You became happier");
        int value = getEmotion(EmotionType.HAPPY);
        value += 1;
        if (value > 10) {
            value = 10;
        }
        this.setEmotion(EmotionType.HAPPY, value);
    }

    // When happy is 0 game over
    @Override
    public void decreaseHappiness() {
        System.out.println("You became less happy");
        int value = getEmotion(EmotionType.HAPPY);
        value -= 1;
        if (value == 0) {
            System.out.println("You started to cry and complains about your boss");
            // End game
        } else {
            this.setEmotion(EmotionType.HAPPY, value);
        }
    }

    // When stressed is 20 game over
    @Override
    public void increaseStress() {
        System.out.println("You became stressed");
        int value = getEmotion(EmotionType.STRESSED);
        value += 1;
        if (value >= 20) {
            System.out.println("You have a panic attack and passed out");
            // End game
        } else {
            this.setEmotion(EmotionType.HAPPY, value);
        }
    }

    // Stressed doesn't go lower than 0
    @Override
    public void decreaseStress() {
        System.out.println("You became less stressed");
        int value = getEmotion(EmotionType.STRESSED);
        if (value != 0) {
            value -= 1;
            this.setEmotion(EmotionType.HAPPY, value);
        }
    }

    // When angry is 20 game over
    @Override
    public void increaseAnger() {
        System.out.println("You became more angry");
        int value = getEmotion(EmotionType.ANGRY);
        value += 2;
        if (value > 20) {
            System.out.println("You started to yell");
            // End game
        } else if (value >= 10) {
            System.out.println("You started to yell");
            this.setEmotion(EmotionType.HAPPY, value);
        }
    }

    // Anger doesn't go lower than 0
    @Override
    public void decreaseAnger() {
        System.out.println("You became less angry");
        int value = getEmotion(EmotionType.ANGRY);
        if (value != 0) {
            value -= 1;
            this.setEmotion(EmotionType.HAPPY, value);
        }
    }
}
