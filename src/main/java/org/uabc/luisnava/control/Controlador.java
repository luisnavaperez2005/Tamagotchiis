package org.uabc.luisnava.control;

import org.uabc.luisnava.modelo.*;
import org.uabc.luisnava.vista.VistaConsola;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import java.util.ArrayList;


public class Controlador {
    private VistaConsola vista;
    private Coleccion modelo;

    //Para el tiempo
    ScheduledExecutorService temporizador = Executors.newSingleThreadScheduledExecutor();



    public Controlador(VistaConsola vista, Coleccion modelo){
        this.vista = vista;
        this.modelo = modelo;
    }

    public void iniciar(){
        int op = 0;
        int tp = 0;

        temporizador.scheduleAtFixedRate(() -> {
            for (Tamagotchi t:modelo.getArrayList()){
                if (t instanceof Perro) {
                    if (!((Perro) t).morir()) {
                        t.disminuirEnergia();
                        ((Perro) t).morir();
                    }
                }

                else if (t instanceof Gato){
                    if (!((Gato) t).morir()) {
                        t.disminuirEnergia();
                        ((Gato) t).morir();
                    }
                }

                else if (t instanceof Cuyo) {
                    if (!((Cuyo) t).morir()) {
                        t.disminuirEnergia();
                        ((Cuyo) t).morir();
                    }
                }

                else if (t instanceof Muneca) {
                    if (!((Muneca) t).morir()) {
                        t.disminuirEnergia();
                        ((Muneca) t).morir();
                    }
                }


            }
        }, 3, 3, TimeUnit.MINUTES);


        temporizador.scheduleAtFixedRate(() -> {
            for (Tamagotchi t:modelo.getArrayList()){
                if (t instanceof Perro) {
                    if (!((Perro) t).morir()) {
                        t.aumentarHambre();
                        ((Perro) t).morir();
                    }
                }

                else if (t instanceof Gato){
                    if (!((Gato) t).morir()) {
                        t.aumentarHambre();
                        ((Gato) t).morir();
                    }
                }

                else if (t instanceof Cuyo) {
                    if (!((Cuyo) t).morir()) {
                        t.aumentarHambre();
                        ((Cuyo) t).morir();
                    }
                }

                else if (t instanceof Muneca) {
                    if (!((Muneca) t).morir()) {
                        t.aumentarHambre();
                        ((Muneca) t).morir();
                    }
                }


            }
        }, 2, 2, TimeUnit.MINUTES);

        temporizador.scheduleAtFixedRate(() -> {
            for (Tamagotchi t:modelo.getArrayList()){
                if (t instanceof Perro) {
                    if (!((Perro) t).morir()) {
                        t.disminuirFelicidad();
                        ((Perro) t).morir();
                    }
                }

                else if (t instanceof Gato){
                    if (!((Gato) t).morir()) {
                        t.disminuirFelicidad();
                        ((Gato) t).morir();
                    }
                }

                else if (t instanceof Cuyo) {
                    if (!((Cuyo) t).morir()) {
                        t.disminuirFelicidad();
                        ((Cuyo) t).morir();
                    }
                }

                else if (t instanceof Muneca) {
                    if (!((Muneca) t).morir()) {
                        t.disminuirFelicidad();
                        ((Muneca) t).morir();
                    }
                }


            }
        }, 1, 1, TimeUnit.MINUTES);

        temporizador.scheduleAtFixedRate(() -> {
            for (Tamagotchi t:modelo.getArrayList()){
                if (t instanceof Perro) {
                    if (!((Perro) t).morir()) {
                        t.disminuirSalud();
                        ((Perro) t).morir();
                    }
                }

                else if (t instanceof Gato){
                    if (!((Gato) t).morir()) {
                        t.disminuirSalud();
                        ((Gato) t).morir();
                    }
                }

                else if (t instanceof Cuyo) {
                    if (!((Cuyo) t).morir()) {
                        t.disminuirSalud();
                        ((Cuyo) t).morir();
                    }
                }

                else if (t instanceof Muneca) {
                    if (!((Muneca) t).morir()) {
                        t.disminuirSalud();
                        ((Muneca) t).morir();
                    }
                }


            }
        }, 5, 5, TimeUnit.MINUTES);



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

                            modelo.agregarGato(nombre, 0, 10, 10, 10, afectividad, curiosidad);
                            break;

                        case 3: //Se crea Cuyo
                            int territorial;
                            int miedo;
                            do {
                                territorial = vista.leerNumero("Escribe el nivel que tiene de territorial: ");
                                miedo = vista.leerNumero("Escribe el nivel de miedo: ");
                            } while ((territorial < 0 || territorial > 10) || (miedo < 0 || miedo > 10));

                            modelo.agregarCuyo(nombre, 0, 10, 10, 10, territorial, miedo);
                            break;

                        case 4: //Se crea muñeca
                            modelo.agregarMuneca(nombre, 0, 10, 10, 10);
                            break;
                    }
                    break;

