package com.singletonpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Entities.Pais;

public class Main {
    public static void main(String[] args) {
        List<Pais> paises = new ArrayList<>();
        List<String> clientes = new ArrayList<>();
        int opcion = 0;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("1. Crear Cliente");
            System.out.println("2. Salir");

            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese nombre del cliente");
                    String nombre = scan.nextLine();

                    System.out.println("Selecciones de la siguente lista el pais del cliente");
                    Pais.mostrarPaises(paises);
                    break;
            
                default:
                    break;
            }

        }while(opcion != 2);

    }
}