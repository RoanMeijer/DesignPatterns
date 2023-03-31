package com.company.state;

import com.company.Game;
import com.company.GameDialog;
import com.company.emotion.EmotionType;

import java.util.ArrayList;
import java.util.HashMap;

public class GameState extends State {
    private final ArrayList<String> options;
    private final ArrayList<Integer> consequence;
    private EmotionType affectionEmotionType;
    private String scenarioDescription;
    private GameDialog gameDialog;

    public GameState() {
        options = new ArrayList<>();
        consequence = new ArrayList<>();
        options.add("");
        options.add("");
        options.add("");
        options.add("");

        GameDialog gameDialog = new GameDialog();
    }

    public void loadRandomScenario(){
        scenarioDescription = "TEST SCENARIO!!!! 4 loud teenagers walk in to the compartment playing music";
        options.clear();
        options.add("Ignore");
        options.add("Fight");
        options.add("talk to them");
        options.add("call police");

        affectionEmotionType = EmotionType.HAPPY;
        consequence.clear();
        consequence.add(-1);
        consequence.add(-3);
        consequence.add(3);
        consequence.add(-2);
    }

    @Override
    public void pressButton1(Game game) {
        gameDialog.printChoiceMessage(options.get(0));
    }

    @Override
    public void pressButton2(Game game) {
        gameDialog.printChoiceMessage(options.get(1));
    }

    @Override
    public void pressButton3(Game game) {
        gameDialog.printChoiceMessage(options.get(2));
    }

    @Override
    public void pressButton4(Game game) {
        gameDialog.printChoiceMessage(options.get(3));
    }

    public ArrayList<String> getOptions() {
        return this.options;
    }

    public String getScenarioDescription(){
        return scenarioDescription;
    }
}
