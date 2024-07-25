package ru.innopolis.java.basic_5_EXCEPTIONS.part1;

import ru.innopolis.java.basic_3_3_GENERICS_STREAMS.generics.example.model.User;

import java.io.FileNotFoundException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        int upperNumber = 4;
//        int downNumber = 0;
//        System.out.println("Result: " + (upperNumber / downNumber));

//        int[] resultArray = new int[2];
//        resultArray[2] = 0;
        test1();
        try {
            test();
        } catch (ArithmeticException | FileNotFoundException e) {
//            try {
//                throw new Exception("Сработало исключение с ошибкой: " + e.getMessage());
//            } catch (Exception e1) {
//
//            }
        }
//        catch ( e) {
//            System.out.println("FNE: " + e.getMessage());
//        }

        try {
            test1();
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            test1();
            test();
        } catch (Exception e) {

        }
    }

    private static void test() throws ArithmeticException, FileNotFoundException {
        System.out.println(4 / 0);
    }

    private static void test1() {
        int[] resultArray = new int[2];
        resultArray[2] = 0;
    }

}
