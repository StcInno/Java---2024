package ru.innopolis.java.basic_4_3_ITERATORS_COMPARATORS.comp.Task1;


import java.util.Arrays;
import java.util.Comparator;

public class StudentService {
    public Student bestStudent(Student[] students) {
        double maxAverage = students[0].getAverageGrade();
        int indexOfMax = 0;
        for (int i = 1; i < students.length; i++) {
            if (students[i].getAverageGrade() > maxAverage) {
                maxAverage = students[i].getAverageGrade();
                indexOfMax = i;
            }
        }
        return students[indexOfMax];
    }

    public Student[] sortByStudentSurname(Student[] students) {
        Arrays.sort(students, Comparator.comparing(Student::getSurName));
        return students;
    }

}
