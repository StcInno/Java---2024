package ru.innopolis.java.basic_3_2_ABSTRACT.sayhi;

public class Chinese extends BasePerson {
    public Chinese(final String name) {
        super(name);
    }

    @Override
    public String sayHi() {
        return "你好";
    }
}
