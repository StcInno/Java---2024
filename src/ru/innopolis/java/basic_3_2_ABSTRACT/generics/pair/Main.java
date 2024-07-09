package ru.innopolis.java.basic_3_2_ABSTRACT.generics.pair;

public class Main {
    public static void main(String[] args) {
        Pair<Integer> pair = new Pair<>();
        pair.first = 2;
        pair.second = 1;
        pair.print();


        Pair<String> pair1 = new Pair<>();
        pair1.first = "2313";
        pair1.second = "1";
        pair1.print();
    }
}
