package org.paking.java;

import org.paking.java.entities.TipoVehiculo;
import org.paking.java.entities.Vehiculo;
import org.paking.java.entities.Cliente;
import org.paking.java.entities.Cupo;
import org.paking.java.entities.Empleado;
import org.paking.java.entities.Pago;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        //sistema de gestion de entradas y salidas
        //de vehiculos en parking
        //1. dos carritos
        //objetos(instancias)
        //1. Tipo de clase
        //2. Nombre del objeto
        //3. asignacion y palabra reservada new
        //4. constructor del objeto
        Vehiculo carrito1 = new Vehiculo("ASD 398", TipoVehiculo.PARTICULAR);

        Vehiculo carrito2 = new Vehiculo("FMD 388", TipoVehiculo.TAXI );

        //Crear (instanciar) un cliente 
        Cliente cliente1 = new Cliente("Santiago", "Borda", 1021667827L);
        
        //invocar el metodo addCar
        cliente1.addVehicle(carrito1);
        cliente1.addVehicle(carrito2);
        cliente1.addVehicle("WWW ERT", TipoVehiculo.MOTO);
        
        //instanciar cupos 
        Cupo cupito1 = new Cupo('A');
        Cupo cupito2 = new Cupo('B');

        //instanciar empleado
        Empleado empleado1 = new Empleado("Samuel", "Ardila Salvador", "1019605503");

        //Hacer registros(pagos) E/S de vehiculos
        Pago pago1 = new Pago(LocalDateTime.of(2024, Month.FEBRUARY, 1, 15, 30, 9), 
        LocalDateTime.of(2024, Month.FEBRUARY, 10, 6, 59, 5), 5000.0, empleado1, cliente1.misVehiculos.get(0), cupito1);

        Pago pago2 = new Pago( LocalDateTime.of(2024, Month.MAY, 20, 13, 30, 8),
        LocalDateTime.of(2024, Month.MAY, 20, 16, 45, 9), 6000.0, empleado1, cliente1.misVehiculos.get(1), cupito2);
        
        //Añadir pagos a una lista
        List<Pago> misPagos = new ArrayList<Pago>();
        misPagos.add(pago1);
        misPagos.add(pago2);

        //recorrer los pagos para mostrar la informacion
        for( Pago p : misPagos){
            //evidencia:
            //mostrar
            //  -Placa del vehículo
            //  -Valor pagado
            //  -fecha y hora de inicio
            //  -fecha y hora de fin
            //  -cupo(nombre)
            //  -empleado (nombre)
            System.out.println( "Pago:|Placa:" + p.vehiculo.placa  + "|");
            System.out.println("|Valor:" + p.valor + "|");
            System.out.println("|Fecha y hora de entrada:" + p.fechaInicio.toString() + "|");
            System.out.println("|Fecha y hora de salida:" + p.fechaHoraFin.toString() + "|");
            System.out.println("|Cupo:" + p.cupo.nombre + "|");
            System.out.println("|Empleado:" + p.codigo.codigo + "|");
        }
    }
}