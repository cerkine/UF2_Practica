package com.company.view;

import com.company.manager.GestionCliente;
import com.company.model.Cliente;
import com.company.view.widget.Mensaje;
import com.company.view.widget.MenuWidget;
import com.company.view.widget.WindowTitle;

import java.util.Scanner;

public class ViewRegistroAcceso {
    public int decisionS;
    Scanner scanner =new Scanner(System.in);
    public GestionCliente gestionCliente = new GestionCliente();
    RegistroCliente registroCliente = new RegistroCliente();
    public MenuWidget menuWidget = new MenuWidget();
    Mensaje mensaje = new Mensaje();
    public Cliente decision() {
            gestionCliente.adminDefault();


            menuWidget.crearMenu("Bienvenio, ¿Que quieres hacer?","Nuevo cliente", "Soy Cliente","ClienteDefault");


            switch (menuWidget.opcion) {
                case 1:
                    Cliente cliente = gestionCliente.cargarCliente();
                    return registroCliente.pedirDatos(cliente);
                case 2:
                    do{
                        String pedirDni= registroCliente.pedirDni();
                        String pedirPass= registroCliente.pedirPass();
                        cliente=gestionCliente.comprobarCliente(pedirDni,pedirPass);
                        mensaje.mostrarError("Error Usuario \n Desea salir pulse 0 \n Volver a intentar 1");
                        int opcion = scanner.nextInt();scanner.nextLine();
                        if(opcion==0){
                            break;
                        }
                    }while (cliente==null);
                    return cliente;
                case 3:
                    return gestionCliente.clienteDefault();
            }
            return null;

    }
}
