package com.company;
import com.company.manager.Gestion;
import com.company.model.Cliente;
import com.company.view.General;
import com.company.view.PantallaDonacion;
import com.company.view.RegistroCliente;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cliente cliente;
	// write your code here
        Scanner scanner = new Scanner(System.in);

        Gestion gestion = new Gestion();
        gestion.CargarParque();

        General general = new General();
        cliente=general.decision();// para ver que cliente es y poder jugar con el innecesario por ahora



    }

}
