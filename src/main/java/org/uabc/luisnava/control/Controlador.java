package org.uabc.luisnava.control;

import org.uabc.luisnava.modelo.Coleccion;
import org.uabc.luisnava.modelo.Tamagotchi;
import org.uabc.luisnava.vista.VistaConsola;

import java.util.ArrayList;


public class Controlador {
    private VistaConsola vista;
    private Coleccion modelo;

    public Controlador(VistaConsola vista, Coleccion modelo){
        this.vista = vista;
        this.modelo = modelo;
    }

    public void iniciar(){
        int op = 0;
        int tp = 0;
        do {
            op = vista.mostrarMenu();

            switch (op){
                case 1:
                    System.out.println("Leer la informacion del tamagotchi");
                    tp = vista.mostrarOpcionesTamagotchi();

                    String nombre = vista.leerCadena("Escribe el nombre de tu tamagotchi: ");
                    //int hambre = vista.leerNumero("Escribe el nivel de hambre:");


                    switch (tp){
                        case 1: //Se crea perro
                            int agresivo = vista.leerNumero("Escribe el nivel de agresividad: ");
                            int hiper = vista.leerNumero("Escribe el nivel de hiperactividad");
                            modelo.agregarPerro(nombre,0,10,10,10,agresivo, hiper, 10);
                            break;

                        case 2: //Se crea Gato
                            int afectividad = vista.leerNumero("Escribe el nivel de afectividad: ");
                            int curiosidad = vista.leerNumero("Escribe el nivel de curiosidad");
                            modelo.agregarGato(nombre, 0, 100, 100, 100, afectividad, curiosidad);
                            break;

                        case 3: //Se crea Cuyo
                            int territorial = vista.leerNumero("Escribe el nivel que tiene de territorial: ");
                            int miedo = vista.leerNumero("Escribe el nivel de miedo: ");
                            modelo.agregarCuyo(nombre, 0, 100, 100, 100, territorial, miedo);
                            break;

                        case 4: //Se crea muñeca
                            modelo.agregarMuneca(nombre, 0, 100, 100, 100);
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Lista de Tamagotchis");
                    vista.mostrarDatos(modelo.listaJuguetes());
                    break;

                case 7:
                    int numeroDeLista = 1;
                    for (int i = 0; i < modelo.getTamanoArrayList(); i++){
                        System.out.println(numeroDeLista +". "+ modelo.getArrayList().get(i).getNombre());
                        numeroDeLista++;
                    }
                    int opcionParaMascota = vista.leerNumero("Elige la mascota: ");




                    break;
                case 3:
                    System.out.println();
                    break;
            }

        } while (op != 7);
    }




}