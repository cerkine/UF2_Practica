package com.company.view.games;

import java.util.Random;
import java.util.Scanner;

public class Bombas {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    final String[] symbols = {"\033[96m🏠\033[0m", "💣", "\033[35m🙅\033[0m", "\033[95m🙆\033[0m","\033[95m🙇\033[0m", "\033[91m\uD83D\uDD25\033[0m"};
    final int HOUSE = 0;
    final int BOMB = 1;
    final int WAITING = 2;
    final int SURVIVE = 3;
    final int DEAD = 4;
    final int FIRE = 5;

    int[][] tablero = new int[5][10];

    int playerX, playerY;
    int dinero = 100;
    int apuesta;

    public void start(){
        do {
            System.out.println("TU DINERO = " + dinero);
            pedirApuesta();
            if (apuesta > 0) {
                inicializarTablero();
                mostrarTablero();
                elegirCasa();
                mostrarTablero();
                System.out.println("Listo para el bombardeo? Pulsa Intro");
                scanner.nextLine();
                bombardear();
                mostrarTablero();
                System.out.println("Las bombas estallan! Pulsa Intro");
                scanner.nextLine();
                comprobar();
                mostrarTablero();
                calcularBalance();
            }
        } while (apuesta > 0 && dinero > 0);

        System.out.println("Presiona INTRO para volver...");
        scanner.nextLine();
    }

    void pedirApuesta(){
        do {
            System.out.println("Cuando dinero quieres apostar?");
            apuesta = scanner.nextInt();
            scanner.nextLine();
            if (apuesta > dinero) {
                System.out.println("No tienes dinero suficiente");

            }
        }
        while (apuesta > dinero);

        dinero = dinero - apuesta;
    }

    void inicializarTablero(){
        for (int x = 0; x < 5; x++){
            for (int y = 0; y < 10; y++)      {
                tablero[x][y] = 0;
            }
        }
    }

    void elegirCasa(){
        System.out.println("En que fila quieres tu casa? (Entre 1 y 5)");
        playerX = scanner.nextInt();
        scanner.nextLine();
        System.out.println("En que columna quieres tu casa? (Entre 1 y 10)");
        playerY = scanner.nextInt();
        scanner.nextLine();

        tablero[playerX-1][playerY-1] = 2;
    }

    void bombardear(){
        for (int x = 0; x < 25; x++){
            int n = random.nextInt(5);
            int h = random.nextInt(10);
            if(tablero[n][h] != 1) {
                tablero[n][h] = 1;
            }
            else {
                x--;
            }
        }
    }

    void comprobar(){
        if (tablero[playerX-1][playerY-1] == 1)
        {
            tablero[playerX-1][playerY-1] = 4;
        }
        else {
            tablero[playerX-1][playerY-1] = 3;
        }
        for (int x=0; x < 5; x++) {
            for (int y=0; y < 10; y++) {
                if (tablero[x][y] == 1) {
                    tablero[x][y] = 5;
                }
            }
        }
    }

    void mostrarTablero(){
        for (int x=0; x < 5; x++) {
            for (int y=0; y < 10; y++) {
                System.out.print(symbols[tablero[x][y]]);
            }
            System.out.println();
        }
        System.out.println();
    }

    void calcularBalance(){
        if (tablero[playerX-1][playerY-1] == 3) {
            System.out.println("Enhorabuena! Has sobrevivido!");
            System.out.println("Has ganado " + apuesta*2);
            dinero = dinero + apuesta *2;
        }
        else {
            System.out.println("YOU DIED! Pierdes tu dinero");
        }

    }
}

