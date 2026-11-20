package org.uabc.luisnava;

import org.uabc.luisnava.control.Controlador;
import org.uabc.luisnava.modelo.Coleccion;
import org.uabc.luisnava.vista.VistaConsola;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Coleccion modelo = new Coleccion();
        VistaConsola vista = new VistaConsola();

        Controlador controlador = new Controlador(vista, modelo);
        controlador.iniciar();
    }
}
