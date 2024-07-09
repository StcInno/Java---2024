package ru.innopolis.java.basic_3_2_ABSTRACT.generics.superinterface;

public class Main {
    public static void main(String[] args) {
        MySuperInterface<String> reverseString = (str) -> new StringBuilder(str).reverse().toString();
        System.out.println(reverseString.func("HELLO!"));

        MySuperInterface<Integer> factorial = (n) -> {
            int res = 1;
            for (int i = 1; i <= n; i++) {
                res *= i;
            }
            return res;
        };
        System.out.println(factorial.func(5));
    }
}
