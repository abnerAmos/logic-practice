package com.exercice.logic.exercices;

import java.util.Scanner;

public class Ex19 {

    public static void main(String[] args) {

        System.out.println("Informe X numeros para digitar:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Informe um numero: ");
            vector[i] = input.nextInt();
        }

        int aux = 0;
        int position = 0;
        for (int i = 0; i < n; i++) {
            if (vector[i] > aux) {
                aux = vector[i];
                position = i+1;
            }
        }
        System.out.println("\nMaior numero da lista: " + aux);
        System.out.println("Posição do maior numero: " + position);
    }
}
