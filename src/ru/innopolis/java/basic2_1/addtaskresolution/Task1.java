package ru.innopolis.java.basic2_1.addtaskresolution;

import java.util.Set;
import java.util.TreeSet;

/*
Задача с собеседований
На вход подается строка, которая состоит из маленьких латинских букв.
Проверить, что в строке встречаются все символы английского алфавита ХОТЯ БЫ ОДИН РАЗ!
   asdsadqdwe -> false
   qwertyuiopasdfghjklzxcvbnmljhjqenb -> true
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println(checkString("asdsadqdwe"));
        System.out.println(checkString("qwertyuiopasdfghjklzxcvbnmljhjqenb"));
    }

    private static boolean checkString(final String input) {
        if (input.length() < 26) {
            return false;
        }
        Set<Character> characters = new TreeSet<>();
        for (char ch : input.toCharArray()) {
            characters.add(ch);
        }
        return characters.size() == 26;
    }
}
