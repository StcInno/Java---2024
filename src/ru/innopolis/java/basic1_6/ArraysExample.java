package ru.innopolis.java.basic1_6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysExample {
    public static void main(String[] args) {
        int[] myArray = new int[]{5, 3, 1, 7, 4};
//        for (int i = 0; i < myArray.length; i++) {
//            System.out.println(myArray[i]);
//        }
        System.out.println(Arrays.toString(myArray));
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));

        String[] stringArray = new String[]{"A", "C", "Z", "E", "I", "D"};
//        Arrays.sort(stringArray);
        Arrays.sort(stringArray, 0, 3);
        System.out.println(Arrays.toString(stringArray));
        Arrays.sort(stringArray, 0, 3, Comparator.comparing(String::toString).reversed());
        System.out.println(Arrays.toString(stringArray));

        int k = 3;
        switch (k) {
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            default -> System.out.println("Smth else");
        }

//        while (true) {
//            System.out.println("Infinity");
//        }
//        for (String s : args) {
//
//        }
        List<String> strings = List.of("One", "Two", "Three");
//        var str = List.of("One", "Two", "Three");
//        val t = (“Scala”, “Java”, “Lama”)
        for (String s : strings) {
            System.out.println(s);
        }
        strings.forEach(System.out::println);

    }
}
