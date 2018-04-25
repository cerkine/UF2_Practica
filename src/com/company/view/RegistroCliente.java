package com.company.view;

import com.company.manager.Gestion;
import com.company.manager.GestionCliente;
import com.company.model.Cliente;
import com.company.model.Donacion;
import com.company.view.widget.EditText;
import com.company.view.widget.WindowTitle;

import java.util.Scanner;

public class RegistroCliente {
    static EditText editText = new EditText();

    public static Cliente pedirDatos(){
        Cliente cliente = GestionCliente.clienteLogeado;
        WindowTitle windowTitle = new WindowTitle();

        windowTitle.show("REGISTRO DE CLIENTE");

        System.out.println("INTRODUCE TUS DATOS");
        System.out.println();

        cliente.name = editText.texto("Introduce tu nombre:");
        cliente.subname = editText.texto("Introduce tu apellido:");
        cliente.DNI = editText.texto("Introduce tu DNI:");
        cliente.pass = editText.texto("Introduce tu pass");
        cliente.mail = editText.texto("Intriduce tu email");
        cliente.ages = editText.numero("¿Que edad tienes?");
        cliente.height = editText.altura("Cuanto mides de alto?");
        cliente.dinero=editText.numero("Cuanto money hay en tu cartera");
        return cliente;

    }
    public static String pedirDni () {
        return editText.texto("DNI");


    }
    public static String pedirPass (){
        return editText.texto("Pass");

    }
    public void mostrardatos(Cliente cliente){

        System.out.println("Tus Datos");
        System.out.println();
        System.out.println("Nombre: "+cliente.name);
        System.out.println("Apellidos: "+cliente.subname);
        System.out.println("DNI: "+cliente.DNI);
        System.out.println("Socio: "+cliente.subscrption);

    }
}
