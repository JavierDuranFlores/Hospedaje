/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospedaje.recepcionista;

import hospedaje.clientes.*;
import hospedaje.cuartos.*;
import hospedaje.reservar.Reserva;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DURAN
 */
public class Recepcionista {
    
    public List<Reserva> reservas = new ArrayList<>();
    
    /* 1.  Obtener un listado de los cuartos disponible de acuerdo a su tipo */
    
    public void datosReservaFiltrar(String tipoCuarto) {
        
        for (Reserva reserva : reservas) {
            if (tipoCuarto.equalsIgnoreCase(reserva.getCuarto().getClass().getSimpleName())) {
                System.out.println(reserva.getCuarto().toString());
                System.out.println(reserva.getCliente().toString());
                System.out.println("Mes: " + reserva.getMes());
            }
            System.out.println("\n\n");
        }
        
    }
    
    /* 2.  Preguntar por el precio de un cuarto de acuerdo a su tipo */
    
    public float precioTipoCuarto(String tipoCuarto) {
        
        float precioCuarto = 0;
        
        if (tipoCuarto.equals("Simple")) precioCuarto = new Simple().getPrecio();
        if (tipoCuarto.equals("Doble")) precioCuarto = new Doble().getPrecio();
        if (tipoCuarto.equals("Matrimonial")) precioCuarto = new Matrimonial().getPrecio();
        
        return precioCuarto;
    }
    
    /* 3.  Preguntar por el descuento ofrecido a los clientes habituales  */
    
    public float descuentoHabituales() {
        return new Habitual().getDescuento();
    }
    
    /* 4.  Preguntar por el precio total para un cliente dado, especificando su RFC, tipo de cuarto y número de noches. */
    
    public void precioTotal(String RFC, String tipoCuarto, int numeroNoches) {
        
        int encontrado = 0;
        float descuento = 0;
        
        for (Reserva reserva : reservas) {
            
            if (RFC.equals(reserva.getCliente().getRDF())) {
                if (tipoCuarto.equalsIgnoreCase(reserva.getCuarto().getClass().getSimpleName())) {
                    
                    if ("Habitual".equalsIgnoreCase(reserva.getCliente().getClass().getSimpleName())) descuento = new Habitual().getDescuento();
                    
                    if (tipoCuarto.equals("Simple")) System.out.println("Total: " + (new Simple().getPrecio()*numeroNoches-descuento));
                    if (tipoCuarto.equals("Doble")) System.out.println("Total: " + (new Doble().getPrecio()*numeroNoches-descuento));
                    if (tipoCuarto.equals("Matrimonial")) System.out.println("Total: " + (new Matrimonial().getPrecio()*numeroNoches-descuento));
                    
                    encontrado = 1;
                }
            } 
        }
        if (encontrado == 0) System.out.println("Cliente con RFC " + RFC + " Y con Cuarto " + tipoCuarto + " No encontrado");
    }
    
    /* 5.  Reservar una cuarto especificando el número del cuarto, RFC y nombre del cliente.  */
    
    public void reserva (Reserva reserva) {
        
        reservas.add(reserva);
        
    }
    
    /* 6.  Eliminar una reserva especificando el número del cuarto */
    
    public void eliminarReserva(int numeroCuarto) {
        
        int numeroLista = -1;
        
        for (Reserva reserva : reservas) 
            if (numeroCuarto == reserva.getCuarto().getNumeroCuarto()) 
                numeroLista = reservas.indexOf(reserva);
            
        if (numeroLista != -1) reservas.remove(numeroLista);
    }
    
    
    /* Todas las reservas */
    public void datosReserva() {
        
        for (Reserva reserva : reservas) {
            System.out.println(reserva.getCuarto().toString());
            System.out.println(reserva.getCliente().toString());
            System.out.println("\n\n");
        }
        
    }
    
}
