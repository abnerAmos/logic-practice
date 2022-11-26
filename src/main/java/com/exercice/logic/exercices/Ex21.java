package com.exercice.logic.exercices;

import java.util.Locale;
import java.util.Scanner;

public class Ex21 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        System.out.println("Informe X médias para calculo");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        double[] vector = new double[n];
        double average = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Informe a " + (i+1) + "a média: ");
            vector[i] = input.nextDouble();
            average += vector[i];
        }

        average = average / n;
        System.out.print("\nMédia do vetor: " + average);

        System.out.println("\nElementos abaixo de média:");
        for (int i = 0; i < n; i++) {
            if (vector[i] < average) {
                System.out.println(vector[i]);
            }
        }
    }
}
