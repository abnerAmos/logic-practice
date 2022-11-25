package com.exercice.logic.exercices;

import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {

        System.out.println("Informe X numeros para o calculo:");
        Scanner input = new Scanner(System.in);
        int numbers = input.nextInt();

        int[] pair = new int[numbers];

        for (int i = 0; i < numbers; i++) {
            System.out.print("Informe um numero: ");
            pair[i] = input.nextInt();
            }

        int cont = 0;
        System.out.print("\nNumeros pares: ");
        for (int i = 0; i < numbers; i++) {
            if (pair[i] % 2 == 0) {
                System.out.print(pair[i] + " ");
                cont++;
            }
        }

        System.out.println("\nQuantidade de numeros pares: " + cont);

    }
}
