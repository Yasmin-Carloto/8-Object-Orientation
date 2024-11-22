package org.maisprati.abstraction.employeesManagement.classes;

import org.maisprati.abstraction.employeesManagement.Employee;

import java.util.ArrayList;

public class Payroll {
    ArrayList<Employee> employees;

    public Payroll(){
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void calculateTotals() {
        double totalWages = 0;
        double totalBonus = 0;

        for(Employee employee : employees){
            totalWages += employee.calculateWage();
            totalBonus += employee.calculateBonus();

            System.out.println("Employee: " + employee.getName());
            System.out.printf("Wage: %.2f %n", employee.getWage());
            System.out.printf("Bonus: %.2f %n", employee.calculateBonus());
            System.out.println();
        }

        System.out.println("Total wages: " + totalWages);
        System.out.printf("Total bonus: %.2f %n", totalBonus);
    }
}
