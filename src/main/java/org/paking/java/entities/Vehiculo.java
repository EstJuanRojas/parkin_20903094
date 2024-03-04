package org.paking.java.entities;

public class Vehiculo {

    //Los atributos de una clase
    //para cumplir con encapsulamiento
    //deben ser private

    private String placa;
    private TipoVehiculo tipoVehiculo;

    //constructor
    //sin parametros: constructor por defecto
    public Vehiculo() {
    }

    //constructor parametrizado
    public Vehiculo(String placa, TipoVehiculo tipoVehiculo) {
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
    }

    // Getters y setters

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }



    
    
}
