package com.company.view;

import com.company.manager.GestionCliente;
import com.company.model.Cliente;
import com.company.view.widget.MenuWidget;
import com.company.view.widget.WindowTitle;

import java.util.Scanner;

public class ViewRegistroAcceso {
    public int decisionS;
    Scanner scanner =new Scanner(System.in);
    GestionCliente gestionCliente = new GestionCliente();
    RegistroCliente registroCliente = new RegistroCliente();
    MenuWidget menuWidget = new MenuWidget();
    public Cliente decision() {
            gestionCliente.adminDefault();
            System.out.println("Que deseas hacer: \n Nuevo cliente-1 \n Soy cliente-3 \n Salir -0");
            decisionS = scanner.nextInt();scanner.nextLine();

            menuWidget.crearMenu("Bienvenio, ¿Que quieres hacer?","Nuevo cliente", "Soy Cliente","ClienteDefault");


            switch (menuWidget.opcion) {
                case 1:
                    Cliente cliente = gestionCliente.cargarCliente();
                    return registroCliente.pedirDatos(cliente);
                case 2:
                    String pedirDni= registroCliente.pedirDni();
                    String pedirPass= registroCliente.pedirPass();

                    return gestionCliente.comprobarCliente(pedirDni,pedirPass);
                case 3:
                    return gestionCliente.clienteDefault();
            }
            return null;

    }
}
