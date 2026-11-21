package org.uabc.luisnava.modelo;

import java.util.ArrayList;

public class Coleccion {
    private ArrayList<Tamagotchi> misJuguetes;

    public Coleccion(){
        misJuguetes = new ArrayList<>();
    }

    public void agregar(Tamagotchi t){
        misJuguetes.add(t);
    }


    public void agregarPerro(String nombre, int hambre, int energia, int felicidad, int salud, int agresivo, int hiper, int olfato){
        agregar(new Perro(nombre, hambre, energia, felicidad, salud, agresivo, hiper, olfato));
    }

    public void agregarGato(String nombre, int hambre, int energia, int felicidad, int salud, int afectividad, int curiosidad){
        agregar(new Gato(nombre, hambre, energia, felicidad, salud, afectividad,  curiosidad));
    }

    public void agregarCuyo(String nombre, int hambre, int energia, int felicidad, int salud, int territorial, int miedo){
        agregar(new Cuyo(nombre, hambre, energia, felicidad, salud, territorial, miedo));
    }

    public void agregarMuneca(String nombre, int hambre, int energia, int felicidad, int salud){
        agregar(new Muneca(nombre, hambre, energia, felicidad, salud));
    }


    public int getTamanoArrayList(){
        return misJuguetes.size();
    }




    public String listaJuguetes(){
        StringBuffer cadena = new StringBuffer();
        for (Tamagotchi t:misJuguetes){
            if (t instanceof Perro){
                Perro x=(Perro)t;
                cadena.append(x.toString());
            }

            else if (t instanceof Gato){
                Gato x=(Gato)t;
                cadena.append(x.toString());
            }

            else if (t instanceof Cuyo){
                Cuyo x=(Cuyo)t;
                cadena.append(x.toString());
            }

            else if (t instanceof Muneca){
                Muneca x=(Muneca)t;
                cadena.append(x.toString());
            }

            // cadena.append(t);
        }

        return cadena.toString();
    }

    public ArrayList<Tamagotchi> getArrayList(){
        return misJuguetes;
    }

    public Tamagotchi getTamaotchiPosicion (int posicion){
        return misJuguetes.get(posicion);
    }

}
