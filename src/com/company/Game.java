package com.company;

import com.company.compartment.BarCompartment;
import com.company.compartment.SilentCompartment;
import com.company.compartmentFactory.*;
import com.company.passenger.*;
import com.company.state.GameState;
import com.company.state.StartState;
import com.company.state.State;

import java.util.Random;

public class Game {
    private State currentState;
    private Train train;
    private Passenger passenger;
    private GameDialog gameDialog;
    private KeyboardHandler keyboardHandler;

    public void setupPassenger(Passenger passenger){
        this.passenger = passenger;
    }

    public void startSetupGame(){
        //setup helping classes
        this.gameDialog = new GameDialog();
        this.keyboardHandler = new KeyboardHandler(this);

        // Print banner
        gameDialog.PrintWelcomeMessage();

        //change state to the starting state
        this.currentState = new StartState();
        keyboardHandler.giveStateOptions();

        // When user choose character change state to game state
        setCurrentState(new GameState());
        setupTrain();
        startGame();
    }

    public void startGame() {
        gameDialog.printStartGameMessage();
    }

    public void setupTrain(){
        this.train = new Train();

        // Create a train containing 6 random compartments
        Random rand = new Random();
        for(int i = 0; i < 6; i++){
            switch (rand.nextInt(5)) {
                case 1 -> this.train.addCompartment(BarCompartmentFactory.createCompartment());
                case 2 -> this.train.addCompartment(FirstClassCompartmentFactory.createCompartment());
                case 3 -> this.train.addCompartment(MusicCompartmentFactory.createCompartment());
                case 4 -> this.train.addCompartment(SilentCompartmentFactory.createCompartment());
                default -> this.train.addCompartment(SecondClassCompartmentFactory.createCompartment());
            }
        }
    }

    public State getCurrentState(){
        return currentState;
    }

    public void setCurrentState(State state) {
        this.currentState = state;
    }

    private void startGameLoop(){
        //gameLength is the number of itterations the game does
        int gameLength = 5;

        for(int i = 0; i < gameLength; i++){

        }
    }
}
