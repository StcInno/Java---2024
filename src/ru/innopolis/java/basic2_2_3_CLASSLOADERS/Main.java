package ru.innopolis.java.basic2_2_3_CLASSLOADERS;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        try {
            // получаем системный ClassLoader текущего класса
            ClassLoader classLoader = Main.class.getClassLoader();
            // Загружаем класс 'Example' с помощью classLoader
            Class<?> exampleClass = classLoader.loadClass("ru.innopolis.java.basic2_2_3_CLASSLOADERS.Example");
            // Создаем экземпляр класса
            Object exampleInstance = exampleClass.getDeclaredConstructor().newInstance();
            // вызываем метод sayHello у нашего класса
            exampleClass.getMethod("sayHello").invoke(exampleInstance);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
