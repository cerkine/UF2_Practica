package com.company.model;

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

    public void Change(){
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

    public void CambiarAtr () {

    }

    public int getNumeroAtracciones() {
        return numeroAtracciones;
    }

    public void setNumeroAtracciones(int numeroAtracciones) {
        this.numeroAtracciones = numeroAtracciones;
    }

    public Atraccion[] getLista() {
        return lista;
    }

    public void setLista(Atraccion[] lista) {
        this.lista = lista;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean isMaintenance() {
        return maintenance;
    }

    public void setMaintenance(boolean maintenance) {
        this.maintenance = maintenance;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(double maxHeight) {
        this.maxHeight = maxHeight;
    }

    public double getMinHeight() {
        return minHeight;
    }

    public void setMinHeight(double minHeight) {
        this.minHeight = minHeight;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public int getCode_place() {
        return code_place;
    }

    public void setCode_place(int code_place) {
        this.code_place = code_place;
    }

    void CargarSeccion(Seccion seccionPasada){
        seccion=seccionPasada;
    }

    public void Consulta () {
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
