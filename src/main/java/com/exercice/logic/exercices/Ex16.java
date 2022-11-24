package com.exercice.logic.exercices;

import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {

        System.out.println("Informe quantos numeros vai digitar:");
        Scanner input = new Scanner(System.in);
        int numbers = input.nextInt();
        double[] vector = new double[numbers];

        System.out.println("Digite numeros sequencialmente:");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = input.nextDouble();
        }

        System.out.println("Valores totais: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ", ");
        }

        double sum = 0;
        for (int i = 0; i < vector.length; i++) {
            sum += vector[i];
        }
        System.out.println("\nSoma dos valores: " + sum);

        System.out.print("Média dos valores: " + (sum / numbers));
    }
}
