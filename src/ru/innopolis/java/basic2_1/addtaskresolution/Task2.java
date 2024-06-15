package ru.innopolis.java.basic2_1.addtaskresolution;

/*
Напишите метод проверки, является ли строка палиндромом (в обе стороны читается одинаково строка)
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println(isPalidrome(",aB121ba,"));
    }

    private static boolean isPalidrome(final String input) {
        StringBuilder leftToRight = new StringBuilder();
        input.chars()
                .filter(Character::isLetterOrDigit)
                .map(Character::toLowerCase)
                .forEach(leftToRight::appendCodePoint);
        System.out.println("leftToRight: " + leftToRight);
        StringBuilder rightToLeft = new StringBuilder(leftToRight).reverse();
        return leftToRight.toString().contentEquals(rightToLeft);
    }
}
