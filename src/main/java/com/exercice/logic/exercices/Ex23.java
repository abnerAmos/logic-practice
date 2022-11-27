package com.exercice.logic.exercices;

import java.util.Locale;
import java.util.Scanner;

public class Ex23 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        System.out.println("Informe X numeros para calculo:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] pairs = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Informe um numero: ");
            pairs[i] = input.nextInt();
        }

        int sum = 0;
        int count = 0;
        for (int e : pairs) {
            if (e % 2 == 0) {
                sum += e;
                count++;
            }
        }

        if (sum == 0) {
            System.out.println("Nenhum numero Par");
        } else {
            System.out.println("Média de numeros pares: " + (sum / count));
        }
    }
}
