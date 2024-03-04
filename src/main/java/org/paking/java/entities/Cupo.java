package org.paking.java.entities;

public class Cupo {

    private char nombre;

    //Constructor por defecto 
    public Cupo() {
    }

    //Constructor parametrizado
    public Cupo(char nombre) {
        this.nombre = nombre;
    }
    // Getters y setters
    
    public char getNombre() {
        return nombre;
    }

    public void setNombre(char nombre) {
        this.nombre = nombre;
    }

    
}
