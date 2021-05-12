/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospedaje.cuartos;

import hospedaje.administrador.Administrador;

/**
 *
 * @author DURAN
 */
public class Doble extends Cuarto{
    
    private float precio = Administrador.getInstance().getPrecioCuartoDoble();
     
    private String tipo = "Doble";
    
    public Doble () {}
    
    public Doble(int numeroCuarto) {
        super(numeroCuarto);
    }
    
    public void setPrecio(float precio) { this.precio = precio; }
    
    public float getPrecio() { return precio; }
    
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getTipo() { return tipo; }
    
    @Override
    public String toString() {
        return super.toString() +
               "Tipo: " + tipo +  "\n" +
               "Precio: " + this.precio;
    }
    
}
