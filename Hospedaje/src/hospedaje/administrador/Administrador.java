/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospedaje.administrador;

import hospedaje.clientes.Habitual;
import hospedaje.cuartos.Doble;
import hospedaje.cuartos.Matrimonial;
import hospedaje.cuartos.Simple;
import hospedaje.recepcionista.Recepcionista;
import hospedaje.reservar.Reserva;
import java.util.List;

/**
 *
 * @author DURAN
 */
public class Administrador {
    
    private static Administrador instance;
    
    private float precioCuartoSimple = 100.00f;
    private float precioCuartoDoble = 300.00f;
    private float precioCuartoMatrimonial = 200.00f;
    
    private float descuentoHabitual = 20.00f;
    
    private Administrador() {}
    
    public static Administrador getInstance() {
        
        if (instance == null) {
            instance = new Administrador();
        }
        return instance;
    }
    
    
    public float getPrecioCuartoSimple() {
        return precioCuartoSimple;
    }

    public void setPrecioCuartoSimple(float precioCuartoSimple) {
        this.precioCuartoSimple = precioCuartoSimple;
    }
    
    
     public float getPrecioCuartoDoble() {
        return precioCuartoDoble;
    }
    
    public void setPrecioCuartoDoble(float precioCuartoDoble) {
        this.precioCuartoDoble = precioCuartoDoble;
    }

    public float getPrecioCuartoMatrimonial() {
        return precioCuartoMatrimonial;
    }
    
    public void setPrecioCuartoMatrimonial(float precioCuartoMatrimonial) {
        this.precioCuartoMatrimonial = precioCuartoMatrimonial;
    }

    public float getDescuentoHabitual() {
        return descuentoHabitual;
    }
    
    public void setDescuentoHabitual(float descuentoHabitual) {
        this.descuentoHabitual = descuentoHabitual;
    }
    
    /* 7.  Cambiar el precio de una cuarto de acuerdo a su tipo  */
    
    public void cambiarPrecioTipoCuarto(float nuevoPrecio, String tipoCuarto) {
        
        if (tipoCuarto.equals("Simple")) setPrecioCuartoSimple(nuevoPrecio);
        if (tipoCuarto.equals("Doble")) new Doble().setPrecio(nuevoPrecio);
        if (tipoCuarto.equals("Matrimonial")) new Matrimonial().setPrecio(nuevoPrecio);
        
    }
    
    /*  8.  Cambiar el valor del descuento ofrecido a los clientes habituales */
    public void cambiarDescuentoHabitual(float nuevoDescuento) {
        
        setDescuentoHabitual(nuevoDescuento);
        
    }
    
    /* 9.  Calcular las ganancias que tendrán en un mes especificado (considere que todos los meses tienen treinta días). */
    public float calcularGananciasMes(String mes, List<Reserva> reservas) {
        float ganancias = 0;
        float descuento = 0;
        for (Reserva reserva : reservas) {
            if (mes.equals(reserva.getMes())) {

                if ("Habitual".equalsIgnoreCase(reserva.getCliente().getClass().getSimpleName())) descuento = new Habitual().getDescuento();
                
                if("Simple".equals(reserva.getCuarto().getClass().getSimpleName())) ganancias += new Simple().getPrecio()-descuento;
                if("Doble".equals(reserva.getCuarto().getClass().getSimpleName())) ganancias += new Doble().getPrecio()-descuento;
                if("Matrimonial".equals(reserva.getCuarto().getClass().getSimpleName())) ganancias += new Matrimonial().getPrecio()-descuento;
            }
           
        }
        return ganancias;
    }
    
}
