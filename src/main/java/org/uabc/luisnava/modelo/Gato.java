package org.uabc.luisnava.modelo;

public class Gato extends Tamagotchi implements TamagotchiActions{
    private int nivelAfectividad;
    private int nivelCuriosidad;

    public Gato(String nombre, int hambre, int energia, int felicidad, int salud, int afectividad, int curiosidad){
        super(nombre, hambre, energia, felicidad, salud);
        this.nivelAfectividad = afectividad;
        this.nivelCuriosidad = curiosidad;
    }


    public Gato(){
        super("Petunia", 8, 5, 4, 7);
    }

    @Override
    public void comer(int alimento) {
        System.out.println("Estoy comiendo un sobre de Whiskas! :D");
        alimento--;
        energia++;
    }

    @Override
    public int jugar() {
        System.out.println("El gato se esta divirtiendo siguiendo una luz de laser!");
        energia--;
        felicidad++;
        return felicidad;
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

        System.out.println(nombre + " Duerme en su habitad para gatos ZZZ ZZZ ZZZ ZZZ");

        return energia;
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
        System.out.println("Le has dado BUPRENORFINA! Se ha curado!");
        salud = 10;
        return salud;
    }


    //Que hace solo el gato
    public void maullar(){
        System.out.println("Miauu");
    }

    public void limpiarse(){
        System.out.println("El gato se esta limpiando!");
    }

    public void ronronear(){
        System.out.println("GRRRR");
    }

    public void aranar(){
        System.out.println("Cuidado, el gato te ha rasguñado!");
    }

    public String toString(){
            return "Tipo de Mascota: GATO\n"+ super.toString() + "Afectividad: "+nivelAfectividad+"puntos\nCuriosidad: "+nivelCuriosidad+"puntos\n\n";
    }


    public int getNivelAfectividad() {
        return nivelAfectividad;
    }

    public void setNivelAfectividad(int nivelAfectividad) {
        this.nivelAfectividad = nivelAfectividad;
    }

    public int getNivelCuriosidad() {
        return nivelCuriosidad;
    }

    public void setNivelCuriosidad(int nivelCuriosidad) {
        this.nivelCuriosidad = nivelCuriosidad;
    }
}