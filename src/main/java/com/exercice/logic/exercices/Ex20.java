package com.exercice.logic.exercices;

import java.util.Scanner;

public class Ex20 {

    public static void main(String[] args) {

        System.out.println("Informe X numeros para calculo:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] vectorA = new int[n];
        int[] vectorB = new int[n];
        int[] vectorC = new int[n];

        System.out.println("Informe os valores de A");
        for (int i = 0; i < n; i++) {
            vectorA[i] = input.nextInt();
        }

        System.out.println("Informe os valores de B");
        for (int i = 0; i < n; i++) {
            vectorB[i] = input.nextInt();
        }

        System.out.println("Soma dos Vetores:");
        for (int i = 0; i < n; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
            System.out.println(vectorC[i]);
        }
    }
}
