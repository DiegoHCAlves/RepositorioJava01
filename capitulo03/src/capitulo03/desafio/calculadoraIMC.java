/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo03.desafio;

/**
 *
 * @author ficdev
 */
public class calculadoraIMC {
    //Propriedades do retangulo
    private double altura;
    private double peso;
    
    public calculadoraIMC(double altura, double peso){
        this.altura = altura;
        this.peso = peso;    
    }
    
    public double calculoIMC() {
        return this.peso/(this.altura*this.altura);
    }
}
