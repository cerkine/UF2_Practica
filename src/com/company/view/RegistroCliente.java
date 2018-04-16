package com.company.view;

import com.company.model.Cliente;
import com.company.model.Donacion;
import com.company.view.widget.EditText;

import java.util.Scanner;

public class RegistroCliente {
    Scanner scanner = new Scanner(System.in);
    EditText editText = new EditText();
    PantallaDonacion pantalladonacion = new PantallaDonacion();
    Donacion donacion;

    public Cliente pedirDatos(Cliente cliente){
        System.out.println("INTRODUCE TUS DATOS");
        System.out.println();
        System.out.println("Como te llamas");
        cliente.name = scanner.nextLine();

       // System.out.println("Introduce tus apellidos");
        cliente.subname = editText.read("Introduce tus aplliedos"); //scanner.nextLine();

        System.out.println("Introduce tu DNI");
        cliente.DNI = scanner.nextLine();

        System.out.println("Introduce tu pass");
        cliente.pass = scanner.nextLine();

        System.out.println("Intriduce tu email");
        cliente.mail = scanner.nextLine();

        System.out.println("¿Que edad tienes?");
        cliente.ages = scanner.nextInt();scanner.nextLine();

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
