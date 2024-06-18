package ru.innopolis.java.basic2_2;

public class Student extends Person {
    protected School school;

    public Student(final String name,
                   final String secondName,
                   final School school) {
        super(name, secondName);
        this.school = school;
    }

    public Student(final String name) {
        super(name, "");
    }
}
