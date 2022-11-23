package com.exercice.logic.exercices;

import java.util.Locale;
import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a quantas pessoas para calculo de média de altura:");
        int peopleQuantity = input.nextInt();
        double[] vect = new double[peopleQuantity];
        double sum = 0;

        System.out.println("Informe as Alturas:");
        for (int i = 0; i < peopleQuantity; i++) {
            vect[i] = input.nextDouble();
            sum += vect[i];
        }

        double average = sum / peopleQuantity;
        System.out.printf("Média de altura das pessoas: %.2f%n", average);
    }
}
