package org.example.modelo;

public class Cuyo extends Tamagotchi implements TamagotchiActions{
    private int nivelTerritorial;
    private int nivelMiedo;

    public Cuyo(String nombre, int hambre, int energia, int felicidad, int salud, int territorial, int miedo){
        super(nombre, hambre, energia, felicidad, salud);

        this.nivelTerritorial = territorial;
        this.nivelMiedo = miedo;
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
        System.out.println(nombre + " Duerme dentro de su jaula ZZZ ZZZ ZZZ");
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
        return "Tipo de Mascota: CUYO\n"+ super.toString() + "Territorial: "+nivelTerritorial+"puntos\nMiedo" +nivelMiedo+ "puntos\n";
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
    }
}