package ru.innopolis.java.basic_3_2_ABSTRACT.generics.pair;


public class Pair<T> {
    public T first;
    public T second;

    public void print() {
        System.out.println("First: " + first + "; Second: " + second);
    }

    public T getFirst() {
        return this.first;
    }

    public void setFirst(T first) {
        this.first = first;
    }
}
