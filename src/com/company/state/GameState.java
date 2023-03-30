package com.company.state;

import com.company.Game;

import java.util.ArrayList;

public class GameState extends State {
    private final ArrayList<String> options;

    public GameState() {
        options = new ArrayList<>();
        options.add("");
        options.add("");
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
