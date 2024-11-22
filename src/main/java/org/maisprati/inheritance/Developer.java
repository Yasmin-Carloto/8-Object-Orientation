package org.maisprati.inheritance;

public class Developer extends Employee {

    public Developer(String name, double wage) {
        super(name, wage);
    }

    @Override
    public double calculateBonus(){
        return this.wage * 0.10;
    }

    @Override
    public void toWork(){
        System.out.println("Sou um dsenvolvedor(a) e estou codando em Java agora.");
    }
}
