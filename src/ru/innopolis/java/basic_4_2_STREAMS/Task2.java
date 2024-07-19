package ru.innopolis.java.basic_4_2_STREAMS;

import java.util.List;
import java.util.stream.Stream;

/*
На вход подается список целых чисел.
Необходимо вывести результат перемножения этих чисел.
Например, если на вход передали List.of(1, 2, 3, 4, 5),
то результатом должно быть число 120 (т.к. 1 * 2 * 3 * 4 * 5 = 120).
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println(List.of(1, 2, 3, 4, 5).stream().reduce(1, (mul, i) -> mul * i));
        System.out.println(Stream.of(1, 2, 3, 4, 5).reduce(1, (mul, i) -> mul * i));
    }
}
