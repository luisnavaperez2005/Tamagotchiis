package org.uabc.luisnava.modelo;

public class Muneca extends Tamagotchi implements TamagotchiActions{
    //¿Atributos?

    public Muneca(String nombre, int hambre, int energia, int felicidad, int salud){
        super(nombre, hambre, energia, felicidad, salud);
    }


    @Override
    public void comer(int alimento) {
        System.out.println("Estoy comiendo " + alimento);
        hambre--;
        energia++;

        if (energia > 10){
            energia = 10;
        }

        if (hambre < 0){
            hambre = 0;
        }
    }

    @Override
    public int jugar() {
        energia--;
        felicidad++;

        if (felicidad > 10){
            felicidad = 10;
        }
        return felicidad;

    }

    @Override
    public int dormir(int horasDeSueno) {
        return 0;
    }

    @Override
    public boolean morir() {
        boolean murio = false;

        if (hambre == 10){
            murio = true;
            System.out.println("OH NO! Dejaste morir a "+ nombre + " de hambre ! IRRESPONSABLE!");
        }


        else if (energia == 0){
            murio = true;
            System.out.println("OH NO! Dejaste morir a "+ nombre + " de sueño! IRRESPONSABLE!");
        }


        else if (felicidad == 0){
            murio = true;
            System.out.println("OH NO! Dejaste morir a "+ nombre + " de aburrimiento! IRRESPONSABLE!");
        }

        if (salud == 0){
            murio = true;
            System.out.println("OH NO! Dejaste morir a "+ nombre + "! Descuidaste su salud, IRRESPONSABLE!");
        }

        return murio;
    }

    @Override
    public int sanar() {
        return salud = 10;
    }




    //Que hace una muñeca
    public void caminar(){
        System.out.println("Mirame! Estoy caminando!");
    }

    public void hablar(String frase){
        System.out.println(frase);
    }

    public void llorar(){
        System.out.println("AAAAAA :(");
    }

    public void reir(){
        System.out.println("JAJAJAJA :D");
    }

    public String toString(String toString){
        return super.toString() + "\n\n";
    }

}