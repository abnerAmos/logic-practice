package com.exercice.logic.exercices;

import org.springframework.cglib.core.Local;

import java.util.Locale;
import java.util.Scanner;

public class Ex24 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        System.out.println("Informe quantas pessoas irá digitar:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        String[] name = new String[n];
        int[] age = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i+1) + "a Pessoa");
            System.out.print("Nome: ");
            input.nextLine();
            name[i] = input.nextLine();
            System.out.print("Idade: ");
            age[i] = input.nextInt();
        }

        int aux = 0;
        for (int e : age) {
            if (e > aux) {
                aux = e;
            }
        }

        for (int i = 0; i < n; i++) {
            if (age[i] == aux) {
                System.out.println("Pessoa mais velha: " + name[i]);
            }
        }
    }
}
