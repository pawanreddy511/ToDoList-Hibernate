package com.pavan.hibernate.ToDoList.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TaskService {
	
	
	private SessionFactory sessionFactory;

    public TaskService() {
        sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Task.class)
                .buildSessionFactory();
    }

    public void createTask(String title, boolean completed, String time) {
        Session session = sessionFactory.openSession();
        Task task = new Task(title, completed, time);
        try {
            session.beginTransaction();
            session.persist(task);
            session.getTransaction().commit();
            System.out.println("Task saved: " + task);
        } finally {
            session.close();
        }
    }

    public Task getTask(int id) {
        Session session = sessionFactory.openSession();
        Task task = null;
        try {
            session.beginTransaction();
            task = session.get(Task.class, id);
            session.getTransaction().commit();
        } finally {
            session.close();
        }
        return task;
    }

    public void updateTask(int id, String newTitle, boolean completed) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            Task taskToUpdate = session.get(Task.class, id);
            if (taskToUpdate != null) {
                taskToUpdate.setTitle(newTitle);
                taskToUpdate.setCompleted(completed);
                session.getTransaction().commit();
                System.out.println("Task updated: " + taskToUpdate);
            }
        } finally {
            session.close();
        }
    }

    public void deleteTask(int id) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            Task taskToDelete = session.get(Task.class, id);
            if (taskToDelete != null) {
                session.delete(taskToDelete);
                session.getTransaction().commit();
                System.out.println("Task deleted: ID = " + id);
            }
        } finally {
            session.close();
        }
    }

    public void close() {
        sessionFactory.close();
    }

}
