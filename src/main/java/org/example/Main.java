package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static final String FINAL_PATH = "TaskFile.json";
    static List<Task> tasks_list = new ArrayList<>();
    static ObjectMapper objectMapper = new ObjectMapper();
    Scanner input = new Scanner(System.in);

    static List<Task> addTask(Task t) {
        tasks_list.add(t);
        return tasks_list;

    }

    static List<Task> readFile() {
        try {
            List<Task> tasks = objectMapper.readValue(new File(FINAL_PATH), new TypeReference<List<Task>>() {
            });
            return tasks;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    static List<Task> updateTask(List<Task> data, int task_id, Scanner input) {




        return null;

    }

    static void writeToJson(List<Task> list) {
        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(FINAL_PATH), list);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void deleteTask(List<Task> tasks_list, int id) {


        for (Task t : tasks_list) {
            if (t.getTaskId() == id) {
                tasks_list.remove(t);
                writeToJson(tasks_list);
                break;
            }
        }

    }


    public static void main(String[] args) throws RuntimeException {


        boolean flag = true;
        Scanner input = new Scanner(System.in);

        tasks_list = readFile();


        while (flag) {
            System.out.println("1. Add a new task");
            System.out.println("2. View all tasks");
            System.out.println("3. Update the task");
            System.out.println("4. Delete the task");


            int choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the Task_Id ");
                    int task_Id = input.nextInt();
                    input.nextLine();
                    System.out.println("Enter the Task Description ");
                    String description = input.nextLine();
                    System.out.println("Enter the Due Date");
                    String due_Date = input.nextLine();

                    Task task = new Task(task_Id, description, due_Date, false);
                    writeToJson(addTask(task));


                }
                case 2 -> {
                    System.out.println(readFile());
                }
                case 3 -> {
                    int id = 0;
                    updateTask(readFile(), id, input);
                }
                case 4 -> {
                    System.out.println("enter id");
                    deleteTask(tasks_list, input.nextInt());
                }


            }


        }
//        System.out.println(emp);


    }
}