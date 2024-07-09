package ru.innopolis.java.basic_3_2_ABSTRACT.sayhi;

public abstract class BasePerson implements Person {
    protected final String name;

    public BasePerson(final String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

//    public void setName(final String name) {
//        this.name = name;
//    }

}
