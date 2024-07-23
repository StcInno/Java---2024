package ru.innopolis.java.basic_4_3_ITERATORS_COMPARATORS.iter.task2;

import java.util.Iterator;
import java.util.List;

/*
Фильтрация элементов с помощью Iterator
Описание: Создайте итератор, который будет итерироваться только по четным числам
из переданного списка.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Iterator<Integer> iterator = new EvenNumberIterator(numbers);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
