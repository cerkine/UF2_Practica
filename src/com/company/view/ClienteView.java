package com.company.view;

import com.company.manager.GestionCliente;
import com.company.model.Cliente;

import java.util.Scanner;

public class ClienteView {
    Cliente cliente;
    public int decisionS;
    Scanner scanner =new Scanner(System.in);
    GestionCliente gestionCliente = new GestionCliente();
    public Cliente decision() {

            System.out.println("Que deseas hacer: \n Nuevo cliente-1 \n Soy cliente-3 \n Salir -0");
            decisionS = scanner.nextInt();scanner.nextLine();
            return gestionCliente.cargarCliente(decisionS);

    }
}
