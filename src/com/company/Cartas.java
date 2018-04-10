package com.company;

import java.util.Random;
import java.util.Scanner;

public class Cartas {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    final String[] baraja = {"🂡","🂢","🂣","🂤","🂥","🂦","🂧","🂨","🂩","🂫","🂭","🂮"};

    int money = 100;
    int apuesta;

    int[] puntos = new int[2];
    final int PLAYER = 0;
    final int CRUPIER = 1;

    void start(){
        System.out.println("CARTAS");

        do {
            System.out.println("Tienes " + money + " euros");
            pedirApuesta();
            if (apuesta > 0) {
                pedirCartas();
                sacarCartas();
                comprobarGanador();
                puntos[0] = 0;
                puntos [1] = 0;
            }
        } while (apuesta > 0 && money > 0);

        System.out.println("ADIOS!");
        System.out.println("Presiona INTRO para volver...");
        scanner.nextLine();
    }


    void pedirApuesta(){
        do {
            System.out.println("APUESTA: ");
            apuesta = scanner.nextInt();
            scanner.nextLine();

            if (apuesta > money){
                System.out.println("NO TIENES TANTO DINERO");
            }
        } while (apuesta > money);

        money -= apuesta;
    }

    void sacarCartas() {
        if (puntos[PLAYER] > 21) return;

        System.out.println("TURNO DEL CRUPIER... (Pulsa una tecla para que saque las cartas");
        scanner.nextLine();
        do {
            int carta = random.nextInt(12);
            puntos[CRUPIER] += carta + 1;
            System.out.println("     " + (carta + 1) + " " + baraja[carta]);
            System.out.println("PUNTOS: " + puntos[CRUPIER]);
        } while (puntos[CRUPIER] < 21 && puntos[CRUPIER] < puntos[PLAYER]);
    }

    void pedirCartas(){
        char sacar;
        do {
            System.out.println("SACAR CARTA?");
            sacar = scanner.nextLine().charAt(0);

            if (sacar == 's') {
                int carta = random.nextInt(12);
                puntos[PLAYER] += carta + 1;
                System.out.println((carta + 1) + " " + baraja[carta]);
                System.out.println("PUNTOS: " + puntos[PLAYER]);
            }
        } while (sacar == 's' && puntos[PLAYER] < 21);
    }

    void comprobarGanador(){
        System.out.println();
        System.out.println("PLAYER: " + puntos[PLAYER] + "   CRUPIER: " + puntos[CRUPIER]);
        if (puntos[CRUPIER] > 21){
            System.out.println("PLAYER WINS!");
            money += apuesta*2;
        } else if (puntos[PLAYER] > 21){
            System.out.println("CRUPIER WINS");
        } else if (puntos[CRUPIER] > puntos[PLAYER]) {
            System.out.println("CRUPIER WINS");
        } else if (puntos[PLAYER] > puntos[CRUPIER]) {
            System.out.println("PLAYER WINS!");
            money += apuesta*2;
        } else {
            System.out.println("EMPATE");
            money += apuesta;
        }
    }
}

