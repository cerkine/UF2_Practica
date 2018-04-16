package com.company.view.games;

import com.company.model.Cliente;

import java.util.Random;
import java.util.Scanner;

public class Ruleta {
    Cliente cliente;

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    final int[] rojas = {1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36};

    int[] apuestas = new int[12];
    // indices de los TIPOS de apuestas

    final int ROJO = 0;
    final int NEGRO = 1;
    final int PAR = 2;
    final int IMPAR = 3;
    final int COLUMNA1 = 4;
    final int COLUMNA2 = 5;
    final int COLUMNA3 = 6;
    final int DOCENA1 = 7;
    final int DOCENA2 = 8;
    final int DOCENA3 = 9;
    final int FALTA = 10;
    final int PASA = 11;

    int[] apuestasNumeros = new int[37];
    int money;
    int totalApostado;
    int apuestaInicial;
    int numeroapuesta;
    int numero;
    int ganado;

      // balance de dinero

    int bola = 0;
    boolean esRoja = false;

    public void start(Cliente cliente) {
        money = cliente.dinero;
        System.out.println("RULETA");

        do {
            System.out.println("TU DINERO = " + money);
            System.out.println("Puedes hacer varias apuestas");
            hacerApuestas();
            if (totalApostado > 0) {
                lanzarBola();
                calcularBalance();
                retirarApuestas();
            }
        } while (totalApostado > 0 && money > 0);


        if (money > 0){
            System.out.println("BYE! YOUR MONEY: " + money);
        } else {
            System.out.println("OUT OF MONEY!");
        }

        System.out.println("Presiona INTRO para volver...");
        scanner.nextLine();
    }

    void hacerApuestas(){
        do {
            System.out.println("Cuanto dinero quieres apostar? (Introduce 0 para no apostar más)");
            apuestaInicial = scanner.nextInt();
            scanner.nextLine();
            if (apuestaInicial > 0 && apuestaInicial <= money) {
                System.out.println("En que quieres apostar? Indice: Rojo (1), Negro (2), Par (3), Impar (4), Columna 1 (5), Columna 2 (6), Columna 3 (7), Docena 1 (8), Docena 2 (9), Docena 3 (10), Falta (11), Pasa (12), Numero (13)");
                numeroapuesta = scanner.nextInt();
                scanner.nextLine();
                if (numeroapuesta == 13){
                    System.out.println("A que numero quieres apostar? De 0 a 36, ambos incluidos");
                    numero = scanner.nextInt();
                    scanner.nextLine();
                    apuestasNumeros[numero] = apuestasNumeros[numero] + apuestaInicial;
                    money = money - apuestaInicial;
                    totalApostado = totalApostado + apuestaInicial;
                }
                else {
                    apuestas[numeroapuesta - 1] = apuestas[numeroapuesta - 1] + apuestaInicial;
                    money = money - apuestaInicial;
                    totalApostado = totalApostado + apuestaInicial;
                }
                System.out.println("Siguiente apuesta.");
            }
            else {
                return;
            }
        }
        while (apuestaInicial > 0 && money > 0);
    }

    void lanzarBola(){
        bola = random.nextInt(37);
        for (int n = 0; n < rojas.length; n++)
        {
            if (rojas[n] == bola) {
                esRoja = true;
                System.out.println("Ha salido " + bola + " que es roja!");
                break;
            }
        }
        if (!esRoja) {
            System.out.println("Ha salido " + bola);
        }

    }

    void calcularBalance(){
        if (bola == 0) {
            money = money + 36 * apuestasNumeros[0];
            ganado = ganado + 36 * apuestasNumeros[0];
        }
        for (int n = 1; n < 37;n++) {
            if (bola == n && apuestasNumeros[n] != 0) {
                money = money + 35 * apuestasNumeros[n];
                ganado = ganado + 35 * apuestasNumeros[n];
            }
        }
        if (esRoja) {
            money = money + 2*apuestas[0];
            ganado = ganado + 2*apuestas[0];
        }
        if (!esRoja) {
            money = money + 2*apuestas[1];
            ganado = ganado + 2*apuestas[1];
        }
        if (bola%2==0){
            money = money + 2*apuestas[2];
            ganado = ganado + 2*apuestas[2];
        }
        if (bola%2!=0){
            money = money + 2*apuestas[3];
            ganado = ganado + 2*apuestas[3];
        }
        if (bola%3==1){
            money = money + 3*apuestas[4];
            ganado = ganado + 3*apuestas[4];
        }
        if (bola%3==2){
            money = money + 3*apuestas[5];
            ganado = ganado + 3*apuestas[5];
        }
        if (bola%3==0){
            money = money + 3*apuestas[6];
            ganado = ganado + 3*apuestas[6];
        }
        if (bola >= 1 && bola <= 12){
            money = money + 3*apuestas[7];
            ganado = ganado + 3*apuestas[7];
        }
        if (bola >= 13 && bola <= 24){
            money = money + 3*apuestas[8];
            ganado = ganado + 3*apuestas[8];
        }
        if (bola >= 25 && bola <= 36){
            money = money + 3*apuestas[9];
            ganado = ganado + 3*apuestas[9];
        }
        if (bola >= 1 && bola <= 18){
            money = money + 3*apuestas[10];
            ganado = ganado + 3*apuestas[10];
        }
        if (bola >= 19 && bola <= 36){
            money = money + 3*apuestas[11];
            ganado = ganado + 3*apuestas[11];
        }
        if (ganado != 0){
            System.out.println("Has ganado " + ganado + "! Enhorabuena!");
        }
        if (ganado == 0) {
            System.out.println("No has ganado nada :(. Lo siento!");
        }

    }

    void retirarApuestas(){
        for (int y=0;y < apuestas.length;y++){
            apuestas[y] = 0;
        }
        for (int x=0;x < apuestasNumeros.length;x++){
            apuestasNumeros[x] = 0;
        }
        ganado = 0;
    }
}

