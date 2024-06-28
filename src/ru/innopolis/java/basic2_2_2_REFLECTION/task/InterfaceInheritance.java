package ru.innopolis.java.basic2_2_2_REFLECTION.task;

import java.util.ArrayList;
import java.util.List;

/*
Написать метод, который с помощью рефлексии получит все интерфейсы класса,
включая интерфейсы от классов-родителей и интерфейсов-родителей.
 */
public class InterfaceInheritance {

    interface A {

    }

    interface B {

    }

    interface C {

    }

    interface D extends A, B {

    }

    interface E extends C, D {

    }

    class Cl1 implements A {

    }

    class Cl2 extends Cl1 implements E {

    }


    public static void main(String[] args) {
        List<Class<?>> interfaces = getAllInterfaces(Cl2.class);
        for (Class<?> c : interfaces) {
            System.out.println(c.getName());
        }
    }

    private static List<Class<?>> getAllInterfaces(Class<Cl2> cls) {
        if (cls == null) {
            return null;
        } else {
            List<Class<?>> interfaces = new ArrayList<>();
            getAllInterfacesOfParents(cls, interfaces);
            return interfaces;
        }
    }

    private static void getAllInterfacesOfParents(Class<?> cls, List<Class<?>> foundInterfaces) {
        while (cls != null) {
            Class<?>[] interfaces = cls.getInterfaces();
            for (Class<?> anInterface : interfaces) {
                if (!foundInterfaces.contains(anInterface)) {
                    foundInterfaces.add(anInterface);
                    getAllInterfacesOfParents(anInterface, foundInterfaces);
                }
            }
            cls = cls.getSuperclass();
        }
    }
}
