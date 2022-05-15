package com.company;

public interface TaskNotifier {
    void addNewTask(Task task);
    void notifyComplete(Task task);
}
