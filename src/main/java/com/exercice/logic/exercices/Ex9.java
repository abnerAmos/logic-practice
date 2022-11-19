package com.exercice.logic.exercices;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {

        System.out.println("Informe um numero para saber se é primo ou não");
        int input = new Scanner(System.in).nextInt();

        int count = 0;

        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                count++;
            }
        }
        if (count == 2 || input == 1) {
            System.out.println("numero primo");
        } else System.out.println("não é primo");
    }
}