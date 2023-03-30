package com.company;

import java.time.LocalDateTime;

public class Ticket {
    private String destination;
    private String origin;
    private LocalDateTime date;
    private boolean firstClass;
    private float price;

    public Ticket() {

    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getOrigin() {
        return this.origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public boolean getFirstClass() {
        return this.firstClass;
    }

    public void setFirstClass(boolean firstClass) {
        this.firstClass = firstClass;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
