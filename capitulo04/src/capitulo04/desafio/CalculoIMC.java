/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo04.desafio;

/**
 *
 * @author ficdev
 */
public class CalculoIMC {
    private double altura;
    private double peso;
    
    public CalculoIMC(double altura, double peso){
        this.altura = altura;
        this.peso = peso;
    }
    
    public double calculoIMC() {
        return this.peso/(this.altura*this.altura);
    }
}
