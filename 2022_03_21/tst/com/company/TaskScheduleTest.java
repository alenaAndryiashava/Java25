package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskScheduleTest {
    QAEngineer qaEngineer = new QAEngineer(1,"Pavlov", 1200);
    BackEndProgrammer backEndProgrammer = new BackEndProgrammer(2,"Sergeev", 1300);
    FrontEndProgrammer frontEndProgrammer = new FrontEndProgrammer(3,"Vasilev", 1400);
    Task task1 = new Task(1,"in progress", "task 1");
    Task task2 = new Task(2,"canceled", "task 2");
    Task task3 = new Task(3,"in progress", "task 3");

    @Test
    void assign() {
        TaskSchedule taskSchedule = new TaskSchedule();
        taskSchedule.assign(qaEngineer.getId(), task1.getId());
        taskSchedule.assign(qaEngineer.getId(), task2.getId());
        taskSchedule.assign(frontEndProgrammer.getId(), task1.getId());
        taskSchedule.assign(frontEndProgrammer.getId(), task1.getId());

        Assertions.assertTrue(taskSchedule.isAssigned(qaEngineer.getId(), task1.getId()));
        Assertions.assertTrue(taskSchedule.isAssigned(qaEngineer.getId(), task2.getId()));
        Assertions.assertTrue(taskSchedule.isAssigned(frontEndProgrammer.getId(), task1.getId()));
        Assertions.assertFalse(taskSchedule.isAssigned(frontEndProgrammer.getId(), task2.getId()));
        Assertions.assertFalse(taskSchedule.isAssigned(backEndProgrammer.getId(), task3.getId()));
    }

    @Test
    void getTasks() {
        TaskSchedule taskSchedule = new TaskSchedule();
        taskSchedule.assign(qaEngineer.getId(), task1.getId());
        taskSchedule.assign(qaEngineer.getId(), task2.getId());
        taskSchedule.assign(qaEngineer.getId(), task3.getId());

        Integer[] expected = {task1.getId(), task2.getId(), task3.getId()};
        Integer[] actual = taskSchedule.getTasks(qaEngineer.getId());
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void getEmployees() {
        TaskSchedule taskSchedule = new TaskSchedule();
        taskSchedule.assign(qaEngineer.getId(), task1.getId());
        taskSchedule.assign(backEndProgrammer.getId(), task1.getId());
        taskSchedule.assign(frontEndProgrammer.getId(), task1.getId());

        Integer[] expected = {qaEngineer.getId(), backEndProgrammer.getId(), frontEndProgrammer.getId()};
        Integer[] actual = taskSchedule.getEmployees(task1.getId());
        Assertions.assertArrayEquals(expected, actual);
    }
}