package com.exercice.logic.exercice;

import java.math.BigDecimal;
import java.util.Scanner;

public class Ex1 {

    // Informe um valor monetário e diminua 15 porcento do valor, com BigDecimal

    public static void main(String[] args) {

        System.out.println("Informe um valor");
        String input = new Scanner(System.in).next();

        BigDecimal valueIn = new BigDecimal(input);
        BigDecimal percentage = new BigDecimal("15");
        BigDecimal division = new BigDecimal("100");

        BigDecimal result = valueIn.multiply(percentage).divide(division);
        BigDecimal total = valueIn.subtract(result);

        System.out.println("Novo valor: " + total);
    }
}
