package org.uabc.luisnava.vista;

import java.util.Scanner;

public class VistaConsola {
    Scanner leerNumeros = new Scanner(System.in);
    Scanner leerCadenas = new Scanner(System.in);


    public void mostrarDatos(String cadena){
        System.out.println(cadena);
    }

    //Para leer y regresar datos tipo cadena
    public String leerCadena(String cadena){
        System.out.println(cadena);
        return leerCadenas.nextLine();
    }

    //Para leer y regresar datos tipo cadena
    public int leerNumero(String cadena){
        System.out.println(cadena);
        return leerCadenas.nextInt();
    }

    public int mostrarMenu(){
        System.out.println("1. Registrar Tamagotchi nuevo.");
        System.out.println("2. Mostrar todos los juguetes.");
        System.out.println("3. Mostrar todos los perros");
        System.out.println("4. Mostrar todos los gatos");
        System.out.println("5. Mostrar todos los cuyos");
        System.out.println("6. Mostrar todos las muñecas");
        System.out.println("7. Elegir la mascota para interactuar con ella");
        System.out.println("8. Salir del menu.");

        return leerNumeros.nextInt();
    }

    public int mostrarOpcionesTamagotchi(){
        System.out.println("Selecciona la opcion de tamagotchi que deseas crear:");
        System.out.println("1. Perro");
        System.out.println("2. Gato");
        System.out.println("3. Cuyo");
        System.out.println("4. Muñeca");
        return leerNumeros.nextInt();
    }

/*


    public void imprimirPerro(){
        System.out.println("    /^^^\\");
        System.out.println("   / * * \\");
        System.out.println("  /   Y   \\");
        System.out.println(" V\\_______/V ");
    }

 */






}