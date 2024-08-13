package org.example;

public class Task {
    private int task_Id;
    private String Description;
    private String due_date;
    private boolean completed;

    public Task(int task_Id, String description, String due_date, boolean completed) {
        this.task_Id = task_Id;
        Description = description;
        this.due_date = due_date;
        this.completed = completed;
    }

    public Task() {
    }

    public int getTaskId() {
        return task_Id;
    }

    public void setTaskId(int taskId) {
        this.task_Id = taskId;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + task_Id +
                ", Description='" + Description + '\'' +
                ", due_date='" + due_date + '\'' +
                ", completed=" + completed +
                '}';
    }
}
