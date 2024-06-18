package ru.innopolis.java.basic2_2;

public class CollegeStudent extends Student {
    public CollegeStudent(String name, String secondName, School school) {
        super(name, secondName, school);
    }

    public CollegeStudent(String name) {
        super(name);
    }

    @Override
    protected int getTotalSalary() {
        return 100;
    }
}
