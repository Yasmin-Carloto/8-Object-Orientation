package org.maisprati.abstraction.employeesManagement.classes;

import org.maisprati.abstraction.employeesManagement.Employee;

public class Developer extends Employee {
    public Developer(String name, double wage) {
        super(name, wage, 0.2);
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
