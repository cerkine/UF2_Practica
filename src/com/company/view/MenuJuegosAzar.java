package com.company.view;

import com.company.model.Cliente;
import com.company.view.games.Bombas;
import com.company.view.games.Caballos;
import com.company.view.games.Cartas;
import com.company.view.games.Ruleta;
import com.sun.javafx.css.Rule;

import java.util.Scanner;


public class MenuJuegosAzar {
    Scanner scanner = new Scanner(System.in);
    Bombas bombas = new Bombas();
    Caballos caballos = new Caballos();
    Cartas cartas = new Cartas();
    Ruleta ruleta = new Ruleta();
    public void start(Cliente cliente){

        char opcion = scanner.nextLine().charAt(0);
        switch (opcion){
            case '1':
                bombas.start();
                break;
            case '2':
                caballos.start();
                break;
            case '3':
                cartas.start();
                break;
            case '4':
                ruleta.start(cliente);
                break;
        }
    }
}
