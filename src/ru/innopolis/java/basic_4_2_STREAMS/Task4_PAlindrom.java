package ru.innopolis.java.basic_4_2_STREAMS;

/*
Проверить, является ли текст палиндром.
Из исходной строки с помощью стримов убрать все символы,
не являющиеся цифрой или буквой, привести к нижнему регистру.
 */
public class Task4_PAlindrom {
    public static void main(String[] args) {
        System.out.println(isPalidrome(",aB121ba,"));
    }

    private static boolean isPalidrome(final String str) {
        StringBuilder leftToRight = new StringBuilder();

        str.chars()
                .filter(Character::isLetterOrDigit)
                .map(Character::toLowerCase)
                .forEach(leftToRight::appendCodePoint);
        System.out.println("leftToRight: " + leftToRight);
        StringBuilder rightToLeft = new StringBuilder(leftToRight).reverse();
        return rightToLeft.toString().equals(leftToRight.toString());
    }
}
