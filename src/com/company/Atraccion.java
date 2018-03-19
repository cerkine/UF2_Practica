package com.company;

public class Atraccion {
    Class[] classes = {Tiovivo.class, MontañaRusa.class, AutosChoque.class, CarreraCaballos.class, Noria.class, Pacman.class, PiedraPapelTijeraLagartoSpok.class, Toroloco.class, Tragaperras.class, Tronquitos.class, ZonaArcade.class};
    Atraccion [] lista = new Atraccion[classes.length];
    boolean open;
    boolean maintenance;
    double price;
    double maxHeight;
    double minHeight;
    Seccion seccion;
    int code_place;

    void Change(){
        for (int x=0; x < classes.length; x++) {
            try {
                lista[x] = (Atraccion) classes[x].newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            lista[x].CambiarAtr();
        }
    }

    void CambiarAtr () {

    }

    void CargarSeccion(Seccion seccionPasada){
        seccion=seccionPasada;
    }

    void Consulta () {
        for (int x=0; x < lista.length; x++){
            if (lista[x].maintenance){
                System.out.println(lista[x].getClass().getSimpleName() + " esta en" + " \u001B[31mMANTENIMIENTO\u001B[0m");
            }
            else if (lista[x].open) {
                System.out.println(lista[x].getClass().getSimpleName() + " esta" + " \u001B[32mABIERTA\u001B[0m");
            }
            else {
                System.out.println(lista[x].getClass().getSimpleName() + " esta" + " \u001B[31mCERRADA\u001B[0m");
            }


        }
    }


}
