package com.company.compartmentFactory;

import com.company.compartment.Compartment;
import com.company.compartment.SecondClassCompartment;

public class SecondClassCompartmentFactory extends CompartmentFactory{

     public static Compartment createCompartment() {
        return new SecondClassCompartment();
    }
}
