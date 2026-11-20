package org.uabc.luisnava.control;

import org.uabc.luisnava.modelo.*;
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
                            int agresivo;
                            int hiper;
                            do {
                                agresivo = vista.leerNumero("Escribe el nivel de agresividad: ");
                                hiper = vista.leerNumero("Escribe el nivel de hiperactividad");

                                if ((agresivo < 1 || agresivo > 10) || (hiper < 1 || hiper > 10)){
                                    System.out.println("Ingresa valores del 1 al 10!");
                                }

                            } while ((agresivo < 1 || agresivo > 10) || (hiper < 1 || hiper > 10));

                            modelo.agregarPerro(nombre,0,10,10,10,agresivo, hiper, 10);
                            break;

                        case 2: //Se crea Gato
                            int afectividad;
                            int curiosidad;
                            do {
                                afectividad = vista.leerNumero("Escribe el nivel de afectividad: ");
                                curiosidad = vista.leerNumero("Escribe el nivel de curiosidad");

                                if ((afectividad < 0 || afectividad > 10) || (curiosidad < 0 || curiosidad > 10)){
                                    System.out.println("Ingresa valores del 1 al 10!");
                                }

                            } while ((afectividad < 0 || afectividad > 10) || (curiosidad < 0 || curiosidad > 10));

                            modelo.agregarGato(nombre, 0, 100, 100, 100, afectividad, curiosidad);
                            break;

                        case 3: //Se crea Cuyo
                            int territorial;
                            int miedo;
                            do {
                                territorial = vista.leerNumero("Escribe el nivel que tiene de territorial: ");
                                miedo = vista.leerNumero("Escribe el nivel de miedo: ");
                            } while ((territorial < 0 || territorial > 10) || (miedo < 0 || miedo > 10));

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
                    if (opcionParaMascota >= 1 && opcionParaMascota<= modelo.getTamanoArrayList()){
                        System.out.println(modelo.getTamaotchiPosicion(opcionParaMascota - 1));
                        vista.mostrarMenuOpcionesMascotas();
                        int opcionMenuMascotas = vista.leerNumero("");
                        Tamagotchi t = modelo.getArrayList().get(opcionParaMascota - 1);

                        if (t instanceof Perro){
                            switch (opcionMenuMascotas){
                                case 1:
                                    ((Perro) modelo.getArrayList().get(opcionParaMascota - 1)).jugar();
                                    if (modelo.getArrayList().get(opcionParaMascota - 1).getFelicidad() > 10){
                                        modelo.getArrayList().get(opcionParaMascota - 1).setFelicidad(10);
                                    }

                                    ((Perro) modelo.getArrayList().get(opcionParaMascota - 1)).ladrar();
                                    ((Perro) modelo.getArrayList().get(opcionParaMascota - 1)).perseguirCola();
                                    System.out.println("\n//////////Estadisticas Nuevas///////////");
                                    System.out.println(modelo.getTamaotchiPosicion(opcionParaMascota - 1));
                                    break;

                                    case 2:
                                        ((Perro) modelo.getArrayList().get(opcionParaMascota - 1)).comer(1);
                                        if (modelo.getArrayList().get(opcionParaMascota - 1).getHambre() < 1){
                                            modelo.getArrayList().get(opcionParaMascota - 1).setHambre(0);
                                        }
                                        if (modelo.getArrayList().get(opcionParaMascota - 1).getEnergia() > 10){
                                            modelo.getArrayList().get(opcionParaMascota - 1).setEnergia(10);
                                        }

                                        System.out.println("\n//////////Estadisticas Nuevas///////////");
                                        System.out.println(modelo.getTamaotchiPosicion(opcionParaMascota - 1));
                                        break;

                                    case 3:
                                        int horasDeSueno;
                                        do {
                                            horasDeSueno = vista.leerNumero("Cuantas horas quieres que duerma?");

                                            if (horasDeSueno < 1 || horasDeSueno > 9) {
                                                System.out.printf("Ingresa horas validas! (1 a 9)");
                                            }

                                        } while (horasDeSueno < 1 || horasDeSueno > 9);
                                        ((Perro) modelo.getArrayList().get(opcionParaMascota - 1)).dormir(horasDeSueno);

                                        if (modelo.getArrayList().get(opcionParaMascota - 1).getEnergia() > 10){
                                            modelo.getArrayList().get(opcionParaMascota - 1).setEnergia(10);
                                        }

                                        System.out.println("\n//////////Estadisticas Nuevas///////////");
                                        System.out.println(modelo.getTamaotchiPosicion(opcionParaMascota - 1));

                                        break;
                                    case 4:
                                        ((Perro) modelo.getArrayList().get(opcionParaMascota - 1)).sanar();

                                        System.out.println("\n//////////Estadisticas Nuevas///////////");
                                        System.out.println(modelo.getTamaotchiPosicion(opcionParaMascota - 1));

                                        break;
                                }
                            }

                        else if (t instanceof Gato){
                            switch (opcionMenuMascotas){
                                case 1:
                                    ((Gato) modelo.getArrayList().get(opcionParaMascota - 1)).jugar();
                                    if (modelo.getArrayList().get(opcionParaMascota - 1).getFelicidad() > 10){
                                        modelo.getArrayList().get(opcionParaMascota - 1).setFelicidad(10);
                                    }
                                    ((Gato) modelo.getArrayList().get(opcionParaMascota - 1)).maullar();
                                    System.out.println("\n//////////Estadisticas Nuevas///////////");
                                    System.out.println(modelo.getTamaotchiPosicion(opcionParaMascota - 1));
                                    break;

                                case 2:
                                    ((Gato) modelo.getArrayList().get(opcionParaMascota - 1)).comer(1);
                                    ((Gato) modelo.getArrayList().get(opcionParaMascota - 1)).ronronear();
                                    if (modelo.getArrayList().get(opcionParaMascota - 1).getHambre() < 1){
                                        modelo.getArrayList().get(opcionParaMascota - 1).setHambre(0);
                                    }
                                    if (modelo.getArrayList().get(opcionParaMascota - 1).getEnergia() > 10){
                                        modelo.getArrayList().get(opcionParaMascota - 1).setEnergia(10);
                                    }

                                    System.out.println("\n//////////Estadisticas Nuevas///////////");
                                    System.out.println(modelo.getTamaotchiPosicion(opcionParaMascota - 1));
                                    break;

                                case 3:
                                    int horasDeSueno;
                                    do {
                                        horasDeSueno = vista.leerNumero("Cuantas horas quieres que duerma?");

                                        if (horasDeSueno < 1 || horasDeSueno > 9) {
                                            System.out.printf("Ingresa horas validas! (1 a 9)");
                                        }

                                    } while (horasDeSueno < 1 || horasDeSueno > 9);
                                    ((Gato) modelo.getArrayList().get(opcionParaMascota - 1)).dormir(horasDeSueno);

                                    if (modelo.getArrayList().get(opcionParaMascota - 1).getEnergia() > 10){
                                        modelo.getArrayList().get(opcionParaMascota - 1).setEnergia(10);
                                    }
                                    System.out.println("\n//////////Estadisticas Nuevas///////////");
                                    System.out.println(modelo.getTamaotchiPosicion(opcionParaMascota - 1));

                                    break;
                                case 4:
                                    ((Gato) modelo.getArrayList().get(opcionParaMascota - 1)).sanar();
                                    System.out.println("\n//////////Estadisticas Nuevas///////////");
                                    System.out.println(modelo.getTamaotchiPosicion(opcionParaMascota - 1));
                                    break;
                                case 5:
                                    ((Gato) modelo.getArrayList().get(opcionParaMascota - 1)).limpiarse();
                                    System.out.println("\n//////////Estadisticas Nuevas///////////");
                                    System.out.println(modelo.getTamaotchiPosicion(opcionParaMascota - 1));
                                    break;

                            }
                        }

                        else if (t instanceof Cuyo){
                            switch (opcionMenuMascotas) {
                                case 1:
                                    ((Cuyo) modelo.getArrayList().get(opcionParaMascota - 1)).jugar();
                                    if (modelo.getArrayList().get(opcionParaMascota - 1).getFelicidad() > 10) {
                                        modelo.getArrayList().get(opcionParaMascota - 1).setFelicidad(10);
                                    }
                                    ((Cuyo) modelo.getArrayList().get(opcionParaMascota - 1)).silbido();
                                    System.out.println("\n//////////Estadisticas Nuevas///////////");
                                    System.out.println(modelo.getTamaotchiPosicion(opcionParaMascota - 1));
                                    break;

                                case 2:
                                    ((Cuyo) modelo.getArrayList().get(opcionParaMascota - 1)).comer(1);
                                    ((Cuyo) modelo.getArrayList().get(opcionParaMascota - 1)).silbido();
                                    if (modelo.getArrayList().get(opcionParaMascota - 1).getHambre() < 1) {
                                        modelo.getArrayList().get(opcionParaMascota - 1).setHambre(0);
                                    }
                                    if (modelo.getArrayList().get(opcionParaMascota - 1).getEnergia() > 10) {
                                        modelo.getArrayList().get(opcionParaMascota - 1).setEnergia(10);
                                    }

                                    System.out.println("\n//////////Estadisticas Nuevas///////////");
                                    System.out.println(modelo.getTamaotchiPosicion(opcionParaMascota - 1));
                                    break;

                                case 3:
                                    int horasDeSueno;
                                    do {
                                        horasDeSueno = vista.leerNumero("Cuantas horas quieres que duerma?");

                                        if (horasDeSueno < 1 || horasDeSueno > 9) {
                                            System.out.printf("Ingresa horas validas! (1 a 9)");
                                        }

                                    } while (horasDeSueno < 1 || horasDeSueno > 9);
                                    ((Cuyo) modelo.getArrayList().get(opcionParaMascota - 1)).dormir(horasDeSueno);

                                    if (modelo.getArrayList().get(opcionParaMascota - 1).getEnergia() > 10) {
                                        modelo.getArrayList().get(opcionParaMascota - 1).setEnergia(10);
                                        System.out.println("\n//////////Estadisticas Nuevas///////////");
                                        System.out.println(modelo.getTamaotchiPosicion(opcionParaMascota - 1));
                                    }

                                    break;
                                case 4:
                                    ((Cuyo) modelo.getArrayList().get(opcionParaMascota - 1)).sanar();
                                    System.out.println("\n//////////Estadisticas Nuevas///////////");
                                    System.out.println(modelo.getTamaotchiPosicion(opcionParaMascota - 1));
                                    break;
                            }
                        }

                        else if (t instanceof Muneca){
                            switch (opcionMenuMascotas) {
                                case 1:
                                    ((Muneca) modelo.getArrayList().get(opcionParaMascota - 1)).jugar();
                                    if (modelo.getArrayList().get(opcionParaMascota - 1).getFelicidad() > 10) {
                                        modelo.getArrayList().get(opcionParaMascota - 1).setFelicidad(10);
                                    }
                                    ((Muneca) modelo.getArrayList().get(opcionParaMascota - 1)).hablar("Que divertido! Me gusta mucho jugar!");
                                    ((Muneca) modelo.getArrayList().get(opcionParaMascota - 1)).jugar();
                                    System.out.println("\n//////////Estadisticas Nuevas///////////");
                                    System.out.println(modelo.getTamaotchiPosicion(opcionParaMascota - 1));
                                    break;

                                case 2:
                                    ((Muneca) modelo.getArrayList().get(opcionParaMascota - 1)).comer(1);
                                    ((Muneca) modelo.getArrayList().get(opcionParaMascota - 1)).hablar("Esta muy buena la comida!");
                                    if (modelo.getArrayList().get(opcionParaMascota - 1).getHambre() < 1) {
                                        modelo.getArrayList().get(opcionParaMascota - 1).setHambre(0);
                                    }
                                    if (modelo.getArrayList().get(opcionParaMascota - 1).getEnergia() > 10) {
                                        modelo.getArrayList().get(opcionParaMascota - 1).setEnergia(10);
                                    }

                                    System.out.println("\n//////////Estadisticas Nuevas///////////");
                                    System.out.println(modelo.getTamaotchiPosicion(opcionParaMascota - 1));
                                    break;

                                case 3:
                                    int horasDeSueno;
                                    do {
                                        horasDeSueno = vista.leerNumero("Cuantas horas quieres que duerma?");

                                        if (horasDeSueno < 1 || horasDeSueno > 9) {
                                            System.out.printf("Ingresa horas validas! (1 a 9)");
                                        }

                                    } while (horasDeSueno < 1 || horasDeSueno > 9);
                                    ((Muneca) modelo.getArrayList().get(opcionParaMascota - 1)).dormir(horasDeSueno);

                                    if (modelo.getArrayList().get(opcionParaMascota - 1).getEnergia() > 10) {
                                        modelo.getArrayList().get(opcionParaMascota - 1).setEnergia(10);
                                    }

                                    ((Muneca) modelo.getArrayList().get(opcionParaMascota - 1)).hablar("Que buena siesta tome!");
                                    System.out.println("\n//////////Estadisticas Nuevas///////////");
                                    System.out.println(modelo.getTamaotchiPosicion(opcionParaMascota - 1));

                                    break;
                                case 4:
                                    ((Muneca) modelo.getArrayList().get(opcionParaMascota - 1)).sanar();
                                    System.out.println("\n//////////Estadisticas Nuevas///////////");
                                    System.out.println(modelo.getTamaotchiPosicion(opcionParaMascota - 1));
                                    break;
                            }
                        }




                    }


                    else {
                        System.out.println("Ingresa una mascota valida!");
                    }



                    break;
                case 3:
                    System.out.println();
                    break;
            }

        } while (op != 8);
    }




}