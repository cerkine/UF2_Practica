package com.company;

public class Atraccion {
    Atraccion [] lista = new Atraccion[7];
    boolean open;
    boolean maintenance;
    double price;
    double maxHeight;
    double minHeight;
    int numeroAtracciones=7;
    Seccion seccion;

    void Change(){
        lista[0]= new Tiovivo();
        lista[0].CargarSeccion(seccion.sitios[0]);
        lista[1] = new MontañaRusa();
        lista[1].CargarSeccion(seccion.sitios[1]);
        lista[2] = new AutosChoque();
        lista[2].CargarSeccion(seccion.sitios[2]);
        lista[3] = new ZonaArcade();
        lista[3].CargarSeccion(seccion.sitios[3]);
        lista[4] = new Toroloco();
        lista[4].CargarSeccion(seccion.sitios[4]);
        lista[5] = new Tronquitos();
        lista[5].CargarSeccion(seccion.sitios[5]);
        lista[6] = new Noria();
        lista[6].CargarSeccion(seccion.sitios[6]);

        for (int x=0; x < numeroAtracciones; x++) {
            lista[x].CambiarAtr();
        }
    }

    void CambiarAtr () {

    }

    void CargarSeccion(Seccion seccionPasada){
        seccion=seccionPasada;
    }

    void Consulta () {
        for (int x=0; x < numeroAtracciones; x++){
            if (lista[x].maintenance){
                System.out.println(lista[x].getClass().getSimpleName() + " esta en mantenimiento, lo sentimos");
            }
            else if (lista[x].open){
                System.out.println(lista[x].getClass().getSimpleName() + " esta" + " \u001B[32mABIERTA\u001B[0m");
            }
            else {
                System.out.println(lista[x].getClass().getSimpleName() + " esta" + " \u001B[31mCERRADA\u001B[0m");
            }


        }
    }
}
