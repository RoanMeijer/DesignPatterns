package com.company;

import com.company.emotion.EmotionType;

import java.util.ArrayList;

public class Scenario {
    private ArrayList<String> options;
    private ArrayList<Integer> consequences;
    private ArrayList<Integer> compartmentMultipliers;
    private EmotionType effectedEmotionType;
    private String scenarioDescription;

    public Scenario(){
        options = new ArrayList<>();
        consequences = new ArrayList<>();
        compartmentMultipliers = new ArrayList<>();
    }

    public void addOption(String option){
        this.options.add(option);
    }

    public void addConsequence(int consequence){
        this.consequences.add(consequence);
    }

    public void addCompartmentMultiplier(int compartmentMultiplier){
        this.compartmentMultipliers.add(compartmentMultiplier);
    }

    public void setEffectedEmotionType(EmotionType emotionType){
        this.effectedEmotionType = emotionType;
    }

    public void setScenarioDescription(String scenarioDescription){
        this.scenarioDescription = scenarioDescription;
    }

    public ArrayList<Integer> getCompartmentMultipliers(){
        return this.compartmentMultipliers;
    }

    public ArrayList<Integer> getConsequences(){
        return consequences;
    }

    public ArrayList<String> getOptions(){
        return this.options;
    }

    public EmotionType getEffectedEmotionType(){
        return this.effectedEmotionType;
    }

    public String getScenarioDescription(){
        return this.scenarioDescription;
    }
}
