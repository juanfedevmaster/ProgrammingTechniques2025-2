/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.juanfedevmaster.interviewexam;

/**
 *
 * @author jufeq
 */
public class InterviewExam {

    public static void main(String[] args) {
        int matriz[][] = new int[9][10];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                }
                if (i == j || i + j == matriz.length - 1) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }

            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.println("");
        }
    }
}
