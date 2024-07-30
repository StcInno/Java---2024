package ru.innopolis.java.basic_5_EXCEPTIONS.part2.myex;

public class Main {
    public static void main(String[] args) {
        try {
            methodZero(1);
        } catch (MyCheckedException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
    }

    public static void methodZero(int i) throws MyCheckedException {
        if (i == 0) {
            System.out.println("0");
        } else {
            throw new MyCheckedException("This is not a zero!");
        }
    }
}
