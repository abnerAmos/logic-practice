package com.exercice.logic.Exercicios;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        System.out.println("Insira diversos numeros separados por (,) virgula (sem espaço)");
        String input = new Scanner(System.in).nextLine();

        String[] numbers = input.split(",");
        for (int i = 0; i < numbers.length; i++){
            int stringForInt = Integer.parseInt(numbers[i]);
            if (stringForInt % 2 == 0)
            System.out.println(stringForInt);
        }
        // imprime os numeros pares inseridos em formato de lista
    }
}
