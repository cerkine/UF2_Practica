package com.company;

import com.sun.org.apache.regexp.internal.RE;

import java.util.Random;
import java.util.Scanner;

public class Caballos {

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    final String[] symbols = {"\033[31m🏇\033[0m" , "\033[1;33m🐎\033[0m", "⬜", "⬛", "🏁"};
    int apuesta;
    int dinero = 100;
    int caballoApostado;
    int ganador;
    int [] posicion = new int [4];
    int[][] tablero = new int[4][22];
    String [] nombres = {"Rayo Mcqueen", "Haru", "Vegeta", "Jean", "Fuencislo", "Super Morio", "Papadopoulos", "Jack", "Manolito", "Torpedo Electrico", "Diarrea Explosiva", "Pies de Plomo", "El Precoz", "Diablo del chilli", "El Semental de Huesca"};
    boolean [] comprobacion = new boolean[15];
    int nombre;


    void start(){


        System.out.println("CARRERA DE CABALLOS");
        do {
            System.out.println("Tienes " + dinero + " euros");
            for (int x=0; x < 4; x++) {
                if (x != 0) {

                    do {
                        nombre = random.nextInt(15);
                        tablero[x][21] = nombre;
                    }
                    while ( comprobacion[nombre] );
                }
                else {
                    nombre = random.nextInt(15);
                    tablero[x][21] = nombre;
                }

                comprobacion[nombre] = true;

            }
            pedirApuesta();
            inicializarTablero();
            mostrarTablero();
            pedirCaballo();

            if (apuesta > 0) {
                mostrarTablero();
                while (ganador != 1) {
                    System.out.println("Siguiente movimiento");
                    sleep();
                    Movimiento();
                    mostrarTablero();
                    comprobar();
                }
                Reset();
            }
        } while (apuesta > 0 && dinero > 0);


        System.out.println("ADIOS!");
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

    void pedirCaballo(){
        System.out.println("A que calle quieres apostar? Calle 1, 2, 3 o 4");
        caballoApostado = scanner.nextInt();
        scanner.nextLine();
        tablero[caballoApostado-1][0] = 0;
    }

    void inicializarTablero(){
        for (int x = 0; x < 4; x++){
            for (int y = 0; y < 22; y++)      {
                if (y==0) {
                    tablero [x][y] = 1;
                }
                else if (y==20) {
                    tablero [x][y] = 4;
                }
                else if (y==21) {
                    continue;
                }
                else {
                    tablero[x][y] = 2;
                }
            }
        }
    }
    void mostrarTablero(){
        for (int x=0; x < 4; x++) {
            System.out.print("Calle " + (x+1) + ": ");
            for (int y=0; y < 22; y++) {
                if (y < 21) {
                    System.out.print(symbols[tablero[x][y]]);
                }
                else if (y==21){
                    System.out.print("    ");
                    System.out.print(nombres[tablero[x][21]]);
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    void Movimiento(){
        for (int x = 0; x < 4; x++){
            int h = random.nextInt(4);
            posicion [x] = posicion [x] + h;
            if (x==caballoApostado-1) {
                if (posicion [x] >= 20) {
                    tablero[x][20] = 0;
                }
                else{
                    tablero[x][posicion[x]] = 0;
                }
            }
            else {
                if (posicion [x] >= 20) {
                    tablero[x][20] = 1;
                }
                else{
                    tablero[x][posicion[x]] = 1;
                }
            }
            if (posicion [x] >= 20) {
                for (int y = 0; y < 20; y++) {
                    tablero [x][y] = 3;
                }
            }
            else{
                for (int y = 0; y < posicion [x]; y++) {
                    tablero [x][y] = 3;
                    if (tablero [x][y] == 0 || tablero [x][y] == 1 ) {
                        tablero [x][y] = 5;
                    }
                }
            }

        }
    }

    void comprobar(){
        for (int x=0; x < 4; x++){
            if (tablero [x][20] == 0 || tablero [x][20] == 1) {
                ganador = ganador + 1;
            }
            if (ganador > 1) {
                System.out.println("Ha habido un empate! La carrera se repite!");
                ganador = 0;
                Reset();
                inicializarTablero();
                tablero [caballoApostado-1][0] = 0;
                mostrarTablero();
                System.out.println("Pulsa intro para repetir la carrera");
                scanner.nextLine();

            }

        }
        if (ganador == 1) {
            if (tablero[caballoApostado-1][20] == 0) {
                System.out.println("Ha ganado " + nombres[tablero[caballoApostado-1][21]] + "! Enhorabuena! Has ganado " + apuesta*4);
                dinero = dinero + apuesta*4;
            }
            else {
                System.out.println("Tu caballo ha perdido! No has ganado nada :( !");
            }
        }

        for (int y=0; y < 4; y++) {
            if (tablero[y][20] == 1) {
                System.out.println("Ha ganado el caballo " + nombres [tablero [y][21]]);
            }
        }



    }

    void Reset () {
        for (int x = 0; x < 4; x++){
            posicion[x] = 0;
            ganador = 0;
        }
    }

    void sleep(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

