package com.company.view;

import com.company.manager.GestionBaseDeDatos;
import com.company.manager.GestionCliente;
import com.company.model.Cliente;
import com.company.view.widget.EditText;
import com.company.view.widget.Mensaje;
import com.company.view.widget.MenuWidget;
public class ViewRegistroAcceso {
    MenuWidget menuWidget = new MenuWidget();
    Mensaje mensaje = new Mensaje();
    EditText editText = new EditText();
    public void decision() {


        menuWidget.crearMenu("Bienvenio, ¿Que quieres hacer?","Nuevo cliente", "Soy Cliente");
        int opcion=menuWidget.opcion;
        switch (opcion) {
            case 1:
                GestionCliente.clienteLogeado = new Cliente();
                GestionCliente.clienteLogeado=RegistroCliente.pedirDatos();
                GestionCliente.cargarCliente();
                break;
            case 2:
                String decision = "";
                do {
                    GestionCliente.clienteLogeado = GestionBaseDeDatos.get().selectCliente(RegistroCliente.pedirDni(), RegistroCliente.pedirPass());

                    if (GestionCliente.clienteLogeado == null) {
                        mensaje.mostrarError("Error, ese usuario no esta registrado");
                        do {
                            decision = editText.texto("Desea volver a intentar introducir un usuario? S para si, N para no");
                            if (decision.equals("N")) {
                                break;
                            } else if (decision.equals("S")) {

                            } else {
                                mensaje.mostrarError("Error, opcion no correcta");
                            }
                        } while (!decision.equals("N") && !decision.equals("S"));
                    }


                }while (GestionCliente.clienteLogeado == null && !decision.equals("N"));
                break;
        }


    }
}

