package ru.innopolis.java.basic_3_2_ABSTRACT.functional.pivalue;

public class Main {
    public static void main(String[] args) {
        PiInterface piInterface = () -> Math.PI;

        System.out.println(piInterface.getPiValue());
    }
}
