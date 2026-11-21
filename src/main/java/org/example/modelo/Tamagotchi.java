package org.example.modelo;

//instantOff

//instantOff para saber si un objeto es de cierto tipo
public abstract class Tamagotchi {
    protected String nombre;
    protected int hambre;
    protected int energia;
    protected int vida;
    protected int felicidad;
    protected int salud;

    // constructores
    public Tamagotchi(String nombre, int hambre, int energia, int felicidad, int salud){
        this.nombre = nombre;
        this. hambre = hambre;
        this.energia = energia;
        this.felicidad = felicidad;
        this.salud = salud;
    }

    public Tamagotchi(){
        // valores conocidos
    }

    // setters y getters

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setHambre(int hambre){
        this.hambre = hambre;
    }

    public int getHambre(){
        return hambre;
    }

    public void setEnergia(int energia){
        this.energia = energia;
    }

    public int getEnergia(){
        return energia;
    }

    public void setVida(int vida){
        this.vida = vida;
    }

    public int getVida(){
        return vida;
    }

    public void setFelicidad(int felicidad){
        this.felicidad = felicidad;
    }

    public int getFelicidad(){
        return felicidad;
    }

    public void setSalud(int salud){
        this.salud = salud;
    }

    public int getSalud(){
        return salud;
    }

    //Se tiene que agregar el toString de Tamagotchi

    public String toString(){
        return nombre + "\nHambre: " + hambre + " puntos\nEnergia: " + energia + " puntos\nFelicidad: " + felicidad +" puntos\nSalud: " + salud + " puntos\n ";
    }
}