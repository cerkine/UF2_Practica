package com.company.view;

import com.company.manager.GestionCliente;
import com.company.view.widget.MenuWidget;

public class ViewRegistroAcceso {
    RegistroCliente registroCliente = new RegistroCliente();
    MenuWidget menuWidget = new MenuWidget();
    public void decision() {


            menuWidget.crearMenu("Bienvenio, ¿Que quieres hacer?","Nuevo cliente", "Soy Cliente","ClienteDefault");
            int opcion=menuWidget.opcion;
        switch (opcion) {
                case 1:
                    GestionCliente.cargarCliente();
                     registroCliente.pedirDatos();
                     break;
                case 2:
                    String pedirDni= registroCliente.pedirDni();
                    String pedirPass= registroCliente.pedirPass();

                    GestionCliente.comprobarCliente(pedirDni,pedirPass);
                    break;

                case 3:
                    GestionCliente.clienteDefault();
                    break;
            }


    }
}
