package ru.innopolis.java.basic2_2.innerclass;

public class Main {
    public static void main(String[] args) {
        MyOuterClass myOuterClass = new MyOuterClass();
        myOuterClass.printOuter();

        myOuterClass.getClass();

        MyOuterClass.InnerClass innerClass = new MyOuterClass.InnerClass();
        innerClass.printInner();

        MyOuterClass.InnerClass.InnerInnerClass innerInnerClass = new MyOuterClass.InnerClass.InnerInnerClass();
//        MyOuterClass.InnerClass i = new MyOuterClass().new InnerClass();
//        i.printInner();
    }
}
