package ru.innopolis.java.basic_5_EXCEPTIONS.part2.mapstringtodigit;

import java.util.Scanner;

/*
Работа с массивом
Напишите программу, которая создает массив из 5 элементов и запрашивает у пользователя индекс для доступа к элементу массива.
Обработайте возможное исключение ArrayIndexOutOfBoundsException, если индекс выходит за пределы массива.
В блоке finally выведите сообщение "Операция с массивом завершена".
 */
public class ArrayExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите индекс элемента: ");
            int index = scanner.nextInt();
            System.out.println("Элемент массива с индексом " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Введен некорректный индекс. Значений по такому индексу нет");
        } finally {
            System.out.println("Операция с массивом завершена");
            scanner.close();
        }
    }
}
