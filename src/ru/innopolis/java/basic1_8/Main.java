package ru.innopolis.java.basic1_8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Integer a = 4;
//        Integer b = 4;
//
//        Human employee1 = new Employee();
//        employee1.setFirstName("Andrei");
//        Employee employee2 = new Employee();
//        employee2.setFirstName("Andrei");
//
//        System.out.println(employee1.equals(employee2));
//        System.out.println(employee1 == employee2);
//        System.out.println(employee1);
//        System.out.println(employee2);
//        String str1 = "TopJava";
//        String str2 = "TopJava";
//        String str3 = (new String("TopJava")).intern();
//        String str4 = (new String("TopJava")).intern();
//
//        System.out.println("Строка 1 равна строке 2 ? " + (str1 == str2));
//        System.out.println("Строка 2 равна строке 3 ? " + (str2 == str3));
//        System.out.println("Строка 3 равна строке 4 ? " + (str3 == str4));

        String s = "123;123;234;567;8900345";
        String s1 = s.replaceAll(";", ":");
        String[] res = s1.split(":");
        System.out.println(Arrays.toString(res));

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("1").append("a");

    }

    static String reverseString(final String initialString) {
        StringBuilder sb = new StringBuilder(initialString);
        return sb.reverse().toString();
    }
}
