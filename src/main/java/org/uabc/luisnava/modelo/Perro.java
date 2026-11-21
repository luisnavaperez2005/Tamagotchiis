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
        switch (alimento){
            case 1:
                System.out.println("Estoy comiendo un sobre de Pedigree! :D");
                energia += 3;
                hambre -= 2;
                break;
            case 2:
                System.out.println("Estoy masticando un hueso! :D");
                energia += 1;
                hambre -= 2;
                break;
            case 3:
                System.out.println("Estoy comiendo croquetas! :D");
                energia += 2;
                hambre -= 3;
                break;
            default:
                System.out.println("Alimento invalido! No me diste nada :,(");
        }

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

        System.out.println("El perro salio a correr! Se canso un poco!");
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

        if (hambre == 10){
            murio = true;
        }


        else if (energia == 0){
            murio = true;
        }


        else if (felicidad == 0){
            murio = true;
        }


        if (salud == 0){
            murio = true;
        }

        return murio;
    }

    @Override
    public int sanar() {
        System.out.println("Le has dado CAPROFENO a tu perro! Se ha curado!");
        salud = 10;
        return salud;
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

    }

    public String toString(){
        return "\nTipo de Mascota: PERRO\n"+ super.toString() + "Agresividad: "+nivelAgresividad+" puntos\nHiperactividad: "+nivelImperactividad+"puntos\n\n";
    }




}