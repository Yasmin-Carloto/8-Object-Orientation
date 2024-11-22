package org.maisprati;

import org.maisprati.abstraction.employeesManagement.Employee;
import org.maisprati.abstraction.employeesManagement.EmployeePositions;
import org.maisprati.abstraction.employeesManagement.classes.Developer;
import org.maisprati.abstraction.employeesManagement.classes.Intern;
import org.maisprati.abstraction.employeesManagement.classes.Manager;
import org.maisprati.abstraction.employeesManagement.classes.Payroll;
import org.maisprati.abstraction.paymentWays.classes.CreditCard;
import org.maisprati.abstraction.paymentWays.classes.Pix;
import org.maisprati.abstraction.paymentWays.classes.Ticket;
import org.maisprati.abstraction.paymentWays.PaymentWays;
import org.maisprati.polymorphism.Animal;
import org.maisprati.polymorphism.ITransportation;
import org.maisprati.polymorphism.classes.*;

public class Main {
    public static void main(String[] args) {
        ITransportation[] transports = new ITransportation[3];
        transports[0] = new Car();
        transports[1] = new Bicycle();
        transports[2] = new Train();

        for(ITransportation transport: transports){
            System.out.println("Transporte: " + transport.getClass().getSimpleName());
            transport.acelerate();
            transport.brake();
            System.out.println();
        }

        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Cow();

        for(Animal animal: animals){
            System.out.println("Animal: " + animal.getClass().getSimpleName());
            animal.makeSound();
            System.out.println();
        }

        PaymentWays[] paymentWays = new PaymentWays[3];
        paymentWays[0] = new CreditCard("1111111111111111", "11/2024", "123");
        paymentWays[1] = new Ticket("222222222222222222222222222222222222222222222222");
        paymentWays[2] = new Pix("012.200.0");

        for (PaymentWays paymentWay : paymentWays){
            System.out.println("Payment way: " + paymentWay.getClass().getSimpleName());
            paymentWay.processPayment(12.4);
            System.out.println();
        }

        Payroll employees = new Payroll();

        Employee intern = new Intern("Yasmin", 1.000);
        Employee developer = new Developer("Daniel", 3.000);
        Employee manager = new Manager("Ingryd", 2.500);

        employees.addEmployee(intern);
        employees.addEmployee(developer);
        employees.addEmployee(manager);

        employees.calculateTotals();

        manager.promoteEmployee(EmployeePositions.Developer);
        employees.calculateTotals();
    }
}