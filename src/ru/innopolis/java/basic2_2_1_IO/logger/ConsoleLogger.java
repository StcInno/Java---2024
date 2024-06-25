package ru.innopolis.java.basic2_2_1_IO.logger;

public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
