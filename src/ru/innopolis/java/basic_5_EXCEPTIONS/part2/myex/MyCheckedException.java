package ru.innopolis.java.basic_5_EXCEPTIONS.part2.myex;

import ru.innopolis.java.basic_5_EXCEPTIONS.part2.MyException;

public class MyCheckedException extends Exception {
    private static final String MY_ERROR = "Моя ошибка";

    public MyCheckedException(final String message) {
        super(message);
    }

    public MyCheckedException() {
        super(MY_ERROR);
    }
}
