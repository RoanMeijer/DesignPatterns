package com.company;

import java.util.ArrayList;

public class Train {
    private ArrayList<Compartment> compartments;
    private ArrayList<Subscriber> subscribers;

    public Train() {

    }

    public void subscribe() {

    }

    public void unsubscribe() {

    }

    public void notifySubscribers() {

    }

    public ArrayList<Subscriber> getSubscribers() {
        return this.subscribers;
    }

    public void addSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
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
}
