package com.company.view;

import com.company.manager.GestionCliente;
import com.company.model.Cliente;

import java.util.Scanner;

public class ClienteView {
    public int decisionS;
    Scanner scanner =new Scanner(System.in);
    GestionCliente gestionCliente = new GestionCliente();
    RegistroCliente registroCliente = new RegistroCliente();

    public Cliente decision() {

            System.out.println("Que deseas hacer: \n Nuevo cliente-1 \n Soy cliente-3 \n Salir -0");
            decisionS = scanner.nextInt();scanner.nextLine();

            switch (decisionS) {
                case 1:
                    Cliente cliente = gestionCliente.cargarCliente();
                    return registroCliente.pedirDatos(cliente);
                case 3:
                    String pedirDni= registroCliente.pedirDni();
                    String pedirPass= registroCliente.pedirPass();

                    return gestionCliente.comprobarCliente(pedirDni,pedirPass);
            }
            return null;

    }
}
