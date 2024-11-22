package org.maisprati.polymorphism.classes;

import org.maisprati.polymorphism.ITransportation;

public class Train implements ITransportation {
    @Override
    public void acelerate() {
        System.out.println("Train is acelerating!");
    }

    @Override
    public void brake() {
        System.out.println("Train is braking!");
    }
}
