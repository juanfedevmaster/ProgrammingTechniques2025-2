/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.juanfedevmaster.ejercicioenclasearray;

import java.util.Scanner;

/**
 *
 * @author jufeq
 */
public class EjercicioEnClaseArray {

    public static boolean validarAlimentos(String alimentoIngresado) {
        String alimentos[] = new String[10];
        alimentos[0] = "Arroz";
        alimentos[1] = "Azucar";
        alimentos[2] = "Lechuga";
        alimentos[3] = "Repollo";
        alimentos[4] = "Pollo";
        alimentos[5] = "Pescado";
        alimentos[6] = "Pasta";
        alimentos[7] = "Carne";
        alimentos[8] = "Salmon";
        alimentos[9] = "Camarones";

        for (int i = 0; i < alimentos.length; i++) {
            if (alimentoIngresado.equals(alimentos[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean listaLlena(String alimentosIngresados[]) {
        for (int i = 0; i <= alimentosIngresados.length; i++) {
            if (alimentosIngresados[i] == null) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String alimentosIngresados[] = new String[10];
        int posicion = 0;

        Scanner scanner = new Scanner(System.in);
        boolean flag = false;

        while (flag == false) {
            System.out.println("Ingrese el siguiente alimento:");
            String alimentoIngresado = scanner.next();

            boolean alimentoValido = validarAlimentos(alimentoIngresado);
            if (alimentoValido) {
                alimentosIngresados[posicion] = alimentoIngresado;
                posicion++;
            }

            flag = listaLlena(alimentosIngresados);
        }

        System.out.println("El arreglo se completo");

    }
}
