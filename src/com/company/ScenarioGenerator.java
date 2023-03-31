package com.company;

import com.company.emotion.EmotionType;
import com.company.state.State;

import java.util.ArrayList;
import java.util.Random;

public class ScenarioGenerator {
    public Scenario getRandomScenario() {
        Random random = new Random();
        switch (random.nextInt(11)) {
            case 2:
                return getScenario2();
            case 3:
                return getScenario3();
            case 4:
                return getScenario4();
            case 5:
                return getScenario5();
            case 6:
                return getScenario6();
            case 7:
                return getScenario7();
            case 8:
                return getScenario8();
            case 9:
                return getScenario9();
            case 10:
                return getScenario10();
            default:
                return getScenario1();
        }
    }

    private Scenario getScenario1(){
        Scenario scenario = new Scenario();

        scenario.setScenarioDescription("4 loud teenagers walk in to the compartment playing music");
        scenario.addOption("Ignore");
        scenario.addOption("Fight");
        scenario.addOption("Talk to them");
        scenario.addOption("Call police");

        scenario.setEffectedEmotionType(EmotionType.HAPPY);
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

    private Scenario getScenario2(){
        Scenario scenario = new Scenario();

        scenario.setScenarioDescription("The child next to you start crying");
        scenario.addOption("Ignore");
        scenario.addOption("Put on a headset");
        scenario.addOption("Talk to the mother");
        scenario.addOption("Give the child candy");

        scenario.setEffectedEmotionType(EmotionType.HAPPY);
        scenario.addConsequence(-2);
        scenario.addConsequence(2);
        scenario.addConsequence(0);
        scenario.addConsequence(1);

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

    private Scenario getScenario3(){
        Scenario scenario = new Scenario();

        scenario.setScenarioDescription("The person next you farts");
        scenario.addOption("Ignore");
        scenario.addOption("Fart back");
        scenario.addOption("Talk to the farter");
        scenario.addOption("Change seat");

        scenario.setEffectedEmotionType(EmotionType.HAPPY);
        scenario.addConsequence(-1);
        scenario.addConsequence(2);
        scenario.addConsequence(-1);
        scenario.addConsequence(-1);

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

    private Scenario getScenario4(){
        Scenario scenario = new Scenario();

        scenario.setScenarioDescription("You get a call from an anonymous caller");
        scenario.addOption("Ignore");
        scenario.addOption("Take the call");
        scenario.addOption("Block the number");
        scenario.addOption("Throw your phone out of the window");

        scenario.setEffectedEmotionType(EmotionType.STRESSED);
        scenario.addConsequence(1);
        scenario.addConsequence(3);
        scenario.addConsequence(1);
        scenario.addConsequence(-10);

        //Bar
        scenario.addCompartmentMultiplier(1);
        //music
        scenario.addCompartmentMultiplier(1);
        //first class
        scenario.addCompartmentMultiplier(2);
        //second class
        scenario.addCompartmentMultiplier(1);
        //silent
        scenario.addCompartmentMultiplier(3);

        return scenario;
    }

    private Scenario getScenario5(){
        Scenario scenario = new Scenario();

        scenario.setScenarioDescription("The conductor asks for your ticket but you can't find it");
        scenario.addOption("Ignore");
        scenario.addOption("Explain the situation");
        scenario.addOption("Try and talk your way out of it");
        scenario.addOption("Buy a new ticket");

        scenario.setEffectedEmotionType(EmotionType.STRESSED);
        scenario.addConsequence(100);
        scenario.addConsequence(3);
        scenario.addConsequence(5);
        scenario.addConsequence(1);

        //Bar
        scenario.addCompartmentMultiplier(1);
        //music
        scenario.addCompartmentMultiplier(1);
        //first class
        scenario.addCompartmentMultiplier(1);
        //second class
        scenario.addCompartmentMultiplier(1);
        //silent
        scenario.addCompartmentMultiplier(3);

        return scenario;
    }

    private Scenario getScenario6(){
        Scenario scenario = new Scenario();

        scenario.setScenarioDescription("A burning hot cup of coffee gets spilled all over legs");
        scenario.addOption("Ignore");
        scenario.addOption("Get angry at the person who spilled the coffee");
        scenario.addOption("Throw back your own coffee");
        scenario.addOption("Take of your pants");

        scenario.setEffectedEmotionType(EmotionType.ANGRY);
        scenario.addConsequence(100);
        scenario.addConsequence(3);
        scenario.addConsequence(1);
        scenario.addConsequence(3);

        //Bar
        scenario.addCompartmentMultiplier(0);
        //music
        scenario.addCompartmentMultiplier(2);
        //first class
        scenario.addCompartmentMultiplier(2);
        //second class
        scenario.addCompartmentMultiplier(2);
        //silent
        scenario.addCompartmentMultiplier(2);

        return scenario;
    }

    private Scenario getScenario7(){
        Scenario scenario = new Scenario();

        scenario.setScenarioDescription("Your bag gets stolen");
        scenario.addOption("Ignore");
        scenario.addOption("Call the police");
        scenario.addOption("Also steal a bag");
        scenario.addOption("Try to chase the thief");

        scenario.setEffectedEmotionType(EmotionType.ANGRY);
        scenario.addConsequence(1);
        scenario.addConsequence(-1);
        scenario.addConsequence(-3);
        scenario.addConsequence(3);

        //Bar
        scenario.addCompartmentMultiplier(1);
        //music
        scenario.addCompartmentMultiplier(1);
        //first class
        scenario.addCompartmentMultiplier(2);
        //second class
        scenario.addCompartmentMultiplier(1);
        //silent
        scenario.addCompartmentMultiplier(1);

        return scenario;
    }

    private Scenario getScenario8(){
        Scenario scenario = new Scenario();

        scenario.setScenarioDescription("You take a bite out of your sandwich. Turns out it has gone bad");
        scenario.addOption("Ignore, you're hungry");
        scenario.addOption("Throw the sandwich in the trash");
        scenario.addOption("Steal a fresh sandwich from the child next to you");
        scenario.addOption("Gift the sandwich to the person next to you");

        scenario.setEffectedEmotionType(EmotionType.HAPPY);
        scenario.addConsequence(-3);
        scenario.addConsequence(-1);
        scenario.addConsequence(3);
        scenario.addConsequence(5);

        //Bar
        scenario.addCompartmentMultiplier(1);
        //music
        scenario.addCompartmentMultiplier(1);
        //first class
        scenario.addCompartmentMultiplier(1);
        //second class
        scenario.addCompartmentMultiplier(1);
        //silent
        scenario.addCompartmentMultiplier(1);

        return scenario;
    }

    private Scenario getScenario9(){
        Scenario scenario = new Scenario();

        scenario.setScenarioDescription("You need to go to the toilet but there is no toilet in the train");
        scenario.addOption("Ignore");
        scenario.addOption("Pee you pants");
        scenario.addOption("Pee in the corner of the compartment");
        scenario.addOption("Pee in a bottle");

        scenario.setEffectedEmotionType(EmotionType.HAPPY);
        scenario.addConsequence(-3);
        scenario.addConsequence(-3);
        scenario.addConsequence(-2);
        scenario.addConsequence(1);

        //Bar
        scenario.addCompartmentMultiplier(0);
        //music
        scenario.addCompartmentMultiplier(1);
        //first class
        scenario.addCompartmentMultiplier(3);
        //second class
        scenario.addCompartmentMultiplier(1);
        //silent
        scenario.addCompartmentMultiplier(2);

        return scenario;
    }

    private Scenario getScenario10(){
        Scenario scenario = new Scenario();

        scenario.setScenarioDescription("The child next to you pulls the emergency brake");
        scenario.addOption("Ignore");
        scenario.addOption("You smack the child");
        scenario.addOption("Talk angerly to the child");
        scenario.addOption("Help the conductors kick the child of the train");

        scenario.setEffectedEmotionType(EmotionType.ANGRY);
        scenario.addConsequence(5);
        scenario.addConsequence(-5);
        scenario.addConsequence(3);
        scenario.addConsequence(-1);

        //Bar
        scenario.addCompartmentMultiplier(1);
        //music
        scenario.addCompartmentMultiplier(1);
        //first class
        scenario.addCompartmentMultiplier(1);
        //second class
        scenario.addCompartmentMultiplier(1);
        //silent
        scenario.addCompartmentMultiplier(1);

        return scenario;
    }
}
