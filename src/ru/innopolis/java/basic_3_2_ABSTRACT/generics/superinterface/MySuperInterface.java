package ru.innopolis.java.basic_3_2_ABSTRACT.generics.superinterface;

@FunctionalInterface
public interface MySuperInterface<T> {
    T func(T value);
}
