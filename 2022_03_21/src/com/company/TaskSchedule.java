package com.company;

import java.util.ArrayList;
import java.util.List;

public class TaskSchedule {
    private static class AssignedTask {
        public int employeeId;
        public int taskId;

        public AssignedTask(int employeeId, int taskId) {
            this.employeeId = employeeId;
            this.taskId = taskId;
        }
    }

    private List<AssignedTask> assignedTasks;

    public TaskSchedule() {
        this.assignedTasks = new ArrayList<>();
    }

    public void assign(int employeeId, int taskId) {
        int index = search(employeeId, taskId);
        if (index == -1) {
            assignedTasks.add(new AssignedTask(employeeId, taskId));
        }
    }

    public boolean isAssigned(int employeeId, int taskId) {
        return search(employeeId, taskId) != -1;
    }

    public Integer[] getTasks(int employeeId) {
        List<Integer> tasks = new ArrayList<>();
        for (AssignedTask assignedTask : assignedTasks) {
            if (assignedTask.employeeId == employeeId) {
                tasks.add(assignedTask.taskId);
            }
        }

        return tasks.toArray(new Integer[0]);
    }

    public Integer[] getEmployees(int taskId) {
        List<Integer> employees = new ArrayList<>();
        for (AssignedTask assignedTask : assignedTasks) {
            if (assignedTask.taskId == taskId) {
                employees.add(assignedTask.employeeId);
            }
        }

        return employees.toArray(new Integer[0]);
    }

    private int search(int employeeId, int taskId) {
        for (int i = 0; i < assignedTasks.size(); i++) {
            AssignedTask assignedTask = assignedTasks.get(i);
            if (assignedTask.employeeId == employeeId && assignedTask.taskId == taskId) {
                return i;
            }
        }

        return -1;
    }
}
