/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import hospedaje.administrador.Administrador;
import hospedaje.clientes.*;
import hospedaje.cuartos.*;
import hospedaje.recepcionista.Recepcionista;
import hospedaje.reservar.Reserva;

/**
 *
 * @author DURAN
 */
public class Main {
    
    public static void main(String[] args) {
        
        Administrador administrador = Administrador.getInstance();
        
        Recepcionista recepcionista = new Recepcionista();
        
        administrador.cambiarPrecioTipoCuarto(500, "Simple");
        
        recepcionista.reserva(new Reserva(new Simple(5), new Habitual("940209PH5SA", "Javier"), "Enero"));
        
        administrador.cambiarDescuentoHabitual(30);
        
        recepcionista.reserva(new Reserva(new Doble(2), new Habitual("AAA730717LZ3", "Duran"), "Enero"));
        recepcionista.reserva(new Reserva(new Matrimonial(1), new Habitual("AAC9712173I2", "Flores"), "Enero"));
        
        recepcionista.datosReserva();
        
        recepcionista.precioTotal("940209PH5SA", "Simple", 5);
        
        System.out.println("\n\n");
        
        recepcionista.eliminarReserva(1);
        
        recepcionista.datosReserva();
        
        recepcionista.eliminarReserva(2);
        
        recepcionista.datosReserva();

        System.out.println(recepcionista.precioTipoCuarto("Doble"));
        
        System.out.println(administrador.calcularGananciasMes("Enero", recepcionista.reservas));
        
    }
    
}
