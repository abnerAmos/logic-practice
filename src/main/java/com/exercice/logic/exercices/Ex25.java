package com.exercice.logic.exercices;

import java.util.Locale;
import java.util.Scanner;

public class Ex25 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        System.out.println("Informe a quantidade de alunos:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        String[] name = new String[n];
        double[] noteOne = new double[n];
        double[] noteTwo = new double[n];

        System.out.println("\nDigite os dados dos Alunos:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nome: ");
            input.nextLine();
            name[i] = input.nextLine();
            System.out.print("Primeira Nota: ");
            noteOne[i] = input.nextDouble();
            System.out.print("Segunda Nota: ");
            noteTwo[i] = input.nextDouble();
        }

        double[] average = new double[n];
        for (int i = 0; i < n; i++) {
            average[i] = (noteOne[i] + noteTwo[i]) / 2.0;
        }

        System.out.println("\nAlunos Aprovados:");
        for (int i = 0; i < n; i++) {
            if (average[i] > 6.0) {
                System.out.println(name[i]);
            }
        }
    }
}
