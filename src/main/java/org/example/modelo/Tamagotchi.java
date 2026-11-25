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
    protected boolean durmiendo;

    // constructores
    public Tamagotchi(String nombre, int hambre, int energia, int felicidad, int salud){
        this.nombre = nombre;
        this. hambre = hambre;
        this.energia = energia;
        this.felicidad = felicidad;
        this.salud = salud;
        this.durmiendo = false;
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

    public void disminuirEnergia(){
        if (energia > 0){
            energia--;
        }
    }

    public void aumentarHambre(){
        if (hambre < 10){
            hambre++;
        }
    }

    public void disminuirFelicidad(){
        if (felicidad > 0){
            felicidad--;
        }
    }

    public void disminuirSalud(){
        if (salud > 0){
            salud--;
        }
    }

    // agregados

    public boolean isDurmiendo() {
        return durmiendo;
    }

    public void setDurmiendo(boolean durmiendo) {
        this.durmiendo = durmiendo;
    }

    public String estadoDeAnimo(){
        if (hambre >= 8 || energia <= 3 || felicidad <= 3 || salud <= 3) {
            return nombre + " se siente mal. Necesita atención urgente :,(";
        } else if (hambre >= 4 || energia <= 6 || felicidad <= 6 || salud <= 7) {
            return nombre + " necesita un poco de atención :(";
        } else {
            return nombre + " se siente muy bien y muy feliz! :D";
        }
    }

    //Se tiene que agregar el toString de Tamagotchi

    public String toString(){
        String estadoSueno;
        if (durmiendo) {
            estadoSueno = "Durmiendo Zzz";
        } else {
            estadoSueno = "Despierto";
        }
        return nombre + "\nEstado: " + estadoSueno +
                "\nÁnimo: " + estadoDeAnimo() + "\nHambre: " + hambre + " puntos\nEnergia: " + energia + " puntos\nFelicidad: " + felicidad +" puntos\nSalud: " + salud + " puntos\n ";
    }
}