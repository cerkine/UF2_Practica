package com.company.view;

import com.company.model.Cliente;
import com.company.model.Donacion;
import com.company.view.widget.EditText;
import com.company.view.widget.WindowTitle;

import java.util.Scanner;

public class RegistroCliente {
    Scanner scanner = new Scanner(System.in);
    EditText editText = new EditText();
    PantallaDonacion pantalladonacion = new PantallaDonacion();
    Donacion donacion;

    public Cliente pedirDatos(Cliente cliente){

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

        if (cliente.ages > 17) {
            System.out.println("¿Quieres hacerte la tarjeta de socio? (Pon si para confirmar)");

            if (scanner.nextLine().equals("si")) {
                cliente.subscrption = true;
            }

            System.out.println("¿Quieres donar? (Pon si para confirmar)");
            if (scanner.nextLine().equals("si")) {
                cliente.donation = true;
                pantalladonacion.donar(cliente,donacion);
            }
        }
        return cliente;
    }
    public String pedirDni () {
        return editText.texto("DNI");


    }
    public String pedirPass (){
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
