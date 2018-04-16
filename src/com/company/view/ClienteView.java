package com.company.view;

import com.company.manager.GestionCliente;
import com.company.model.Cliente;
import com.company.view.widget.MenuWidget;
import com.company.view.widget.WindowTitle;

import java.util.Scanner;

public class ClienteView {
    public int decisionS;
    Scanner scanner =new Scanner(System.in);
    GestionCliente gestionCliente = new GestionCliente();
    RegistroCliente registroCliente = new RegistroCliente();
    MenuWidget menuWidget = new MenuWidget();
    public Cliente decision() {


            menuWidget.crearMenu("Bienvenio, ¿Que quieres hacer?","Nuevo cliente", "Soy Cliente", "Salir");


            switch (menuWidget.opcion) {
                case 1:
                    Cliente cliente = gestionCliente.cargarCliente();
                    return registroCliente.pedirDatos(cliente);
                case 3:
                    String pedirDni= registroCliente.pedirDni();
                    String pedirPass= registroCliente.pedirPass();

                    return gestionCliente.comprobarCliente(pedirDni,pedirPass);
                case 0:
                    return cliente = gestionCliente.clienteDefault();
            }
            return null;

    }
}
