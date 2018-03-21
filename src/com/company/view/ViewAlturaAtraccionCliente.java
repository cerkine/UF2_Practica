package com.company.view;
import com.company.Main;
import com.company.model.Atraccion;
import com.company.model.Cliente;

public class ViewAlturaAtraccionCliente {

    public void CompararAltura(Cliente cliente, Atraccion lista[] ){
        for (int i = 0; i <lista.length ; i++) {
            if (cliente.height < lista[i].minHeight){
                System.out.println("Lo sentimos, eres demasiado bajo para esta atraccion");
            }
            else if (cliente.height > lista[i].maxHeight){
                System.out.println("Lo sentimos, eres demasiado alto para esta atraccion");
            }
            else{
                System.out.println("Puedes entrar en la atraccion");
            }

        }
    }
}
