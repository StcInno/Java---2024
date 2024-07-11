package ru.innopolis.java.basic_3_3_GENERICS_STREAMS.generics.example.service;

import ru.innopolis.java.basic_3_3_GENERICS_STREAMS.generics.example.dao.MyTestInterface;
import ru.innopolis.java.basic_3_3_GENERICS_STREAMS.generics.example.model.Dog;

import java.util.List;

public class DogService implements MyTestInterface<Dog> {
    @Override
    public Dog getById() {
        return null;
    }

    @Override
    public List<Dog> getAllData() {
        return List.of();
    }

    @Override
    public void saveData(Dog newData) {

    }

    @Override
    public void delete(Dog dataToDelete) {

    }

    @Override
    public List<Dog> getAllDataByNameContainsIgnoreCase(String name) {
        return List.of();
    }
}
