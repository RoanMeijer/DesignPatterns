package com.company;

import com.company.compartmentFactory.BarCompartmentFactory;
import com.company.compartmentFactory.FirstClassCompartmentFactory;
import com.company.passenger.*;
import com.company.state.GameState;
import com.company.state.StartState;
import com.company.state.State;

public class Game {
    private State currentState;
    private Train train;
    private Passenger passenger;
    GameDialog gameDialog;
    KeyboardHandler keyboardHandler;

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
        // Create a random amount and selection of compartments
        this.train.addCompartment(BarCompartmentFactory.createCompartment());
        this.train.addCompartment(FirstClassCompartmentFactory.createCompartment());
    }

    public State getCurrentState(){
        return currentState;
    }

    public void setCurrentState(State state) {
        this.currentState = state;
    }
}
