package com.company;
import com.company.manager.Gestion;
import com.company.manager.GestionAtraccion;
import com.company.manager.GestionConsulta;
import com.company.model.Cliente;
import com.company.model.Donacion;
import com.company.view.ClienteView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cliente cliente;
	// write your code here
        GestionAtraccion gestionAtraccion = new GestionAtraccion();
        gestionAtraccion.Change();
        GestionConsulta gestionConsulta = new GestionConsulta();
        Scanner scanner = new Scanner(System.in);

        Gestion gestion = new Gestion();
        gestion.CargarParque(gestionAtraccion);

        Donacion donacion = new Donacion();

        ClienteView clienteView = new ClienteView();
        cliente=clienteView.decision();// para ver que cliente es y poder jugar con el innecesario por ahora


    }

}
