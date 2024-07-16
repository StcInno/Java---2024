package ru.innopolis.java.basic_4_1_COLLECTIONS_PART1;

import java.util.*;

public class MyPersonalList {
    static List<String> myList = new ArrayList<>();

    public static void main(String[] args) {
        myList.add("one");
        myList.add("two");
        myList.add("three");
        System.out.println(myList);


        Iterator<String> stringIterator = myList.iterator();
        while (stringIterator.hasNext()) {
            String str = stringIterator.next();
            if (str.equalsIgnoreCase("one")) {
                stringIterator.remove();
            }
        }
        System.out.println(myList);

        Optional<String> value = getSmth("two");
        String valueString = value.orElseThrow(() -> new IllegalArgumentException(""));
//        for (String str : myList) {
//            if (str.equalsIgnoreCase("one")) {
//                myList.remove(str);
//            }
//        }

        Set<String> set = new TreeSet<String>();
        set.add("Дмитрий");
        set.add("Влад");
        set.add("Илдус");
        set.add("Айсылу");
        set.add("Виктория");
        set.add("Илдус");
        set.remove("Влад");
        System.out.println(set);
    }

    static Optional<String> getSmth(String value) {
        return Optional.of(myList.contains("one") ? "one" : "");
    }
}
