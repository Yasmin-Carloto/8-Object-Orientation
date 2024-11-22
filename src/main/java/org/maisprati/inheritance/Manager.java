package org.maisprati.inheritance;

public class Manager extends Employee {
    public Manager(String name, double wage) {
        super(name, wage);
    }

    @Override
    public double calculateBonus(){
        return this.wage * 0.20;
    }

    @Override
    public void toWork(){
        System.out.println("Sou um gerente e gerencio um grupo de desenvolvedores.");
    }
}
