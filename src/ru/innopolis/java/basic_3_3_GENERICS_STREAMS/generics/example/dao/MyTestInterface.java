package ru.innopolis.java.basic_3_3_GENERICS_STREAMS.generics.example.dao;

import ru.innopolis.java.basic_3_3_GENERICS_STREAMS.generics.example.model.Human;

import java.util.List;

public interface MyTestInterface<T> { //extends Human

    T getById();

    List<T> getAllData();

    void saveData(T newData);

    void delete(T dataToDelete);

    List<T> getAllDataByNameContainsIgnoreCase(final String name);
}
