package org.maisprati.abstraction.employeesManagement.classes;

import org.maisprati.abstraction.employeesManagement.Employee;

public class Manager extends Employee {
    public Manager(String name, double wage) {
        super(name, wage, 0.1);
    }

    @Override
    public double calculateBonus() {
        return this.wage * this.bonus;
    }

    @Override
    public double calculateWage() {
        return this.wage + calculateBonus();
    }
}
