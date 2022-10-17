package com.exercice.logic.Exercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {

        System.out.println("Informe um mês para saber os seus dias, ou (todos) para ver todos");
        String input = new Scanner(System.in).next();
        String in = input.toLowerCase();

        Map<String, String> months = new HashMap<>();

        months.put("janeiro", "Janeiro - 31");
        months.put("fevereiro", "Fevereiro - 28");
        months.put("março", "Março - 31");
        months.put("abril", "Abril - 30");
        months.put("maio", "Maio - 31");
        months.put("junho", "Junho - 30");
        months.put("julho", "Julho - 31");
        months.put("agosto", "Agosto - 31");
        months.put("setembro", "Setembro - 30");
        months.put("outubro", "Outubro - 31");
        months.put("novembro", "Novembro - 30");
        months.put("dezembro", "Dezembro - 31");

        if (in.equals("todos"))
            for (Map.Entry<String, String> entry : months.entrySet()) {
                System.out.println(entry.getValue());
            }
        else {
            String out = (!in.equals("janeiro"))
                    && (!in.equals("fevereiro"))
                    && (!in.equals("março"))
                    && (!in.equals("abril"))
                    && (!in.equals("maio"))
                    && (!in.equals("junho"))
                    && (!in.equals("julho"))
                    && (!in.equals("agosto"))
                    && (!in.equals("setembro"))
                    && (!in.equals("outubro"))
                    && (!in.equals("novembro"))
                    && (!in.equals("dezembro"))
                    ? "Opção Inválida" : months.get(in);
            System.out.println(out);
        }
    }
}