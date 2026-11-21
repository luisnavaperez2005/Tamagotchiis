package org.example.modelo;

public class Muneca extends Tamagotchi implements TamagotchiActions{
    private int nivelAburrimiento;
    private int nivelObediencia;

    public Muneca(String nombre, int hambre, int energia, int felicidad, int salud, int nivelAburrimiento, int nivelObediencia){
        super(nombre, hambre, energia, felicidad, salud);
        this.nivelAburrimiento = nivelAburrimiento;
        this.nivelObediencia = nivelObediencia;
    }

    public Muneca(){
        super("Cynthia", 2, 7, 8, 10);
        nivelAburrimiento = 1;
        nivelObediencia = 9;
    }

    @Override
    public void comer(int alimento) {
        switch (alimento){
            case 1:
                System.out.println("Estoy comiendo galletas! :D");
                energia += 3;
                hambre -= 2;
                break;
            case 2:
                System.out.println("Estoy comiendo pastel! :D");
                energia += 2;
                hambre -= 3;
                break;
            case 3:
                System.out.println("Estoy tomando té! :D");
                energia += 1;
                hambre -= 1;
                break;
            default:
                System.out.println("Alimento invalido! No me diste nada :,(");
        }
    }

    @Override
    public int jugar() {
        return 0;
    }

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
        System.out.println(nombre + " Duerme en su cama ZZZ ZZZ ZZZ");
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

    public void setNivelAburrimiento(int nivelAburrimiento) {
        this.nivelAburrimiento = nivelAburrimiento;
    }

    public int getNivelAburrimiento() {
        return nivelAburrimiento;
    }

    public void setNivelObediencia(int nivelObediencia) {
        this.nivelObediencia = nivelObediencia;
    }

    public int getNivelObediencia() {
        return nivelObediencia;
    }

    public String toString(String toString){
        return super.toString() + "";
    }
}