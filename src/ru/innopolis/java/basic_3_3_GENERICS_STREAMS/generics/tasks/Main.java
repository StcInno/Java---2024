package ru.innopolis.java.basic_3_3_GENERICS_STREAMS.generics.tasks;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Boolean> booleanList = new ArrayList<>();
        booleanList.add(true);
        booleanList.add(true);
        booleanList.add(false);
        System.out.println(ListElementCount.countElements(booleanList, true));
    }
}
