package ru.innopolis.java.basic1_8;

public class Driver extends Employee {

    @Override
    protected void calculateSalary() {
        super.calculateSalary();
        salary = super.salary * 1.5;
    }
}
