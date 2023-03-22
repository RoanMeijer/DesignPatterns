package com.company.compartment;

import com.company.Compartment;

import java.time.Instant;

public class SecondClassCompartment implements Compartment {
    private long compartmentID;

    public SecondClassCompartment() {
        this.compartmentID = (long) Instant.now().toEpochMilli();
    }

    public long getCompartmentID() {
        return compartmentID;
    }
}
