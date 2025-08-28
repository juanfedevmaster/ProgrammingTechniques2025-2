/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.juanfedevmaster.EjercicioEnClaseArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jufeq
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<String> alimentosIngresados = new ArrayList<String>();
        ArrayList<String> alimentos = new ArrayList<String>();
        alimentos.add("Arroz");
        alimentos.add("Azucar");
        alimentos.add("Lechuga");
        alimentos.add("Repollo");
        alimentos.add("Pollo");
        alimentos.add("Pescado");
        alimentos.add("Pasta");
        alimentos.add("Carne");
        alimentos.add("Salmon");
        alimentos.add("Camarones");
        
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;

        while (flag == false) {

            System.out.println("Ingrese el siguiente alimento:");
            String alimentoIngresado = scanner.next();
            
            boolean alimentoValido = validarAlimentos(alimentoIngresado, alimentos);
            if (alimentoValido) {
               alimentosIngresados.add(alimentoIngresado);
            }

            flag = listaLlena(alimentosIngresados);
        }

    }

    public static boolean listaLlena(ArrayList<String> alimentosIngresados) {
        if (alimentosIngresados.size() == 10) {
            return true;
        }

        return false;

    }

    public static boolean validarAlimentos(String alimentoIngresado, 
            ArrayList<String> alimentos) {
        
        boolean existeAlimento = alimentos.contains(alimentoIngresado);
        return existeAlimento;
    }
}
