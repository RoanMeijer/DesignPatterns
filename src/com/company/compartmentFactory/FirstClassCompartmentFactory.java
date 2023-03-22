package com.company.compartmentFactory;

import com.company.compartment.Compartment;
import com.company.compartment.FirstClassCompartment;

public class FirstClassCompartmentFactory extends CompartmentFactory{

    Compartment createCompartment() {
        return new FirstClassCompartment();
    }
}
