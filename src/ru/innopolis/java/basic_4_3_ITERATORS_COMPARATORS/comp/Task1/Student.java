package ru.innopolis.java.basic_4_3_ITERATORS_COMPARATORS.comp.Task1;

import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class Student {
    private String name;
    private String surName;
    private int[] grades;

    public Student(String name, String surName, int... grades) {
        this.name = name;
        this.surName = surName;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        fillGrades(grades);
    }

    // cредний балл студента
    public double getAverageGrade() {
        return IntStream.of(grades).average().orElseThrow(NoSuchElementException::new);
    }

    private void fillGrades(int[] grades) {
        this.grades = new int[10];
        if (grades.length == this.grades.length) {
            this.grades = grades;
        } else if (grades.length < this.grades.length) {
            System.arraycopy(grades, 0, this.grades, 10 - grades.length, grades.length);
        } else {
            System.arraycopy(grades, grades.length - 10, this.grades, 0, this.grades.length);
        }

    }


}
