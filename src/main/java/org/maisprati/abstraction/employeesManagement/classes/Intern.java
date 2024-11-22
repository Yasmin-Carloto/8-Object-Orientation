package org.maisprati.abstraction.employeesManagement.classes;

import org.maisprati.abstraction.employeesManagement.Employee;

public class Intern extends Employee {
    public Intern(String name, double wage) {
        super(name, wage, 0.05);
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
