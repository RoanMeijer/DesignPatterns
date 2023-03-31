package com.company;

import com.company.compartment.Compartment;

import java.util.ArrayList;
import java.util.Random;

public class Train {
    private ArrayList<Compartment> compartments;
    private TrainNotifier trainNotifier = new TrainNotifier();

    public Train() {
        this.compartments = new ArrayList<>();
    }

    public ArrayList<Compartment> getCompartments() {
        return this.compartments;
    }

    public void addCompartment(Compartment compartment) {
        this.compartments.add(compartment);
    }

    public void removeCompartment(Compartment compartment) {
        this.compartments.remove(compartment);
    }

    public TrainNotifier getTrainNotifier(){
        return this.trainNotifier;
    }

    public void checkTime(){
        Random random = new Random();
        switch (random.nextInt(10)){
            case 1:
                trainNotifier.notifyListeners("late");
                break;
            case 2:
                trainNotifier.notifyListeners("early");
                break;
        }
    }
}
