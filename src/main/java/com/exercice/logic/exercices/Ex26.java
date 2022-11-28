package com.exercice.logic.exercices;

import java.util.Locale;
import java.util.Scanner;

public class Ex26 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        System.out.println("Informe a quantidade de pessoas:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        double[] height = new double[n];
        String[] gender = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i + 1) + "a Pessoa: ");
            height[i] = input.nextDouble();
            System.out.print("Genero: ");
            input.nextLine();
            gender[i] = input.nextLine();
        }

        double aux = 0;
        for (double e : height) {
            if (e > aux) {
                aux = e;
            }
        }
        System.out.println();
        System.out.println("Maior altura: " + aux);

        double aux2 = aux;
        for (double e : height) {
            if (e < aux2) {
                aux2 = e;
            }
        }
        System.out.println("Menor altura: " + aux2);

        double sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (gender[i].equals("F")) {
                sum += height[i];
                count++;
            }
        }

        double calc = sum / count;
        System.out.printf("Média de Alturas Femininas: %.2f%n", calc);

        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if (gender[i].equals("M")) {
                sum += height[i];
                count2++;
            }
        }
        System.out.println("Numero de Homens: " + count2);
    }
}
