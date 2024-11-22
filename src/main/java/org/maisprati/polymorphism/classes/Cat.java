package org.maisprati.polymorphism.classes;

import org.maisprati.polymorphism.Animal;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("MiauMiauMiau");
    }
}
