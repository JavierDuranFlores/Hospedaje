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
public class Simple extends Cuarto{
 
    private float precio = Administrador.getInstance().getPrecioCuartoSimple();
    
    private String tipoCuarto = "Simple";
    
    public Simple () {}
    
    public Simple(int numeroCuarto) {
        super(numeroCuarto);
    }

    public void setPrecio(float precio) { this.precio = precio; }
    
    public float getPrecio() { return precio; }

    public String getTipo() { return tipoCuarto; }

    public void setTipoCuarto(String tipo) { this.tipoCuarto = tipo; }
    
    @Override
    public String toString() {
        return super.toString() +
               "Tipo: " + tipoCuarto +  "\n" +
               "Precio: " + this.precio;
    }
    
    
    
}
