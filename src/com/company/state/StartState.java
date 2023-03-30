package com.company.state;

import com.company.Game;
import com.company.passenger.Businessman;
import com.company.passenger.Grandma;
import com.company.passenger.Hooligan;
import com.company.passenger.Karen;

public class StartState extends State {
    @Override
    public void pressButton1(Game game) {
        game.setupPassenger(new Businessman("You"));
    }

    @Override
    public void pressButton2(Game game) {
        game.setupPassenger(new Grandma("You"));
    }

    @Override
    public void pressButton3(Game game) {
        game.setupPassenger(new Hooligan("You"));
    }

    @Override
    public void pressButton4(Game game) {
        game.setupPassenger(new Karen("You"));
    }
}
