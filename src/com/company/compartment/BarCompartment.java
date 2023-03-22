package com.company.compartment;

import com.company.Compartment;

import java.time.Instant;

public class BarCompartment implements Compartment {
    private long compartmentID;

    public BarCompartment() {
        this.compartmentID = (long) Instant.now().toEpochMilli();
    }

    public long getCompartmentID() {
        return compartmentID;
    }
}
