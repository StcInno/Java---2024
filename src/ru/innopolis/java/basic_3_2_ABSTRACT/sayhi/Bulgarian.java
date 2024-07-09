package ru.innopolis.java.basic_3_2_ABSTRACT.sayhi;

public class Bulgarian extends BasePerson {
    public Bulgarian(final String name) {
        super(name);
    }

    @Override
    public String sayHi() {
        return "Здравей!";
    }
}
