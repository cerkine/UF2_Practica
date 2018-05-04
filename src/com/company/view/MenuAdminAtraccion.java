package com.company.view;

import com.company.view.widget.MenuWidget;


public class MenuAdminAtraccion {
    public int opcion;
    ViewAdminAtraccion viewAdminAtraccion = new ViewAdminAtraccion();
    MenuWidget menu = new MenuWidget();
    public int menuAdmin(){
        menu.crearMenu("Que quieres hacer ?","Mirar las atracciones");
        int opcionDev;
        switch (menu.opcion){
            case 1:
                do{
                    opcionDev=viewAdminAtraccion.mirarAtraccion();
                }while (opcionDev!=0);
                break;
        }
        return opcion;
    }
}
