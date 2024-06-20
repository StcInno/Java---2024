package ru.innopolis.java.basic2_3;

public class Animal {
    public void makeSound() {
        System.out.println("Некий общий животный звук");
    }

    public void eat() {
        System.out.println("Животное кушоет");
    }

    public void eat(String food) {
        System.out.println("Животное кушоет " + food);
    }
}
