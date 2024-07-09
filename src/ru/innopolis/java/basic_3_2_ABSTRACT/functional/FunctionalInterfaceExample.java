package ru.innopolis.java.basic_3_2_ABSTRACT.functional;

// SAM (Single Abstract Method) before Java 8
public class FunctionalInterfaceExample {

    public static void main(String[] args) {
        // анонимный класс
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("я только что реализовал функциональный интерфейс");
            }
        }).start();

        // SAM => (<parameters>) -> lambda body
        new Thread(() -> System.out.println("Привет из нового функционального интерфейса!")).start();
    }
}
