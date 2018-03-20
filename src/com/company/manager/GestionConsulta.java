package com.company.manager;

public class GestionConsulta {

    public void Consulta (GestionAtraccion gestionAtraccion) {
        for (int x=0; x < gestionAtraccion.numeroAtracciones; x++){
            if (gestionAtraccion.lista[x].maintenance){
                System.out.println(gestionAtraccion.lista[x].getClass().getSimpleName() + " esta en" + " \u001B[31mMANTENIMIENTO\u001B[0m");
            }
            else if (gestionAtraccion.lista[x].open) {
                System.out.println(gestionAtraccion.lista[x].getClass().getSimpleName() + " esta" + " \u001B[32mABIERTA\u001B[0m");
            }
            else {
                System.out.println(gestionAtraccion.lista[x].getClass().getSimpleName() + " esta" + " \u001B[31mCERRADA\u001B[0m");
            }


        }
    }
}
