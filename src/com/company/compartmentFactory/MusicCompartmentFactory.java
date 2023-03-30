package com.company.compartmentFactory;

import com.company.compartment.Compartment;
import com.company.compartment.MusicCompartment;

public class MusicCompartmentFactory extends CompartmentFactory{

    public static Compartment createCompartment() {
        return new MusicCompartment();
    }
}