                case 2:
                    System.out.println("/////////// Lista de Tamagotchis ///////////");
                    vista.mostrarDatos(modelo.listaJuguetes());
                    System.out.println("\n");

                    break;

                case 3:
                    StringBuffer cadena = new StringBuffer();
                    for (Tamagotchi t:modelo.getArrayList()) {
                        if (t instanceof Perro) {
                            Perro x = (Perro) t;
                            cadena.append(x.toString());
                        }
                    }
                    System.out.println("///// Mascotas de tipo Perro //////");
                    System.out.println(cadena);
                    break;

                case 4:
                    StringBuffer cadena2 = new StringBuffer();
                    for (Tamagotchi t:modelo.getArrayList()) {
                        if (t instanceof Gato) {
                            Gato x = (Gato) t;
                            cadena2.append(x.toString());
                        }
                    }
                    System.out.println("///// Mascotas de tipo Gato //////");
                    System.out.println(cadena2);
                    break;

                    case 5:
                    StringBuffer cadena3 = new StringBuffer();
                    for (Tamagotchi t:modelo.getArrayList()) {
                        if (t instanceof Cuyo) {
                            Cuyo x = (Cuyo) t;
                            cadena3.append(x.toString());
                        }
                    }
                    System.out.println("///// Mascotas de tipo Cuyo //////");
                    System.out.println(cadena3);
                    break;

                case 6:
                    StringBuffer cadena4 = new StringBuffer();
                    for (Tamagotchi t:modelo.getArrayList()) {
                        if (t instanceof Muneca) {
                            Muneca x = (Muneca) t;
                            cadena4.append(x.toString());
                        }
                    }
                    System.out.println("///// Mascotas de tipo Muñeca //////");
                    System.out.println(cadena4);
                    break;



                case 7:
                    int numeroDeLista = 1;
                    for (int i = 0; i < modelo.getTamanoArrayList(); i++){
                        System.out.println(numeroDeLista +". "+ modelo.getArrayList().get(i).getNombre());
                        numeroDeLista++;
                    }


