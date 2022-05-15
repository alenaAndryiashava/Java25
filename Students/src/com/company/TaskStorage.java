package com.company;

import java.util.ArrayList;
import java.util.List;

public class TaskStorage {
    private List<Task> assignedTasks;
    private List<Task> completeTasks;

    public TaskStorage() {
        this.assignedTasks = new ArrayList<>();
        this.completeTasks = new ArrayList<>();
    }

    public void assignTask(Task task) {
        this.assignedTasks.add(task);
    }

    public List<Task> getAssignedTasks() {
        return this.assignedTasks;
    }

    public void completeTask(Task task){
        this.completeTasks.add(task);
    }

    public List<Task> getCompleteTasks() {
        return this.completeTasks;
    }
}
