package ru.innopolis.java.basic_3_2_ABSTRACT.sayhi;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Person european = new European("Adam");
        Person bulgarian = new Bulgarian("Ivan");
        Person chinese = new Chinese("Li");


        System.out.println(european.getName() + " говорит нам " + european.sayHi());
        System.out.println(bulgarian.getName() + " говорит нам " + bulgarian.sayHi());
        System.out.println(chinese.getName() + " говорит нам " + chinese.sayHi());
    }
}
