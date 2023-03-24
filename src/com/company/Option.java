package com.company;

import com.company.compartment.Compartment;
import com.company.emotion.Emotion;

import java.util.HashMap;

public class Option {
    String description;
    Emotion outcomeType;
    int outcomeValue;
    HashMap<Compartment,int> specialCase;

}
