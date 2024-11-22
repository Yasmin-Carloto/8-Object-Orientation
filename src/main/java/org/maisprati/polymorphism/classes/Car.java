package org.maisprati.polymorphism.classes;

import org.maisprati.polymorphism.ITransportation;

public class Car implements ITransportation {
    @Override
    public void acelerate() {
        System.out.println("Car is acelerating!");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking!");
    }
}
