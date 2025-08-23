package com.task.manager.model;

import java.time.LocalDate;

public class Task {
    private static int counter = 1;

    private int id;
    private String course;
    private String description;
    private LocalDate dueDate;
    private boolean completed;

    public Task(String course, String description, LocalDate dueDate) {
        this.id = counter++;
        this.course = course;
        this.description = description;
        this.dueDate = dueDate;
        this.completed = false;
    }

    public int getId() { return id; }
    public String getCourse() { return course; }
    public String getDescription() { return description; }
    public LocalDate getDueDate() { return dueDate; }
    public boolean isCompleted() { return completed; }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s - %s (Entrega: %s) %s",
                id, course, description, dueDate,
                completed ? "[COMPLETADA]" : "");
    }
}
