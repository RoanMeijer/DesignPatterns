package com.company.compartment;

import java.time.Instant;

public class FirstClassCompartment implements Compartment {
    private long compartmentID;

    public FirstClassCompartment() {
        this.compartmentID = (long) Instant.now().toEpochMilli();
    }

    public long getCompartmentID() {
        return compartmentID;
    }
}
