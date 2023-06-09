
import capitulo09.calculadora.Calculadora;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ficdev
 */
public class CalculadoraTest extends TestCase {
    public CalculadoraTest (String testName) {
        super (testName);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite(CalculadoraTest.class);
        return suite;
    }
    
    private Calculadora calculadora = new Calculadora();
    
    public void testSomar() {
       assertEquals(30,calculadora.somar(10,10,10),0); 
    }
    
    public void testSubtrair() {
        assertEquals(20,calculadora.subtrair(30, 10), 0);
    }

}
