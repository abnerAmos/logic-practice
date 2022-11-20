package com.exercice.oo.exercice.exerciceStatic.program;

import com.exercice.oo.exercice.exerciceStatic.entity.Calculator;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Informe o raio: ");
        double radius = input.nextDouble();

        double circ = Calculator.circumference(radius);
        double vol = Calculator.volume(radius);

        System.out.println("Circunferencia: " + circ);
        System.out.println("Volume: " + vol);
        System.out.println("PI: " + Calculator.PI);

    }
}
