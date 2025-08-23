package com.task.manager.ui;

import com.task.manager.service.TaskManager;
import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleMenu {
    private TaskManager manager = new TaskManager();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        int option;
        do {
            showMenu();
            option = readInt("Seleccione una opción: ");
            handleOption(option);
        } while (option != 0);
    }

    private void showMenu() {
        System.out.println("\n=== Gestor de Tareas Académicas ===");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Listar tareas");
        System.out.println("3. Completar tarea");
        System.out.println("4. Eliminar tarea");
        System.out.println("0. Salir");
    }

    private void handleOption(int option) {
        switch (option) {
            case 1: addTask();
                break;
            case 2: listTasks();
                break;
            case 3: completeTask();
                break;
            case 4: deleteTask();
                break;
            case 0: System.out.println("Hasta luego.");
                break;
            default: System.out.println("Opción no válida.");
                break;
        }
    }

    private void addTask() {
        System.out.print("Curso: ");
        String course = scanner.nextLine();
        System.out.print("Descripción: ");
        String description = scanner.nextLine();
        System.out.print("Fecha de entrega (AAAA-MM-DD): ");
        LocalDate date = LocalDate.parse(scanner.nextLine());

        manager.addTask(course, description, date);
        System.out.println("Tarea agregada exitosamente.");
    }

    private void listTasks() {
        System.out.println("\n--- Lista de Tareas ---");
        manager.getAllTasks().forEach(System.out::println);
    }

    private void completeTask() {
        int id = readInt("ID de la tarea a completar: ");
        if (manager.markTaskAsCompleted(id)) {
            System.out.println("Tarea marcada como completada.");
        } else {
            System.out.println("No se encontró la tarea.");
        }
    }

    private void deleteTask() {
        int id = readInt("ID de la tarea a eliminar: ");
        if (manager.deleteTask(id)) {
            System.out.println("Tarea eliminada.");
        } else {
            System.out.println("No se encontró la tarea.");
        }
    }

    private int readInt(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Por favor, ingrese un número válido: ");
            scanner.next();
        }
        int value = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer
        return value;
    }
}

