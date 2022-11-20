package com.exercice.oo.exercice.exerciceDolar.program;

import com.exercice.oo.exercice.exerciceDolar.entity.CurrencyConverter;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe quantos Dolares deseja comprar:");
        double dolar = input.nextDouble();

        double buy = CurrencyConverter.buyDollar(dolar);

        System.out.println("Valor convertido em Reais: " + buy);

    }
}
