package ru.innopolis.java.basic2_2.innerclass;

public class MyOuterClass {
    private final String outerField = "OUTER STRING";

    static class InnerClass {
        private final String innerString = "INNER STRING!";

        static class InnerInnerClass {
            private final String NEW_STRING = "Hello!";

            public void printInnerInner() {
                System.out.println(NEW_STRING);
            }
        }

        public void printInner() {
            System.out.println(innerString);
        }
    }

    public void printOuter() {
        System.out.println(outerField);
    }
}
