package com.company;
import com.company.manager.Gestion;
import com.company.model.Cliente;
import com.company.model.Donacion;
import com.company.view.ClienteView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cliente cliente;
	// write your code here
        Scanner scanner = new Scanner(System.in);

        Gestion gestion = new Gestion();
        gestion.CargarParque();

        Donacion donacion = new Donacion();

        ClienteView clienteView = new ClienteView();
        cliente=clienteView.decision();// para ver que cliente es y poder jugar con el innecesario por ahora



    }

}
