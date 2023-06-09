/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo09.calculadora;

/**
 *
 * @author ficdev
 */
public class TestCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.somar(10, 10, 10);
        if (resultado != 30) {
            System.out.println("Oops. Resultado nao esperado");
        } else {
            System.out.println("Ok! Passou do teste.");
        }
    }
}
