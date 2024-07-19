package ru.innopolis.java.basic_4_2_STREAMS;

import java.util.List;

/*
На вход подается список строк. Необходимо вывести количество непустых строк в списке.
Например, для List.of("abc", "", "", "def", "qqq") результат равен 3.
 */
public class Task3 {
    public static void main(String[] args) {
        List<String> example = List.of("abc", "", "", "def", "qqq");
        System.out.println(example.stream().filter(str -> !str.isEmpty()).count());
    }
}