                    int opcionParaMascota = vista.leerNumero("Elige la mascota: ");
                    if (opcionParaMascota >= 1 && opcionParaMascota<= modelo.getTamanoArrayList()) {
                        Tamagotchi t = modelo.getArrayList().get(opcionParaMascota - 1);
                        boolean murio = false;
                        do {
                            if (t instanceof Perro) {
                                murio = ((Perro) t).morir();
                            } else if (t instanceof Gato) {
                                murio = ((Gato) t).morir();
                            } else if (t instanceof Cuyo) {
                                murio = ((Cuyo) t).morir();
                            } else if (t instanceof Muneca) {
                                murio = ((Muneca) t).morir();
                            }

                            if (murio) {
                                if (modelo.getArrayList().get(opcionParaMascota - 1).getSalud() <= 0){
                                    vista.muertePorSalud();
                                }

                                else if (modelo.getArrayList().get(opcionParaMascota - 1).getEnergia() <= 0){
                                    vista.muertePorEnergia();
                                }

                                else if (modelo.getArrayList().get(opcionParaMascota - 1).getFelicidad() <= 0){
                                    vista.muertePorFelicidad();
                                }

                                else if (modelo.getArrayList().get(opcionParaMascota - 1).getHambre() >= 10){
                                    vista.muertePorHambre();
                                }
                                break;

                            }
                            else {
                                int opcionMenuMascotas;

                                System.out.println(modelo.getTamaotchiPosicion(opcionParaMascota - 1));
                                vista.mostrarMenuOpcionesMascotas();
                                opcionMenuMascotas = vista.leerNumero("");

                                if (t instanceof Perro) {
                                    murio = ((Perro) t).morir();
                                } else if (t instanceof Gato) {
                                    murio = ((Gato) t).morir();
                                } else if (t instanceof Cuyo) {
                                    murio = ((Cuyo) t).morir();
                                } else if (t instanceof Muneca) {
                                    murio = ((Muneca) t).morir();
                                }

                                if (murio){
                                    break;
                                }

                                else if (t instanceof Perro) {
                                    switch (opcionMenuMascotas) {
                                        case 1:
                                            ((Perro) modelo.getArrayList().get(opcionParaMascota - 1)).jugar();
                                            if (modelo.getArrayList().get(opcionParaMascota - 1).getFelicidad() > 10) {
                                                modelo.getArrayList().get(opcionParaMascota - 1).setFelicidad(10);
                                            }

                                            ((Perro) modelo.getArrayList().get(opcionParaMascota - 1)).ladrar();
                                            ((Perro) modelo.getArrayList().get(opcionParaMascota - 1)).perseguirCola();
                                            System.out.println("\n//////////Estadisticas Nuevas///////////");
                                            System.out.println(modelo.getTamaotchiPosicion(opcionParaMascota - 1));
                                            break;

                                        case 2:
                                            ((Perro) modelo.getArrayList().get(opcionParaMascota - 1)).comer(1);
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
                                            ((Perro) modelo.getArrayList().get(opcionParaMascota - 1)).dormir(horasDeSueno);

                                            if (modelo.getArrayList().get(opcionParaMascota - 1).getEnergia() > 10) {
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

                                        case 5:
                                            break;

                                        default:
                                            System.out.println("Ingresa una opcion valida!");
                                            break;
                                    }
                                } else if (t instanceof Gato) {
                                    switch (opcionMenuMascotas) {
                                        case 1:
                                            ((Gato) modelo.getArrayList().get(opcionParaMascota - 1)).jugar();
                                            if (modelo.getArrayList().get(opcionParaMascota - 1).getFelicidad() > 10) {
                                                modelo.getArrayList().get(opcionParaMascota - 1).setFelicidad(10);
                                            }
                                            ((Gato) modelo.getArrayList().get(opcionParaMascota - 1)).maullar();
                                            System.out.println("\n//////////Estadisticas Nuevas///////////");
                                            System.out.println(modelo.getTamaotchiPosicion(opcionParaMascota - 1));
                                            break;

                                        case 2:
                                            ((Gato) modelo.getArrayList().get(opcionParaMascota - 1)).comer(1);
                                            ((Gato) modelo.getArrayList().get(opcionParaMascota - 1)).ronronear();
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
                                            ((Gato) modelo.getArrayList().get(opcionParaMascota - 1)).dormir(horasDeSueno);

                                            if (modelo.getArrayList().get(opcionParaMascota - 1).getEnergia() > 10) {
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
                                            break;

                                        default:
                                            System.out.println("Ingresa una opcion valida!");
                                            break;
                                    }

                                } else if (t instanceof Cuyo) {
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
                                            }

                                            System.out.println("\n//////////Estadisticas Nuevas///////////");
                                            System.out.println(modelo.getTamaotchiPosicion(opcionParaMascota - 1));

                                            break;
                                        case 4:
                                            ((Cuyo) modelo.getArrayList().get(opcionParaMascota - 1)).sanar();
                                            System.out.println("\n//////////Estadisticas Nuevas///////////");
                                            System.out.println(modelo.getTamaotchiPosicion(opcionParaMascota - 1));
                                            break;

                                        case 5:
                                            break;

                                        default:
                                            System.out.println("Ingresa una opcion valida!");
                                            break;
                                    }

                                } else if (t instanceof Muneca) {
                                    if (modelo.getArrayList().get(opcionParaMascota - 1).getEnergia() <= 3) {
                                        ((Muneca) modelo.getArrayList().get(opcionParaMascota - 1)).hablar("Tu muñeca dijo: Tengo sueño! Quiero DORMIR!!!!");
                                        ((Muneca) modelo.getArrayList().get(opcionParaMascota - 1)).llorar();
                                    }

                                    if (modelo.getArrayList().get(opcionParaMascota - 1).getHambre() >= 6) {
                                        ((Muneca) modelo.getArrayList().get(opcionParaMascota - 1)).hablar("Tu muñeca dijo: Tengo hambre! Dame COMIDA!!!!");
                                        ((Muneca) modelo.getArrayList().get(opcionParaMascota - 1)).llorar();
                                    }

                                    if (modelo.getArrayList().get(opcionParaMascota - 1).getSalud() <= 3) {
                                        ((Muneca) modelo.getArrayList().get(opcionParaMascota - 1)).hablar("Tu muñeca dijo: Me siento mal :( Por favor dame MEDICAMENTO!!!!");
                                        ((Muneca) modelo.getArrayList().get(opcionParaMascota - 1)).llorar();
                                    }

                                    if (modelo.getArrayList().get(opcionParaMascota - 1).getFelicidad() <= 3) {
                                        ((Muneca) modelo.getArrayList().get(opcionParaMascota - 1)).hablar("Tu muñeca dijo: VAMOS A JUGAR!!!! Estoy aburrida :(");
                                    }

                                    switch (opcionMenuMascotas) {
                                        case 1:
                                            ((Muneca) modelo.getArrayList().get(opcionParaMascota - 1)).jugar();
                                            if (modelo.getArrayList().get(opcionParaMascota - 1).getFelicidad() > 10) {
                                                modelo.getArrayList().get(opcionParaMascota - 1).setFelicidad(10);
                                            }
                                            ((Muneca) modelo.getArrayList().get(opcionParaMascota - 1)).hablar("Tu muñeca dijo: Que divertido! Me gusta mucho jugar!");
                                            ((Muneca) modelo.getArrayList().get(opcionParaMascota - 1)).jugar();
                                            System.out.println("\n//////////Estadisticas Nuevas///////////");
                                            System.out.println(modelo.getTamaotchiPosicion(opcionParaMascota - 1));
                                            break;

                                        case 2:
                                            ((Muneca) modelo.getArrayList().get(opcionParaMascota - 1)).comer(1);
                                            ((Muneca) modelo.getArrayList().get(opcionParaMascota - 1)).hablar("Tu muñeca dijo: Esta muy buena la comida! Gracias!");
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

                                            ((Muneca) modelo.getArrayList().get(opcionParaMascota - 1)).hablar("Tu muñeca dijo: Que buena siesta tome!");
                                            System.out.println("\n//////////Estadisticas Nuevas///////////");
                                            System.out.println(modelo.getTamaotchiPosicion(opcionParaMascota - 1));

                                            break;
                                        case 4:
                                            ((Muneca) modelo.getArrayList().get(opcionParaMascota - 1)).sanar();
                                            System.out.println("\n//////////Estadisticas Nuevas///////////");
                                            System.out.println(modelo.getTamaotchiPosicion(opcionParaMascota - 1));
                                            break;

                                        case 5:
                                            break;

                                        default:
                                            System.out.println("Ingresa una opcion valida!");
                                            break;
                                    }
                                }

                            }

                        } while (opcionParaMascota !=  5 && !murio);
                    }
                    else {
                        System.out.println("Ingresa una mascota valida!");
                    }
                    break;
            }

        } while (op != 8);
    }




}