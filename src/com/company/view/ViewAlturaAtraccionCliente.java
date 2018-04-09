package com.company.view;
import com.company.Main;
import com.company.model.Atraccion;
import com.company.model.Cliente;

public class ViewAlturaAtraccionCliente {

    public void CompararAltura(Cliente cliente, Atraccion[] lista ){
        for (int i = 0; i <lista.length ; i++) {
            if (cliente.height < lista[i].minHeight){
                System.out.println(lista[i].getClass().getSimpleName() + ":  \u001B[31mLo sentimos, eres demasiado bajo para esta atraccion\u001B[0m");
            }
            else if (cliente.height > lista[i].maxHeight){
                System.out.println(lista[i].getClass().getSimpleName() + ": \u001B[31mLo sentimos, eres demasiado alto para esta atraccion\u001B[0m");
            }
            else{
                System.out.println(lista[i].getClass().getSimpleName() + ": \u001B[32mPuedes entrar en la atraccion\u001B[0m");
            }
        }
    }
}
