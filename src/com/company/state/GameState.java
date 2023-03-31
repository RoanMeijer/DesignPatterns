package com.company.state;

import com.company.Game;
import com.company.GameDialog;
import com.company.compartment.*;
import com.company.emotion.EmotionType;

import java.util.ArrayList;
import java.util.HashMap;

public class GameState extends State {
    private final ArrayList<String> options;
    private final ArrayList<Integer> consequence;
    private final ArrayList<Integer> compartmentMultipliers;
    private EmotionType affectedEmotionType;
    private String scenarioDescription;
    private GameDialog gameDialog;

    public GameState() {
        options = new ArrayList<>();
        consequence = new ArrayList<>();
        compartmentMultipliers = new ArrayList<>();
        options.add("");
        options.add("");
        options.add("");
        options.add("");

        gameDialog = new GameDialog();
    }

    public void loadRandomScenario(){
        scenarioDescription = "TEST SCENARIO!!!! 4 loud teenagers walk in to the compartment playing music";
        options.clear();
        options.add("Ignore");
        options.add("Fight");
        options.add("talk to them");
        options.add("call police");

        affectedEmotionType = EmotionType.HAPPY;
        consequence.clear();
        consequence.add(-1);
        consequence.add(-3);
        consequence.add(3);
        consequence.add(-2);

        compartmentMultipliers.clear();
        //Bar
        compartmentMultipliers.add(1);
        //music
        compartmentMultipliers.add(0);
        //first class
        compartmentMultipliers.add(2);
        //second class
        compartmentMultipliers.add(1);
        //silent
        compartmentMultipliers.add(3);
    }

    public int getCurrentMultiplier(Game game){
        if(game.getCurrentCompartment() instanceof BarCompartment){
            return compartmentMultipliers.get(0);
        }
        if(game.getCurrentCompartment() instanceof MusicCompartment){
            return compartmentMultipliers.get(1);
        }
        if(game.getCurrentCompartment() instanceof FirstClassCompartment){
            return compartmentMultipliers.get(2);
        }
        if(game.getCurrentCompartment() instanceof SecondClassCompartment){
            return compartmentMultipliers.get(3);
        }
        return compartmentMultipliers.get(4);
    }

    @Override
    public void pressButton1(Game game) {
        gameDialog.printChoiceMessage(options.get(0));
        game.getPassenger().changeEmotion(affectedEmotionType, consequence.get(0) * getCurrentMultiplier(game));
    }

    @Override
    public void pressButton2(Game game) {
        gameDialog.printChoiceMessage(options.get(1));
        game.getPassenger().changeEmotion(affectedEmotionType, consequence.get(1) * getCurrentMultiplier(game));
    }

    @Override
    public void pressButton3(Game game) {
        gameDialog.printChoiceMessage(options.get(2));
        game.getPassenger().changeEmotion(affectedEmotionType, consequence.get(2) * getCurrentMultiplier(game));
    }

    @Override
    public void pressButton4(Game game) {
        gameDialog.printChoiceMessage(options.get(3));
        game.getPassenger().changeEmotion(affectedEmotionType, consequence.get(3) * getCurrentMultiplier(game));
    }

    public ArrayList<String> getOptions() {
        return this.options;
    }

    public String getScenarioDescription(){
        return scenarioDescription;
    }
}
