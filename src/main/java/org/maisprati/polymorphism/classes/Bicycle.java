package org.maisprati.polymorphism.classes;

import org.maisprati.polymorphism.ITransportation;

public class Bicycle implements ITransportation {
    @Override
    public void acelerate() {
        System.out.println("Bicycle is acelerating!");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle is braking!");
    }
}
