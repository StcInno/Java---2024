package ru.innopolis.java.basic_4_2_STREAMS;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputStringList = Arrays.asList(
                scanner.nextLine().split("\\s+"));

        inputStringList.stream()
                .filter(str -> !Objects.equals(str, "asd"))
//                .map(inputString -> inputString.toUpperCase())
                .map(String::toUpperCase)
//                .collect(Collectors.toSet())
                .forEach(upperCasedString -> System.out.print(upperCasedString + " "));
    }
}
