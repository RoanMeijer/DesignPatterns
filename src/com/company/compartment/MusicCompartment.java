package com.company.compartment;

import java.time.Instant;

public class MusicCompartment implements Compartment {
    private long compartmentID;

    public MusicCompartment() {
        this.compartmentID = (long) Instant.now().toEpochMilli();
    }

    public long getCompartmentID() {
        return compartmentID;
    }
}
