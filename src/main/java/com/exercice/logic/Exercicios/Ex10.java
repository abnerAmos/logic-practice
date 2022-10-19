package com.exercice.logic.Exercicios;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        System.out.println("Informe um numero e mostre a sequencia Fibonacci até ele");
        int input = new Scanner(System.in).nextInt();

        int nextNumber = 1;
        int previousNumber = 0;

        while (nextNumber < input) {
            System.out.println(nextNumber);
            nextNumber = nextNumber + previousNumber;
            previousNumber = nextNumber - previousNumber;
        }
    }
}
