package com.task.manager.ui;

import com.task.manager.service.TaskManager;
import java.time.LocalDate;
import java.util.Scanner;

// Menú de consola para gestionar tareas académicas
public class ConsoleMenu {
    // Gestor de lógica de tareas
    private TaskManager manager = new TaskManager();
    // Scanner para entrada de usuario
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        // Bucle principal del menú
        int option;
        do {
            try {
                showMenu();
                option = readInt("Seleccione una opción: ");
                handleOption(option);
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
                option = 0; // Forzar salida en caso de error grave
            }
        } while (option != 0);
    }

    private void showMenu() {
    // Muestra las opciones del menú
    System.out.println("\n=== Gestor de Tareas Académicas ===");
    System.out.println("1. Agregar tarea");
    System.out.println("2. Listar tareas");
    System.out.println("3. Completar tarea");
    System.out.println("4. Eliminar tarea");
    System.out.println("0. Salir");
    }

    private void handleOption(int option) {
        // Ejecuta la acción según la opción elegida
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
        // Solicita datos y agrega una nueva tarea
        try {
            System.out.print("Curso: ");
            String course = scanner.nextLine();
            System.out.print("Descripción: ");
            String description = scanner.nextLine();
            System.out.print("Fecha de entrega (AAAA-MM-DD): ");
            LocalDate date = LocalDate.parse(scanner.nextLine());

            manager.addTask(course, description, date);
            System.out.println("Tarea agregada exitosamente.");
        } catch (Exception e) {
            System.out.println("Error al agregar la tarea: " + e.getMessage());
        }
    }

    private void listTasks() {
    // Muestra todas las tareas registradas
    System.out.println("\n--- Lista de Tareas ---");
    manager.getAllTasks().forEach(System.out::println);
    }

    private void completeTask() {
        // Marca una tarea como completada según su ID
        try {
            int id = readInt("ID de la tarea a completar: ");
            if (manager.markTaskAsCompleted(id)) {
                System.out.println("Tarea marcada como completada.");
            } else {
                System.out.println("No se encontró la tarea.");
            }
        } catch (Exception e) {
            System.out.println("Error al completar la tarea: " + e.getMessage());
        }
    }

    private void deleteTask() {
        // Elimina una tarea según su ID
        try {
            int id = readInt("ID de la tarea a eliminar: ");
            if (manager.deleteTask(id)) {
                System.out.println("Tarea eliminada.");
            } else {
                System.out.println("No se encontró la tarea.");
            }
        } catch (Exception e) {
            System.out.println("Error al eliminar la tarea: " + e.getMessage());
        }
    }

    private int readInt(String prompt) {
        // Lee un entero desde la entrada estándar
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

