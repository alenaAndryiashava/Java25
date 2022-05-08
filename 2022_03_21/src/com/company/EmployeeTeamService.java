package com.company;

import java.util.List;

public interface EmployeeTeamService {

    void add(Employee employee);

    Employee getEmployee(int index);

    void remove(int index);

    void remove (Employee employee);
    int size();
}
