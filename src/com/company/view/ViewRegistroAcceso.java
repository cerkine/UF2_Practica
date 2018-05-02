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
                    String decision = "";
                    if (GestionCliente.clienteLogeado == null){
                        mensaje.mostrarError("Error, ese usuario no esta registrado");
                        decision = editText.texto("Desea volver a intentar introducir un usuario? S para si, N para no");

                    }
                    if (decision.equals("N")){
                        break;
                    }


                }while (GestionCliente.clienteLogeado == null);
                break;

            case 3:
                GestionCliente.clienteDefault();
                break;
        }


    }
}

