package ru.innopolis.java.basic_3_2_ABSTRACT.sayhi;

public class European extends BasePerson {
    public European(final String name) {
        super(name);
    }

    @Override
    public String sayHi() {
        return "Hello!";
    }
}
