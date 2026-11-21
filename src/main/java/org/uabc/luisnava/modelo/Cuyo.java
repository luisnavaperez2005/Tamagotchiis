package org.uabc.luisnava.modelo;

public class Cuyo extends Tamagotchi implements TamagotchiActions{
    private int nivelTerritorial;
    private int nivelMiedo;

    public Cuyo(String nombre, int hambre, int energia, int felicidad, int salud, int territorial, int miedo){
        super(nombre, hambre, energia, felicidad, salud);

        this.nivelTerritorial = territorial;
        this.nivelMiedo = miedo;
    }

    public Cuyo(){
        super("Sr. Cobaya", 4, 9, 7, 9);
        nivelMiedo = 6;
        nivelTerritorial = 2;
    }


    @Override
    public void comer(int alimento) {
        switch (alimento){
            case 1:
                System.out.println("Estoy comiendo hojas de lechuga! :D");
                energia += 3;
                hambre -= 2;
                break;
            case 2:
                System.out.println("Estoy comiendo heno! :D");
                energia += 1;
                hambre -= 2;
                break;
            case 3:
                System.out.println("Estoy comiendo pienso! :D");
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
        System.out.println(nombre + " Duerme dentro de su jaula ZZZ ZZZ ZZZ");
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
        return salud = 10;
    }

    //Que hacen los cuyos
    public void silbido(){
        System.out.println("Cui cui");
    }


    //Esta enojado
    public void castaneoDientes(){
        System.out.println("Chac-chac");
    }

    public void zumbidoTerritorial(){
        System.out.println("BURU-BURU!!");
    }

    public void chillidoAlterado(){
        System.out.println("CUUUIII CUUUIIII!!!!");
    }


    public String toString(){
        return "Tipo de Mascota: CUYO\n"+ super.toString() + "Territorial: "+nivelTerritorial+"puntos\nMiedo" +nivelMiedo+ "puntos\n\n";
    }

    public int getNivelTerritorial() {
        return nivelTerritorial;
    }

    public void setNivelTerritorial(int nivelTerritorial) {
        this.nivelTerritorial = nivelTerritorial;
    }

    public int getNivelMiedo() {
        return nivelMiedo;
    }

    public void setNivelMiedo(int nivelMiedo) {
        this.nivelMiedo = nivelMiedo;
    }

    public void girarEnRueda(){
        System.out.println("El Cuyo esta girando en la rueda!");
        felicidad++;
        energia--;

        if (felicidad > 10){
            felicidad = 10;
        }

        if (energia < 0) {
            energia = 0;
        }

    }


}