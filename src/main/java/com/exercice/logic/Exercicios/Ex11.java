package com.exercice.logic.Exercicios;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        System.out.println("Exercicio de Ordenação");

        int[] numberList = {2, 4, 6, 5, 3, 1, 10, 7, 9, 8};

        System.out.println("\nLISTA DESORDENADA");
        for (int i = 0; i < numberList.length; i++) {
            System.out.println(numberList[i]);
        }

        System.out.println("\nLISTA ORDENADA");
        for (int i = 0; i < numberList.length; i++) {
            for (int j = i + 1; j < numberList.length; j++) {
                if (numberList[i] > numberList[j]) {
                    int aux = numberList[i];
                    numberList[i] = numberList[j];
                    numberList[j] = aux;
                }
            }
            System.out.println(numberList[i]);
        }

        System.out.println("\nLISTA INVERTIDA");
        for (int i = 0; i < numberList.length; i++) {
            for (int j = i + 1; j < numberList.length; j++) {
                if (numberList[i] < numberList[j]) {
                    int aux = numberList[i];
                    numberList[i] = numberList[j];
                    numberList[j] = aux;
                }
            }
            System.out.println(numberList[i]);
        }
    }
}