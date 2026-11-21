package org.uabc.luisnava.vista;

import java.util.Scanner;

public class VistaConsola {
    Scanner leerDatos = new Scanner(System.in);



    public void mostrarDatos(String cadena){
        System.out.println(cadena);
    }

    //Para leer y regresar datos tipo cadena
    public String leerCadena(String cadena){
        System.out.println(cadena);
        return leerDatos.nextLine();
    }

    //Para leer y regresar datos tipo cadena
    public int leerNumero(String cadena){
        System.out.println(cadena);
        int numero = leerDatos.nextInt();
        leerDatos.nextLine();
        return numero;
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

        int numero = leerDatos.nextInt();
        leerDatos.nextLine();
        return numero;
    }

    public int mostrarOpcionesTamagotchi(){
        System.out.println("Selecciona la opcion de tamagotchi que deseas crear:");
        System.out.println("1. Perro");
        System.out.println("2. Gato");
        System.out.println("3. Cuyo");
        System.out.println("4. Muñeca");
        int numero = leerDatos.nextInt();
        leerDatos.nextLine();
        return numero;
    }

    public void mostrarMenuOpcionesMascotas(){
        System.out.println("¿Que quieres hacer con la mascota?");
        System.out.println("1. Jugar con el/ella");
        System.out.println("2. Darle alimento");
        System.out.println("3. Ponerla/o a dormir");
        System.out.println("4. Curarlo");
        System.out.println("5. Salir");
    }

    public void muertePorHambre(){
        System.out.println("OH NO! Dejaste morir a tu mascota de hambre! IRRESPONSABLE!");
    }

    public void muertePorFelicidad(){
        System.out.println("OH NO! Dejaste morir a tu mascota de aburrimiento! IRRESPONSABLE!");
    }

    public void muertePorEnergia(){
        System.out.println("OH NO! Dejaste morir a tu mascota de sueño! IRRESPONSABLE!");
    }

    public void muertePorSalud(){
        System.out.println("OH NO! Dejaste morir a tu mascota! Descuidaste su salud, IRRESPONSABLE!");
    }

    public int mostrarMenuComidaPerro(){
        System.out.println("¿Qué le quieres dar de comer a tu tamagotchi Perro?");
        System.out.println("1. Sobre Pedigree");
        System.out.println("2. Hueso");
        System.out.println("3. Croquetas");
        int numero = leerDatos.nextInt();
        leerDatos.nextLine();
        return numero;
    }
    public int mostrarMenuComidaGato(){
        System.out.println("¿Qué le quieres dar de comer a tu tamagotchi Gato?");
        System.out.println("1. Sobre Whiskas");
        System.out.println("2. Pescado");
        System.out.println("3. Leche tibia");
        int numero = leerDatos.nextInt();
        leerDatos.nextLine();
        return numero;
    }
    public int mostrarMenuComidaCuyo(){
        System.out.println("¿Qué le quieres dar de comer a tu tamagotchi Cuyo?");
        System.out.println("1. Lechuga");
        System.out.println("2. Heno");
        System.out.println("3. Pienso");
        int numero = leerDatos.nextInt();
        leerDatos.nextLine();
        return numero;
    }
    public int mostrarMenuComidaMuneca(){
        System.out.println("¿Qué le quieres dar de comer a tu tamagotchi Muñeca?");
        System.out.println("1. Galleta");
        System.out.println("2. Pastel");
        System.out.println("3. Té");
        int numero = leerDatos.nextInt();
        leerDatos.nextLine();
        return numero;
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