package ru.innopolis.java.basic_3_3_GENERICS_STREAMS.generics.example.model;

import ru.innopolis.java.basic_3_3_GENERICS_STREAMS.generics.example.dao.MyTestInterface;

import java.util.List;

public abstract class GenericClass<T extends Human> implements MyTestInterface<T> {
    @Override
    public T getById() {
        return null;
    }

    @Override
    public List<T> getAllData() {
        return List.of();
    }

    @Override
    public void saveData(T newData) {

    }

    @Override
    public void delete(T dataToDelete) {

    }

    @Override
    public List<T> getAllDataByNameContainsIgnoreCase(String name) {
        return List.of();
    }
}
