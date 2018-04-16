package com.company.view;
import com.company.Main;
import com.company.model.Atraccion;
import com.company.model.Cliente;
import com.company.view.widget.Mensaje;

public class ViewAlturaAtraccionCliente {

    public void CompararAltura(Cliente cliente, Atraccion[] lista ){
        Mensaje mensaje = new Mensaje();

        for (int i = 0; i <lista.length ; i++) {
            if (cliente.height < lista[i].minHeight){
                System.out.println(lista[i].getClass().getSimpleName());
                mensaje.mostrarError("Lo sentimos, eres demasiado bajo para esta atraccion");
            }
            else if (cliente.height > lista[i].maxHeight){
                System.out.println(lista[i].getClass().getSimpleName());
                mensaje.mostrarError("Lo sentimos, eres demasiado alto para esta atraccion");
            }
            else{
                System.out.println(lista[i].getClass().getSimpleName() + ": \u001B[32mPuedes entrar en la atraccion\u001B[0m");
            }
        }
    }
}
