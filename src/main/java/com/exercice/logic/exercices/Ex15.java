package com.exercice.logic.exercices;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Informe quantos numeros irá digitar: ");
        int insert = input.nextInt();
        int[] numbers = new int[insert];

        System.out.println("digite numero de 1 a 10 sequencialmente:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("Numeros negativos: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0)
                System.out.println(numbers[i]);
        }

    }
}
