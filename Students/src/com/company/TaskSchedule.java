package com.company;

import java.util.List;

public class TaskSchedule implements TaskNotifier{
    Teacher teacher;
    List<Student> students;
    TaskStorage taskStorage;

    public TaskSchedule(Teacher teacher, List<Student> students, TaskStorage taskStorage) {
        this.teacher = teacher;
        this.students = students;
        this.taskStorage = taskStorage;
    }

    @Override
    public void addNewTask(Task task) {
        taskStorage.assignTask(task);
        for (Student student:students){
            student.handleEvent(task);
        }
    }
    @Override
    public void notifyComplete(Task task) {
        taskStorage.completeTask(task);
        teacher.handleEvent(task);
    }
}
