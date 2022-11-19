package com.exercice.oo.exercice.exerciceStudent.entity;

public class Student {

    public String name;
    public double noteOne;
    public double noteTwo;
    public double noteThree;

    public double calculateGrades () {
        return noteOne + noteTwo + noteThree;
    }

    public String result () {
        if (calculateGrades() > 60.0) {
            return "\nAPROVADO";
        } else {
            double missingPoints = 60.0 - calculateGrades();
            return "\nREPROVADO\nPontos faltantes: " + missingPoints;
        }
    }

    public String toString () {
        return "SOMA DAS NOTAS: " +
                calculateGrades() +
                result();
    }
}
