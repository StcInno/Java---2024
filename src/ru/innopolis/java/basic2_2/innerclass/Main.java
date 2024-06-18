package ru.innopolis.java.basic2_2.innerclass;

public class Main {
    public static void main(String[] args) {
        MyOuterClass myOuterClass = new MyOuterClass();
        myOuterClass.printOuter();

        MyOuterClass.InnerClass innerClass = new MyOuterClass.InnerClass();
        innerClass.printInner();
    }
}
