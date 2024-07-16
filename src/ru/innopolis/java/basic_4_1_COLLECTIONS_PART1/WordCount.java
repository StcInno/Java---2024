package ru.innopolis.java.basic_4_1_COLLECTIONS_PART1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("слон");
        strings.add("слон");
        strings.add("слон");
        strings.add("кот");
        strings.add("кот");
        strings.add("мышь");
        strings.add("аист");

        System.out.println(getWordsCount(strings));

        // 2ое решение
        Set<String> uniqueSet = new HashSet<>(strings);
        for (String key : uniqueSet) {
            System.out.println(key + ": " + Collections.frequency(strings, key));
        }

        // 3ее решение
        Map<String, Long> resultMap = strings.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(resultMap);

        /*
        select name, count(*)
        from my_table
        group by name;

        Function.identity(): Andrei -> Andrei
        1 row: Andrei 1
        2 row: Andrei 1
        3 row: Andrei 1
        4 row: Kris 1
        5 row: Anton 1
         ->
        1 row: Andrei 3
        2 row: Kris 1
        3 row: Anton 1
         */
    }

    private static Map<String, Integer> getWordsCount(List<String> strings) {
        Map<String, Integer> myMap = new HashMap<>();
        for (String str : strings) {
            int counter = 1;
            if (myMap.containsKey(str)) {
                counter = myMap.get(str);
                counter++;
            }
            myMap.put(str, counter);
        }
        return myMap;
    }
}
