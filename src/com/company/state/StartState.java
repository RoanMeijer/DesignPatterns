package com.company.state;

import com.company.Game;
import com.company.passenger.Businessman;
import com.company.passenger.Grandma;
import com.company.passenger.Hooligan;
import com.company.passenger.Karen;

import java.util.ArrayList;

public class StartState extends State {
    private final ArrayList<String> options;

    public StartState() {
        options = new ArrayList<>();
        options.add("Businessman");
        options.add("Grandma");
        options.add("Hooligan");
        options.add("Karen");
    }

    @Override
    public void pressButton1(Game game) {
        game.setupPassenger(new Businessman("You"));

        //change state to the in game state
        game.setCurrentState(new GameState());
    }

    @Override
    public void pressButton2(Game game) {
        game.setupPassenger(new Grandma("You"));

        //change state to the in game state
        game.setCurrentState(new GameState());
    }

    @Override
    public void pressButton3(Game game) {
        game.setupPassenger(new Hooligan("You"));

        //change state to the in game state
        game.setCurrentState(new GameState());
    }

    @Override
    public void pressButton4(Game game) {
        game.setupPassenger(new Karen("You"));

        //change state to the in game state
        game.setCurrentState(new GameState());
    }

    @Override
    public ArrayList<String> getOptions() {
        return this.options;
    }
}
