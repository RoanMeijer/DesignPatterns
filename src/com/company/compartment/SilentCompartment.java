package com.company.compartment;

import java.time.Instant;

public class SilentCompartment implements Compartment {
    private long compartmentID;

    public SilentCompartment() {
        this.compartmentID = (long) Instant.now().toEpochMilli();
    }

    public long getCompartmentID() {
        return compartmentID;
    }
}
