package ru.innopolis.java.basic_4_3_ITERATORS_COMPARATORS.iter.task1;

/*
Реализовать собственный класс, который будет являться "коллекцией", по которой можно итерироваться
 */
public class Task1 {
    public static void main(String[] args) {
        NumberCollection numberCollection = new NumberCollection(5);
        for (int num : numberCollection) {
            System.out.println(num);
        }
    }
}
