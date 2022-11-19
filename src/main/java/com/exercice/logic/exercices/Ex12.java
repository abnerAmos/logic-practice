package com.exercice.logic.exercices;

public class Ex12 {

    public static void main(String[] args) {

        String[] list = {"j","d","a","g","b","f","c","i","e","h"};

        System.out.println("CRESCENTE");
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i].compareTo(list[j]) < 0) {
                    String aux = list[i];
                    list[i] = list[j];
                    list[j] = aux;
                }
            }
        }
        for (int i = 0; i < list.length; i++)
            System.out.println(list[i]);

        System.out.println("\nDECRESCENTE");
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i].compareTo(list[j]) < 0) {
                    String aux = list[i];
                    list[i] = list[j];
                    list[j] = aux;
                }
            }
        }
        for (int i = 0; i < list.length; i++)
            System.out.println(list[i]);
    }
}
