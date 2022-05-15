package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TaskScheduleTest {
    Teacher teacher = new Teacher("Teacher");
    Task task1 = new Task("Task 1",1);
    Task task2 = new Task("Task 2", 2);
    Task task3 = new Task("Task 3",3);
    Student student1 = new Student("Student 2",1985,5.6);
    Student student2 = new Student("Student 2",1999,8.1);
    Student student3 = new Student("Student 2",1979,7.8);

    @Test
    void addNewTask() {
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        TaskStorage taskStorage = new TaskStorage();
        TaskSchedule taskSchedule = new TaskSchedule(teacher,students,taskStorage);
        taskSchedule.addNewTask(task1);
        taskSchedule.addNewTask(task2);
        taskSchedule.addNewTask(task3);

        List<Task> expected = Arrays.asList(task1, task2, task3);
        Assertions.assertEquals(expected, taskStorage.getAssignedTasks());
    }

    @Test
    void notifyComplete() {
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        TaskStorage taskStorage = new TaskStorage();
        TaskSchedule taskSchedule = new TaskSchedule(teacher,students,taskStorage);
        taskSchedule.notifyComplete(task1);
        taskSchedule.notifyComplete(task2);
        taskSchedule.notifyComplete(task3);

        List<Task> expected = Arrays.asList(task1, task2, task3);
        Assertions.assertEquals(expected, taskStorage.getCompleteTasks());
    }
}