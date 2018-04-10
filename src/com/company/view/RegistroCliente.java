package com.company.view;

import com.company.Main;
import com.company.model.Cliente;
import com.company.model.Donacion;
import com.company.view.widget.EditInt;
import com.company.view.widget.EditText;

import java.util.Scanner;

public class RegistroCliente {
    Scanner scanner = new Scanner(System.in);
    EditText editText = new EditText();
    PantallaDonacion pantalladonacion = new PantallaDonacion();
    Donacion donacion;
    EditInt editInt = new EditInt();

    public Cliente pedirDatos(Cliente cliente){
        System.out.println("INTRODUCE TUS DATOS");
        System.out.println();

        cliente.name = editText.read("Introduce tu Nombre");

        cliente.subname = editText.read("Introduce tus Aplliedos"); //scanner.nextLine();


        cliente.DNI = editText.read("Introduce tu DNI");


        cliente.pass = editText.read("Introduce tu Pass");


        cliente.mail = editText.read("Introduce tu Email");


        cliente.ages = editInt.read("Introduce tu Edad");scanner.nextLine();

        System.out.println("Cuanto mides de alto?");
        cliente.height = scanner.nextDouble();scanner.nextLine();

        if (cliente.ages > 17) {
            System.out.println("¿Quieres hacerte la tarjeta de socio?");

            if (scanner.nextLine().equals("si")) {
                cliente.subscrption = true;
            }

            System.out.println("¿Quieres donar?");
            if (scanner.nextLine().equals("si")) {
                cliente.donation = true;
                pantalladonacion.donar(cliente,donacion);
            }
        }
        return cliente;
    }
    public String pedirDni () {
        System.out.println("Dni");
        return scanner.nextLine();
    }
    public String pedirPass (){
        System.out.println("Pass");
        return scanner.nextLine();

    }

}

