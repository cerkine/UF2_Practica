package com.company;

public class Atraccion {
    int numeroAtracciones=11;
    Atraccion [] lista = new Atraccion[numeroAtracciones+1];
    boolean open;
    boolean maintenance;
    double price;
    double maxHeight;
    double minHeight;
    Seccion seccion;
    int code_place;

    void Change(){
        lista[0]= new Tiovivo();
        lista[1] = new MontañaRusa();
        lista[2] = new AutosChoque();
        lista[3] = new CarreraCaballos();
        lista[4] = new Noria();
        lista[5] = new Pacman();
        lista[6] = new PiedraPapelTijeraLagartoSpok();
        lista[7] = new Toroloco();
        lista[8] = new Tragaperras();
        lista[9] = new Tronquitos();
        lista[10] = new ZonaArcade();
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
