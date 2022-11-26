package com.exercice.oo.exercice.exerciceRooms.application;

import com.exercice.oo.exercice.exerciceRooms.entity.Rooms;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        System.out.println("Informe quantos quartos serão alugados:");
        Scanner input = new Scanner(System.in);
        int quantity = input.nextInt();

        Rooms[] totalRooms = new Rooms[10]; // Abre um Array(Vetor) do Objeto e informa quantos objetos podem ser inseridos(10).

        for (int i = 0; i < quantity; i++) {            // Recebe os valores.
            System.out.println("Locação #" + (i+1));
            input.nextLine();
            System.out.print("Nome: ");
            String name = input.nextLine();
            System.out.print("E-mail: ");
            String email = input.nextLine();
            System.out.print("Numero do quarto: ");
            int numberRoom = input.nextInt();

            totalRooms[numberRoom] = new Rooms(name, email, numberRoom);
        }   // Array do Objeto onde recebe os valores informados

        System.out.println("\nQuartos Ocupados:");
        for (int i = 0; i < totalRooms.length; i++) {
            if (totalRooms[i] != null)
                System.out.println(totalRooms[i]);
        }
    }
}
