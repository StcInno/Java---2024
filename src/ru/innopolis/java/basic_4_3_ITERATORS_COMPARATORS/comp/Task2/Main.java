package ru.innopolis.java.basic_4_3_ITERATORS_COMPARATORS.comp.Task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Andrei", 33),
                new Employee("Ivan", 25),
                new Employee("Kris", 20)
        );

        employees.sort(Comparator.comparingInt(Employee::getAge));
        employees.forEach(System.out::println);
    }
}
