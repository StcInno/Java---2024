package ru.innopolis.java.basic_3_2_ABSTRACT.functional.reverse;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        ReverseInterface reverseInterface = (str) -> new StringBuilder(str).reverse().toString();

        System.out.println(reverseInterface.reverseString("LAMBDA"));

        ReverseInterface reverseInterface1 = (String str1) -> {
            StringBuilder stringBuilder = new StringBuilder(str1);
            return stringBuilder.reverse().toString();
        };
        System.out.println(reverseInterface1.reverseString("LAMBDA"));

        ReverseInterface reverseInterface2 = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println(reverseInterface2.reverseString("LAMBDA"));

    }
}
