package com.exercice.oo.exercice.firtExercice.entity;

public class Triangle {

    // Atributos de Classe
    public double a;
    public double b;
    public double c;

    public double area() {
        double average = (a + b + c) / 2.0;
        return Math.sqrt(average * (average - a) * (average - b) * (average - c));
    }
}
