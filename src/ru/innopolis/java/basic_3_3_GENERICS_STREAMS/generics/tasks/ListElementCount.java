package ru.innopolis.java.basic_3_3_GENERICS_STREAMS.generics.tasks;

import java.util.List;

// реализовать метод, который считает количество элементов в переданном списке
public class ListElementCount {
    public static <T> int countElements(List<T> inputList, T element) {
        int counter = 0;
        for (T elem : inputList) {
            if (elem.equals(element)) {
                ++counter;
            }
        }
        return counter;
    }

//    List<? extends List<String>> myTest() {
//        List<? extends String> myList = List.of("", "12d");
//        return myList;
//    }
}
