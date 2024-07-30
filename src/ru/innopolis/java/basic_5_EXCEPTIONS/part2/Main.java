package ru.innopolis.java.basic_5_EXCEPTIONS.part2;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws MyException {
        try {
            doSmth(null);
        } catch (FileNotFoundException e) {
            throw new MyException("Это мое бизнесовое исключение с моей ошибкой");
        }
    }

    /**
     * Мой метод!
     *
     * @param input мой входной параметр
     * @throws MyException исключение мое тоже!
     */
    public static void doSmth(final String input) throws FileNotFoundException {

    }

}
