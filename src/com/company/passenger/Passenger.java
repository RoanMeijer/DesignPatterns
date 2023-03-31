package com.company.passenger;

import com.company.Game;
import com.company.GameDialog;
import com.company.emotion.EmotionType;
import com.company.state.EndState;

import java.util.HashMap;

public abstract class Passenger {
    private String name;
    private final HashMap<EmotionType, Integer> emotions;
    protected int happyMultiplier;
    protected int angryMultiplier;
    protected int stressMultiplier;
    private Game game;

    public Passenger(String name) {
        this.emotions = new HashMap<>();
        this.name = name;
    }

    public void setGame(Game game){
        this.game = game;
    }

    public abstract void changeEmotion(EmotionType emotionType, int value);

    private String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getEmotion(EmotionType type) {
        return emotions.get(type);
    }

    public HashMap<EmotionType, Integer> getEmotions() {
        return this.emotions;
    }

    public void setEmotion(EmotionType type, Integer value) {
        this.emotions.put(type, value);
    }

    public void checkForLose(){
        if(this.getEmotion(EmotionType.HAPPY) < 0){
            GameDialog gameDialog = new GameDialog();
            gameDialog.printHappyDeathMessage();
            game.setCurrentState(new EndState());
        }
        if(this.getEmotion(EmotionType.STRESSED) > 10){
            GameDialog gameDialog = new GameDialog();
            gameDialog.printStressDeathMessage();
            game.setCurrentState(new EndState());
        }
        if(this.getEmotion(EmotionType.ANGRY) > 10){
            GameDialog gameDialog = new GameDialog();
            gameDialog.printAngryDeathMessage();
            game.setCurrentState(new EndState());
        }
    }

    public void removeEmotion(EmotionType type) {
        this.emotions.remove(type);
    }
}
