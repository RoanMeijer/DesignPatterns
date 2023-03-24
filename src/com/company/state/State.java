package com.company.state;

import com.company.Option;

import java.util.ArrayList;

abstract public class State {
    String situationDescption;
    ArrayList<Option> options;

    public abstract void pressButton1();
    public abstract void pressButton2();
    public abstract void pressButton3();
    public abstract void pressButton4();
}
