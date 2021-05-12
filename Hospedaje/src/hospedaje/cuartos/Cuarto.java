/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospedaje.cuartos;



/**
 *
 * @author DURAN
 */
public class Cuarto {
    
    int numeroCuarto;
    
    public Cuarto () {}
    
    public Cuarto (int numeroCuarto) {
        this.numeroCuarto = numeroCuarto;
    }

    public int getNumeroCuarto() {
        return numeroCuarto;
    }

    public void setNumeroCuarto(int numeroCuarto) {
        this.numeroCuarto = numeroCuarto;
    }

    @Override
    public String toString() {
        return "Numero Cuarto: " + numeroCuarto + "\n";
    }
    
    
    
}
