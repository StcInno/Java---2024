package ru.innopolis.java.basic_3_2_ABSTRACT.functional.square;

public class Main {
    public static void main(String[] args) {
        Square lambdaSquare = (U) -> U * U;
        System.out.println(lambdaSquare.calculateSquare(3));
    }
}
