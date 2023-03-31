package com.company.state;

import com.company.Game;

import java.util.ArrayList;

public class EndState  extends State {
    private final ArrayList<String> options;

    public EndState() {
        options = new ArrayList<>();
        options.add("Quit game");
        options.add("Try Again");
        options.add("");
        options.add("");
    }

    @Override
    public void pressButton1(Game game) {

    }

    @Override
    public void pressButton2(Game game) {

    }

    @Override
    public void pressButton3(Game game) {

    }

    @Override
    public void pressButton4(Game game) {

    }

    public ArrayList<String> getOptions() {
        return this.options;
    }
}
