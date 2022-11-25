package com.exercice.logic.exercices;

import java.util.Locale;
import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        System.out.println("Informe quantas pessoas serão cadastradas:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        String[] names = new String[n];
        int[] ages = new int[n];
        double[] heights = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i+1) + "a Pessoa:");
            input.nextLine();
            System.out.print("Nome: ");
            names[i] = input.nextLine();
            System.out.print("Idade: ");
            ages[i] = input.nextInt();
            System.out.print("Altura: ");
            heights[i] = input.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += heights[i];
        }
        System.out.println("Altura média: " + sum / n);

        double cont = 0;
        for (int i = 0; i < n; i++) {
            if (ages[i] < 16) {
                cont++;
            }
        }
        System.out.println("Porcentagem de pessoas menor que 16: " + (cont * 100 / n));

        for (int i = 0; i < n; i++) {
            if (ages[i] < 16) {
                System.out.println(names[i]);
            }
        }
    }
}
