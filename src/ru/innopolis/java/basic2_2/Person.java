package ru.innopolis.java.basic2_2;

public class Person {
    protected String firstName;
    protected String secondName;
    protected int salary;

    public Person(final String name,
                  final String secondName) {
        this.firstName = name;
        this.secondName = secondName;
    }

    protected int getTotalSalary() {
        return this.salary * 100;
    }

}
