/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospedaje.clientes;

/**
 *
 * @author DURAN
 */
public class Esporadico extends Cliente {
    
    private float descuento = 0.00f;
    
    public Esporadico () {}
    
    public Esporadico(String RDF, String nombreCliente) {
        super(RDF, nombreCliente);
    }
    
    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }
    
     public float getDescuento() {
        return descuento;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + 
               "Descuento: " + this.descuento;
    }
    
}
