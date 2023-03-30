package com.company.compartmentFactory;

import com.company.compartment.Compartment;
import com.company.compartment.SilentCompartment;

public class SilentCompartmentFactory extends CompartmentFactory{

     public static Compartment createCompartment() {
        return new SilentCompartment();
    }
}
