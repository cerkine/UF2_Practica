package com.company.view;

import com.company.manager.GestionCliente;
import com.company.model.Cliente;
import com.company.view.games.Bombas;
import com.company.view.games.Caballos;
import com.company.view.games.Cartas;
import com.company.view.games.Ruleta;
import com.company.view.widget.MenuWidget;
import com.sun.javafx.css.Rule;

import java.util.Scanner;


public class MenuJuegosAzar {
    Bombas bombas = new Bombas();
    Caballos caballos = new Caballos();
    Cartas cartas = new Cartas();
    Ruleta ruleta = new Ruleta();
    MenuWidget menuWidget = new MenuWidget();

    public void start(){
        Cliente cliente = GestionCliente.clienteLogeado;
        menuWidget.crearMenu("con que quieres perder dinero","Bombas","Caballos","Cartas","Ruleta");
        switch (menuWidget.opcion){
            case 1:
                bombas.start(cliente);
                break;
            case 2:
                caballos.start(cliente);
                break;
            case 3:
                cartas.start(cliente);
                break;
            case 4:
                ruleta.start(cliente);
                break;
        }
    }
}
