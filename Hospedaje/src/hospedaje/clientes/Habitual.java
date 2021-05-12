/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospedaje.clientes;

import hospedaje.administrador.Administrador;

/**
 *
 * @author DURAN
 */
public class Habitual extends Cliente {
    
    private float descuento = Administrador.getInstance().getDescuentoHabitual();
    
    public Habitual () {}
    
    public Habitual(String RDF, String nombreCliente) {
        super(RDF, nombreCliente);
    }
    
    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return  super.toString() + "\n" + 
                "Descuento: " + this.descuento;
    }
    
    
    
}
