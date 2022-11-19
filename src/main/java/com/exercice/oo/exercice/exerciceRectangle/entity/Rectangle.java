package com.exercice.oo.exercice.exerciceRectangle.entity;

public class Rectangle {

    public double width;
    public double height;

    public double area () {
        return width * height;
    }

    public double perimeter () {
        return (width + height) * 2;
    }

    public double diagonal () {
        double w = Math.pow(width, 2);
        double h = Math.pow(height, 2);
        double result = w + h;
        return Math.sqrt(result);
    }

}
