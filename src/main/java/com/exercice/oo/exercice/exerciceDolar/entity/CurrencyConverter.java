package com.exercice.oo.exercice.exerciceDolar.entity;

public class CurrencyConverter {

    public static final double DOLLAR_IN_REAL = 5.38;

    public static final int IOF = 6;

    public static double buyDollar(double buyDollar) {
        double convertedValue = (buyDollar * DOLLAR_IN_REAL);
        return convertedValue - (convertedValue * IOF) / 100;
    }
}
