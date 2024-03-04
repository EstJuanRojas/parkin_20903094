package org.paking.java.entities;

public class Empleado {

    private String nombre;
    private String apellidos;
    private String codigo;


    //constructores
    public Empleado() {
    }

    //Contructor parametrizado

    public Empleado(String nombre, String apellidos, String codigo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.codigo = codigo;
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
}
