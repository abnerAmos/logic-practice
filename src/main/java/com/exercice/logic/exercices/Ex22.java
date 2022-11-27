package com.exercice.logic.exercices;

import java.util.Locale;
import java.util.Scanner;

public class Ex22 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        System.out.println("Informe quantos funcionários deseja cadastrar:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] id = new int[n];
        String[] name = new String[n];
        Double[] salary = new Double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n" + (i+1) + "a Funcionário:");
            System.out.print("ID: ");
            id[i] = input.nextInt();
            System.out.print("Nome: ");
            input.nextLine();
            name[i] = input.nextLine();
            System.out.print("Salario: ");
            salary[i] = input.nextDouble();
        }

        System.out.println("\nInforme o ID do funcionário que terá aumento:");
        int idEmployee = input.nextInt();
        System.out.println("\nInforme a porcentagem de aumento");
        int increase = input.nextInt();

        for (int i = 0; i < n; i++) {
            if (id[i] == idEmployee) {
                salary[i] += (salary[i] * increase / 100);
            }
            if (id[i] != idEmployee)
                System.out.println("\nID não encontrado");
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("\n" + id[i] + ": " + name[i] + ", " + "%.3f%n", salary[i]);
        }

    }
}
