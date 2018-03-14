package com.company;

import java.util.Scanner;

public class Cliente {
    String name;
    String subname;
    String DNI;
    String mail;
    boolean subscrption = false;
    int ages;
    boolean donation =false;
    int donate;

    void pedirDatos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("INTRODUCE TUS DATOS");
        System.out.println();
        System.out.println("Como te llamas");
        name = scanner.nextLine();

        System.out.println("Introduce tus apellidos");
        subname = scanner.nextLine();

        System.out.println("Introduce tu DNI");
        DNI = scanner.nextLine();

        System.out.println("Intriduce tu email");
        mail = scanner.nextLine();

        System.out.println("¿Quieres hacerte la tarjeta de socio?");

        if (scanner.nextLine() == "si"){
            subscrption =true;
        }

        System.out.println("¿Que edad tienes?");
        ages = scanner.nextInt();

        System.out.println("¿Quieres donar?");
        if (scanner.nextLine() == "si"){
            donation =true;
        }

    }

    void mostrardatos(){

        System.out.println("******");

    }

}


