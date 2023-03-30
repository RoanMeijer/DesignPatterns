package com.company.compartmentFactory;

import com.company.compartment.BarCompartment;
import com.company.compartment.Compartment;

public class BarCompartmentFactory extends CompartmentFactory{

    public static Compartment createCompartment() {
        return new BarCompartment();
    }
}
