package ru.innopolis.java.basic1_7.example1;

import static ru.innopolis.java.basic1_7.example1.Constants.DEFAULT_BULB_COUNT;

public class Chandelier {
    private Bulb[] bulbs;
    private static final Integer DEFAULT_BULB_COUNT = 3;

    public Chandelier(int countOfBulbs) {
        bulbs = new Bulb[countOfBulbs];
        for (int i = 0; i < countOfBulbs; i++) {
            bulbs[i] = new Bulb();
        }
    }

    public Chandelier() {
        this(DEFAULT_BULB_COUNT);
    }

    public void turnOn() {
        for (Bulb bulb : bulbs) {
            bulb.turnOn();
        }
    }

    public void turnOn(int count) {
        for (int i = 0; i <= count; i++) {
            bulbs[i].turnOn();
        }
    }

    public void turnOff() {
        for (Bulb bulb : bulbs) {
            bulb.turnOff();
        }
    }

    public boolean isShining() {
        return bulbs[0].isShining();
    }

}
