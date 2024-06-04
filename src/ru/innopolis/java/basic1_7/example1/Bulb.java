package ru.innopolis.java.basic1_7.example1;

// класс лампочка
public class Bulb {
    private boolean toggle;

    public Bulb() {
        this.toggle = false;
    }

    public Bulb(boolean toggle) {
        this.toggle = toggle;
    }

    public boolean isShining() {
        return this.toggle;
    }

//    public void setToggle(boolean toggle) {
//        this.toggle = toggle;
//    }

    public void turnOn() {
        this.toggle = true;
    }

    public void turnOff() {
        this.toggle = false;
    }
}
