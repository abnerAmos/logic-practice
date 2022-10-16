package com.exercice.logic.Exercicios;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        int count = 0;

        System.out.println("Mora perto da vítima?");
        String questionOne = new Scanner(System.in).next();
        if(questionOne.equalsIgnoreCase("Sim"))
            count++;

        System.out.println("Já trabalhou com a vítima?");
        Scanner questionTwo = new Scanner(System.in);
        if(questionTwo.next().equalsIgnoreCase("Sim"))
            count++;

        System.out.println("Telefonou para a vítima?");
        Scanner questionThree = new Scanner(System.in);
        if(questionThree.next().equalsIgnoreCase("Sim"))
            count++;

        System.out.println("Esteve no local do crime?");
        Scanner questionFour = new Scanner(System.in);
        if(questionFour.next().equalsIgnoreCase("Sim"))
            count++;

        System.out.println("Devia para a vítima?");
        Scanner questionFive = new Scanner(System.in);
        if(questionFive.next().equalsIgnoreCase("Sim"))
            count++;

        System.out.println("Resultado: " + count);

        if(count == 5)
            System.out.println("Assasino");
        if(count == 4 || count == 3)
            System.out.println("Cumplice");
        if (count == 2)
            System.out.println("Suspeito");
        if (count <= 1)
            System.out.println("Liberado");

        // Faz a contagem de "Sim" para dar o resultado
    }
}
