/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasUnitarias;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

import testingcode.Calculadora;


/**
 *
 * @author ascae1
 */
public class CalculadoraJUnitTest {
    
    public CalculadoraJUnitTest() {
    }
    
    Calculadora calc;
    
    @Before
    public void setUp() throws Exception {
        calc = new Calculadora("Calculadora de prueba");
    }
    
    
    @Test
    public void pruebaSumaIdeal() {
        int resultado = calc.suma(2,7);
        Assert.assertEquals(5, resultado);
    }
    
    @Test
    public void pruebaSumaMayoresDeCien() {
        int resultado = calc.suma(100,150);
        Assert.assertEquals(100, resultado);
    }
    
    @Test
    public void pruebaSumaValoresNegativos() {
        int resultado = calc.suma(-5,5);
        Assert.assertEquals(-1, resultado);
    }
    
}
