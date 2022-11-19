package com.exercice.logic.exercices;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {

        System.out.println("Informe uma Palavra");
        String palindrome = new Scanner(System.in).next();
        String word = "";

        for (int i = palindrome.length() - 1; i >= 0; i--) {
            char character = palindrome.charAt(i);
            word = word + character;
        }

        String match = palindrome.equals(word) ? "Palindromo" : "Não é Palindromo";
        System.out.println(match);
    }
}
