package ru.innopolis.java.basic2_3;

public class Main {
    public static void main(String[] args) {
        Animal aDog = new Dog();
        Animal aCat = new Cat();
        Animal anAnimal = new Animal();

        aDog.makeSound();
        aCat.makeSound();
        anAnimal.makeSound();

        aDog.eat();
        aDog.eat("Косточку");

        System.out.println(anAnimal instanceof Dog);
    }
}
