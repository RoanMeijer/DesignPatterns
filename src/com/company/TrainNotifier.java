package com.company;

import java.util.ArrayList;

public class TrainNotifier {
    ArrayList<Subscriber> listeners;

    public TrainNotifier(){
        listeners = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber){
        this.listeners.add(subscriber);
    }

    public void unSubscriber(Subscriber subscriber){
        if(listeners.contains(subscriber)){
            listeners.remove(subscriber);
        }
    }

    public void notifyListeners(String event){
        for(int i = 0; i < listeners.size(); i++){
            listeners.get(i).update(event);
        }
    }
}
