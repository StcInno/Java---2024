package ru.innopolis.java.basic1_6;

import java.util.Scanner;

/*
На вход два числа.
Нужно написать аналог функции swap.
(Менять местами значения двух параметров).
P.S.
Без использования дополнительных переменных.

Входные данные:
a = 8; b = 10;
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Ваши входные два числа: a => " + a + "; b => " + b);

        a = a + b; // 8 + 10 = 18
        b = a - b; // 18 - 10 = 8
        a = a - b; // 18 - 8 = 10

        System.out.println("Результат перестановки: a => " + a + "; b => " + b);
    }
}
