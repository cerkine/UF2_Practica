package com.company.view;

import com.company.manager.GestionBaseDeDatos;
import com.company.manager.GestionCliente;
import com.company.model.Cliente;
import com.company.view.widget.Mensaje;
import com.company.view.widget.MenuWidget;
import com.company.view.widget.WindowTitle;

import java.util.Scanner;

public class ViewRegistroAcceso {
    MenuWidget menuWidget = new MenuWidget();
    public void decision() {


        menuWidget.crearMenu("Bienvenio, ¿Que quieres hacer?","Nuevo cliente", "Soy Cliente","ClienteDefault");
        int opcion=menuWidget.opcion;
        switch (opcion) {
            case 1:
                GestionCliente.clienteLogeado = new Cliente();
                GestionCliente.clienteLogeado=RegistroCliente.pedirDatos();
                GestionCliente.cargarCliente();
                break;
            case 2:
                do {
                    GestionCliente.clienteLogeado = GestionBaseDeDatos.get().selectCliente(RegistroCliente.pedirDni(), RegistroCliente.pedirPass());
                }while (GestionCliente.clienteLogeado == null);
                break;

            case 3:
                GestionCliente.clienteDefault();
                break;
        }


    }
}

