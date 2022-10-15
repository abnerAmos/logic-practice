package com.exercice.logic.Exercicios;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        System.out.println("Insira uma frase");
        String input = new Scanner(System.in).nextLine();

        for (int i = 0; i < input.length(); i++) {
            Character phrase2 = input.charAt(i);
            System.out.println(phrase2);

        }
    }
}
