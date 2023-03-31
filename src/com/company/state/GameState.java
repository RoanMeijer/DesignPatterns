package com.company.state;

import com.company.Game;
import com.company.GameDialog;
import com.company.Scenario;
import com.company.ScenarioGenerator;
import com.company.compartment.*;
import com.company.emotion.EmotionType;

import java.util.ArrayList;
import java.util.HashMap;

public class GameState extends State {
    private ArrayList<String> options;
    private ArrayList<Integer> consequence;
    private ArrayList<Integer> compartmentMultipliers;
    private EmotionType affectedEmotionType;
    private String scenarioDescription;
    private GameDialog gameDialog;
    private ScenarioGenerator scenarioGenerator = new ScenarioGenerator();

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
        Scenario scenario = scenarioGenerator.getRandomScenario();

        scenarioDescription = scenario.getScenarioDescription();
        options = scenario.getOptions();

        affectedEmotionType = scenario.getEffectedEmotionType();
        consequence = scenario.getConsequences();

        compartmentMultipliers = scenario.getCompartmentMultipliers();
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
