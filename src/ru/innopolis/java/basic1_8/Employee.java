package ru.innopolis.java.basic1_8;

public class Employee extends Human {
    protected String position;
    protected String company;

    @Override
    protected void calculateSalary() {
        salary = Double.parseDouble(position) * 2;
    }

}
