/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingcode;

/**
 *
 * @author ascae1
 */
public class Calculadora {
    
    private String nombreCalculadora;

    public Calculadora(String nombreCalculadora) {
        this.nombreCalculadora = nombreCalculadora;
    }
    
    public int suma(int numero1, int numero2) {
        int resultado;
        if(numero1 < 0 || numero2< 0){
            resultado = -1;
        } else {
            resultado = numero1 + numero2;
        }
        
        if(resultado > 100){
            resultado = 100;
        }
        
        return resultado;
    }
    
}


