package com.exercice.oo.exercice.exerciceBankAccount.application;

import com.exercice.oo.exercice.exerciceBankAccount.entity.Account;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe os dados para cadastrar o cliente\n");
        System.out.print("Nome: ");
        String name = input.nextLine();
        System.out.print("Numero da Conta: ");
        int accountNumber = input.nextInt();
        System.out.print("Saldo Inicial: ");
        double balance = input.nextDouble();

        Account account = new Account(name, accountNumber, balance);
        System.out.println("\nDados da Conta:\n" + account);

        System.out.print("\nInforme a quantia a ser depositada: ");
        account.deposit(input.nextDouble());
        System.out.println("\nAtualização da Conta:\n" + account);

        System.out.println("\nInforme a quantia a ser sacada: ");
        account.withdraw(input.nextDouble());
        System.out.println("\nAtualização da Conta:\n" + account);

    }
}
