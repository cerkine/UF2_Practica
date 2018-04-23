package com.company.view;
import com.company.manager.GestionAtraccion;
import com.company.manager.GestionCliente;
import com.company.model.Atraccion;
import com.company.view.widget.Mensaje;


public class ViewAlturaAtraccionCliente {

    public static void compararAltura(){
        Mensaje mensaje = new Mensaje();

        for (int i = 0; i < GestionAtraccion.lista.length ; i++) {
            if (GestionCliente.clienteLogeado.height < GestionAtraccion.lista[i].minHeight){
                System.out.println(GestionAtraccion.lista[i].getClass().getSimpleName());
                mensaje.mostrarError("Lo sentimos, eres demasiado bajo para esta atraccion");
            }
            else if (GestionCliente.clienteLogeado.height > GestionAtraccion.lista[i].maxHeight){
                System.out.println(GestionAtraccion.lista[i].getClass().getSimpleName());
                mensaje.mostrarError("Lo sentimos, eres demasiado alto para esta atraccion");
            }
            else{
                System.out.println(GestionAtraccion.lista[i].getClass().getSimpleName() + ": \u001B[32mPuedes entrar en la atraccion\u001B[0m");
            }
        }
    }
    public static void compararAltura(Atraccion lista){
        Mensaje mensaje = new Mensaje();
            if (GestionCliente.clienteLogeado.height < lista.minHeight){
                System.out.println(lista.getClass().getSimpleName());
                mensaje.mostrarError("Lo sentimos, eres demasiado bajo para esta atraccion");
            }
            else if (GestionCliente.clienteLogeado.height > lista.maxHeight){
                System.out.println(lista.getClass().getSimpleName());
                mensaje.mostrarError("Lo sentimos, eres demasiado alto para esta atraccion");
            }
            else{
                System.out.println(lista.getClass().getSimpleName() + ": \u001B[32mPuedes entrar en la atraccion\u001B[0m");
            }
        }
    }

