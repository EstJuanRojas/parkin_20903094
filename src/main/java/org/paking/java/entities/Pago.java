package org.paking.java.entities;
import java.time.LocalDateTime;

public class Pago {

    //Atributos intrinsecos
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaHoraFin;
    private Double valor;

    //Atributos de relacion
    private Empleado codigo;
    private Vehiculo vehiculo;
    private Cupo cupo;
    private Empleado empleado;


    //Constructor por defecto
    public Pago() {
    }

    //Constructor parametrizado
    public Pago(LocalDateTime fechaInicio, LocalDateTime fechaHoraFin, Double valor, Empleado codigo, Vehiculo vehiculo,
    Cupo cupo) {
        this.fechaInicio = fechaInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.valor = valor;
        this.codigo = codigo;
        this.vehiculo = vehiculo;
        this.cupo = cupo;
}
    // Getters y setters
    
    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(LocalDateTime fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Empleado getCodigo() {
        return codigo;
    }

    public void setCodigo(Empleado codigo) {
        this.codigo = codigo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cupo getCupo() {
        return cupo;
    }

    public void setCupo(Cupo cupo) {
        this.cupo = cupo;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    


}
