package ru.innopolis.java.basic_4_2_STREAMS;

import java.util.stream.IntStream;

/*
Посчитать сумму четных чисел в промежутке от 1 до 100 включительно и вывести ее на экран.
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 100)
                .filter(num -> num % 2 == 0)
                .sum());
        //.reduce(0, Integer::sum);

        System.out.println(
                IntStream.iterate(2, m -> (m + 2))
                        .limit(50)
                        .sum()
        );
    }
}
