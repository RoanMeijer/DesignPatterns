package com.company.state;

import com.company.Game;
import com.company.Option;

import java.util.ArrayList;

abstract public class State {
    String situationDescription;
    ArrayList<Option> options;

    public abstract void pressButton1(Game game);
    public abstract void pressButton2(Game game);
    public abstract void pressButton3(Game game);
    public abstract void pressButton4(Game game);
}
