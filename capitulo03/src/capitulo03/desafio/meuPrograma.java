/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo03.desafio;
/**
 *
 * @author ficdev
 */
public class meuPrograma {
    public static void main(String[] args) {
        calculadoraIMC imc = new calculadoraIMC(1.78,92);
    
    
    double resultado = imc.calculoIMC();
    
    System.out.printf("O seu IMC é: %.2f \n", resultado);
    
   }
    
    
}
