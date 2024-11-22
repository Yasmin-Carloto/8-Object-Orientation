package org.maisprati.inheritance;

public class Employee {
    protected String name;
    protected double wage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public Employee(String name, double wage) {
        this.name = name;
        this.wage = wage;
    }

    //calcularBonus()
    public double calculateBonus(){
        return 0;
    }

    // trabalhar()
    public void toWork(){
        System.out.println();
    }
}
