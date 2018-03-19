package com.company.view;

import com.company.model.Cliente;

import java.util.Scanner;

public class RegistroCliente {
    Scanner scanner = new Scanner(System.in);

    public void pedirDatos(Cliente cliente){
        System.out.println("INTRODUCE TUS DATOS");
        System.out.println();
        System.out.println("Como te llamas");
        cliente.name = scanner.nextLine();

        System.out.println("Introduce tus apellidos");
        cliente.subname = scanner.nextLine();

        System.out.println("Introduce tu DNI");
        cliente.DNI = scanner.nextLine();

        System.out.println("Introduce tu pass");
        cliente.pass = scanner.nextLine();

        System.out.println("Intriduce tu email");
        cliente.mail = scanner.nextLine();

        System.out.println("¿Que edad tienes?");
        cliente.ages = scanner.nextInt();scanner.nextLine();

        if (cliente.ages > 17) {
            System.out.println("¿Quieres hacerte la tarjeta de socio?");

            if (scanner.nextLine().equals("si")) {
                cliente.subscrption = true;
            }

            System.out.println("¿Quieres donar?");
            if (scanner.nextLine().equals("si")) {
                cliente.donation = true;
                //pantalladonacion.donar();
            }
        }

    }
    public String comprobarDni () {
        System.out.println("Dni");
        String cDNI = scanner.nextLine();
        return cDNI;
    }
    public String comprobarPass (){
        System.out.println("Pass");
        String Cpass=scanner.nextLine();
        return Cpass;
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
