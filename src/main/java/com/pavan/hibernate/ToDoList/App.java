package com.pavan.hibernate.ToDoList;

import com.pavan.hibernate.ToDoList.Entity.Task;
import com.pavan.hibernate.ToDoList.Entity.TaskService;

public class App {
    public static void main(String[] args) {
        TaskService taskService = new TaskService();

        // CREATE
       taskService.createTask("Learn Hibernate", false, "2025-05-15");

        // READ
        Task task = taskService.getTask(3);
        System.out.println("Retrieved Task: " + task);

        // UPDATE
       taskService.updateTask(1, "Learn Hibernate - Updated", true);

        // DELETE
       taskService.deleteTask(1);

        taskService.close();
    }
}
