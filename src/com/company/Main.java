package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
//        Scanner scanner = new Scanner(System.in);
//        Seccion seccion = new Seccion();
//        seccion.ChangeSeccion();
//        Atraccion atraccion = new Atraccion();
//        atraccion.CargarSeccion(seccion);
//        atraccion.Change();
//        System.out.println("Quieres consultar el estado de las atracciones?");
//        if (scanner.nextLine().toLowerCase().equals("si")) {
//            atraccion.Consulta();
//        }

        cliente.pedirDatos();
        cliente.mostrardatos();
    }

}
