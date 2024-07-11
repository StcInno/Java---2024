package ru.innopolis.java.basic_3_3_GENERICS_STREAMS.generics.example.service;

import ru.innopolis.java.basic_3_3_GENERICS_STREAMS.generics.example.dao.MyTestInterface;
import ru.innopolis.java.basic_3_3_GENERICS_STREAMS.generics.example.model.Employee;

import java.util.List;

public class EmployeeService implements MyTestInterface<Employee> {

    @Override
    public Employee getById() {
        return null;
    }

    @Override
    public List<Employee> getAllData() {
        return List.of();
    }

    @Override
    public void saveData(Employee newData) {

    }

    @Override
    public void delete(Employee dataToDelete) {

    }

//    public Double calculateSalary(Employee employee) {
//        return employee.getSalary() * 6;
//    }

    @Override
    public List<Employee> getAllDataByNameContainsIgnoreCase(String name) {
        return List.of();
    }
}
