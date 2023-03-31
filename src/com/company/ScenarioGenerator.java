package com.company;

import com.company.emotion.EmotionType;
import com.company.state.State;

import java.util.ArrayList;
import java.util.Random;

public class ScenarioGenerator {
    public Scenario getRandomScenario() {
        Random random = new Random();

        return getScenario1();
    }

    public Scenario getScenario1(){
        Scenario scenario = new Scenario();

        scenario.setScenarioDescription("TEST SCENARIO!!!! 4 loud teenagers walk in to the compartment playing music");
        scenario.addOption("Ignore");
        scenario.addOption("Fight");
        scenario.addOption("talk to them");
        scenario.addOption("call police");

        scenario.setEffectedEmotionType(EmotionType.ANGRY);
        scenario.addConsequence(-1);
        scenario.addConsequence(-3);
        scenario.addConsequence(3);
        scenario.addConsequence(-2);

        //Bar
        scenario.addCompartmentMultiplier(1);
        //music
        scenario.addCompartmentMultiplier(0);
        //first class
        scenario.addCompartmentMultiplier(2);
        //second class
        scenario.addCompartmentMultiplier(1);
        //silent
        scenario.addCompartmentMultiplier(3);

        return scenario;
    }
}
