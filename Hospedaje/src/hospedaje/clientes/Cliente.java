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
public class Cliente {
        
    public String RDF;
    
    public String nombreCliente;
    
    public Cliente() {}

    public Cliente(String RDF, String nombreCliente) {
        this.RDF = RDF;
        this.nombreCliente = nombreCliente;
    }
    
    public void setRDF(String RDF) {
        this.RDF = RDF;
    }

    public String getRDF() {
        return RDF;
    }
    
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    @Override
    public String toString() {
        return "RFC: " + this.RDF + "\n" +
               "Nombre Cliente: " + nombreCliente;
    }
    
}
