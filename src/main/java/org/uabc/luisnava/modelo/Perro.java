package org.uabc.luisnava.modelo;

public class Perro extends Tamagotchi implements TamagotchiActions {
    private int nivelImperactividad;
    private int nivelAgresividad;
    private int nivelOlfato;


    public Perro(String nombre, int hambre, int energia, int felicidad, int salud, int agresivo, int hiper, int olfato){
        super(nombre, hambre, energia, felicidad, salud);
        nivelAgresividad = agresivo;
        nivelImperactividad = hiper;
        nivelOlfato = olfato;

    }

    public Perro(){
        super("Sansa", 0, 5, 5, 10);
        nivelAgresividad = 10;
        nivelImperactividad = 5;
        nivelOlfato = 10;
    }


    @Override
    public void comer(int alimento) {
        System.out.println("Estoy comiendo un sobre de Pedigree! :D");
        alimento--;
        energia++;
    }

    @Override
    public int jugar() {
        energia--;
        felicidad++;
        return felicidad;
    }
    //Cambiar a switch-case
    @Override
    public int dormir(int horasDeSueno) {
        switch(horasDeSueno){
            case 1:
                energia++;
                break;
            case 2:
                energia += 2;
                break;
            case 3:
                energia += 3;
                break;
            case 4:
                energia += 4;
                break;
            case 5:
                energia += 5;
                break;
            case 6:
                energia += 6;
                break;
            case 7:
                energia += 7;
                break;
            case 8:
                energia += 8;
                break;
            case 9:
                energia += 9;
                break;
        }
        System.out.println(nombre + " Duerme en su casa de madera ZZZ ZZZ ZZZ");
        return energia;
    }

    @Override
    public boolean morir() {
        boolean murio = false;

        if (hambre == 0 || energia == 0 || felicidad == 0 || salud == 0){
            murio = true;
            System.out.println("OH NO! Dejaste morir a "+ nombre + " ! IRRESPONSABLE!");
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


    public int getNivelImperactividad() {
        return nivelImperactividad;
    }

    public void setNivelImperactividad(int nivelImperactividad) {
        this.nivelImperactividad = nivelImperactividad;
    }

    public int getNivelAgresividad() {
        return nivelAgresividad;
    }

    public void setNivelAgresividad(int nivelAgresividad) {
        this.nivelAgresividad = nivelAgresividad;
    }

    public void ladrar(){
        System.out.println("Guau Guau!");
    }

    public void aullar(){
        System.out.println("AAUU!!");
    }

    public void grunir (){
        System.out.println("GRRRRR GRRRR >:(");
    }

    public int getNivelOlfato() {
        return nivelOlfato;
    }

    public void setNivelOlfato(int nivelOlfato) {
        this.nivelOlfato = nivelOlfato;
    }

    public void perseguirCola(){
        System.out.println(nombre + " Esta persiguiendo su Cola :D");
        energia--;
        felicidad++;
    }

    public String toString(){
        return "Tipo de Mascota: PERRO\n"+ super.toString() + "Agresividad: "+nivelAgresividad+"puntos\nHiperactividad: "+nivelImperactividad+"\n";
    }




}