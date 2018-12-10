package sample.Interfaces;

import sample.Entities.Employee;

import java.util.List;

public interface EmployeeInterface {


    void createEmployeeTable();

    void insert(Employee employee);

    Employee selectById(int id);

    List<Employee> selectAll();

    void delete(int id);

    void update(Employee employee, int id);


}
