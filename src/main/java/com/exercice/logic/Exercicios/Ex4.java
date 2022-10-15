package com.exercice.logic.Exercicios;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        System.out.println("Informe um numero para ver a tabuada completa:");
        int input = new Scanner(System.in).nextInt();
        int count = 0;

        while (count < 10) {
            count++;
            int multiplier = count * input;
            System.out.println(multiplier);
        }
    }
}
