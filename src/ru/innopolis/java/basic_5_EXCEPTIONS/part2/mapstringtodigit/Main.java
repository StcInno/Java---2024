package ru.innopolis.java.basic_5_EXCEPTIONS.part2.mapstringtodigit;

import java.util.Scanner;

/*
Преобразование строки в число
Напишите программу, которая запрашивает у пользователя строку и пытается преобразовать
её в число. Обработайте возможное исключение NumberFormatException, если строка не может
быть преобразована в число.
В блоке finally выведите сообщение "Попытка преобразования завершена".
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        try {
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            System.out.println("Преобразованное число: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Некорректный ввод числа.");
        } finally {
            System.out.println("Попытка преобразовать число завершена");
            scanner.close();
        }
    }
}
