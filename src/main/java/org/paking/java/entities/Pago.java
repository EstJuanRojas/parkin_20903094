package org.paking.java.entities;
import java.time.LocalDateTime;

public class Pago {

    //Atributos intrinsecos
    public LocalDateTime fechaInicio;
    public LocalDateTime fechaHoraFin;
    public Double valor;

    //Atributos de relacion
    public Vehiculo vehiculo;
    public Cupo cupo;

    //Constructor por defecto
    public Pago() {
    }
    
    //Constructor parametrizado
    public Pago(LocalDateTime fechaInicio, LocalDateTime fechaHoraFin, Double valor, Vehiculo vehiculo, Cupo cupo) {
        this.fechaInicio = fechaInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.valor = valor;
        this.vehiculo = vehiculo;
        this.cupo = cupo;
    }
    
}
