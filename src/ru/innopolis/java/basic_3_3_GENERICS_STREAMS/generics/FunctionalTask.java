package ru.innopolis.java.basic_3_3_GENERICS_STREAMS.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FunctionalTask {
    public static void main(String[] args) {
        List<String> places = List.of("Непал, Катманду", "Россия, Эльбрус", "Россия, Козельск", "Россия, Байкал", "Тайланд, Бангкок");

        places.stream()
                .filter((place) -> place.startsWith("Россия"))
                .map((place) -> place.toUpperCase())
                .sorted()
                .forEach((place) -> System.out.println(place));

    }
}
