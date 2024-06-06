package ru.innopolis.java.basic1_8;

import java.io.Serializable;
import java.util.Objects;

public class Human implements IHuman, Cloneable, Serializable, Runnable {
    private String firstName;
    private String lastName;
    protected Double salary;

    protected void calculateSalary(){

    }


    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human employee)) return false;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String getFirstName() {
        return "";
    }

    @Override
    public String getLastName() {
        return "";
    }

    @Override
    public void run() {

    }
}
