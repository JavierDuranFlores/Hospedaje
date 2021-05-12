/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospedaje.reservar;

import hospedaje.clientes.Cliente;
import hospedaje.cuartos.Cuarto;

/**
 *
 * @author DURAN
 */
public class Reserva {
    
    
    private Cuarto cuarto;
    private Cliente cliente;
    private String mes;
    
    public Reserva(Cuarto cuarto, Cliente cliente, String mes) {
        
        this.cuarto = cuarto;
        this.cliente = cliente;
        this.mes = mes;
        
    }

    public Cuarto getCuarto() {
        return cuarto;
    }

    public void setCuarto(Cuarto cuarto) {
        this.cuarto = cuarto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
    
    
    
}
