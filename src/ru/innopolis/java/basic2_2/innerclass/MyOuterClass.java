package ru.innopolis.java.basic2_2.innerclass;

public class MyOuterClass {
    private final String outerField = "OUTER STRING";

    public static class InnerClass {
        private final String innerString = "INNER STRING!";

        public void printInner() {
            System.out.println(innerString);
        }
    }

    public void printOuter() {
        System.out.println(outerField);
    }
}
