package org.maisprati.abstraction.employeesManagement;

abstract public class Employee {
    protected String name;
    protected double wage;
    protected double bonus;

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

    public Employee(String name, double wage, double bonus) {
        this.name = name;
        this.wage = wage;
        this.bonus = bonus;
    }

    abstract public double calculateBonus();

    abstract public double calculateWage();

    public void promoteEmployee(EmployeePositions newPosition){
        if(newPosition == EmployeePositions.Developer){
            this.wage = 3.000;
            this.bonus = 0.2;
        } else if(newPosition == EmployeePositions.Manager){
            this.wage = 2.500;
            this.bonus = 0.1;
        }

        System.out.println(this.name + " was a " + this.getClass().getSimpleName() + " and now is a " + newPosition);
    }
}
