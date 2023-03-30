package com.company;

import com.company.compartment.Compartment;
import com.company.emotion.EmotionType;

import java.util.HashMap;

public class Option {
    String description;
    EmotionType outcomeType;
    int outcomeValue;
    HashMap<Compartment, Integer> specialCase;

    public Option() {
        this.specialCase = new HashMap<>();
    }
}
