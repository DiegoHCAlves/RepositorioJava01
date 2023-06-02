/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo04.desafio;

import java.util.Scanner;

/**
 *
 * @author ficdev
 */
public class MeuPrograma {
    public static void main(String[] args){
       CalculoIMC imc = new CalculoIMC(1.78,91.8);
       
       /*Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu peso");
        double peso = teclado.nextDouble();
        System.out.println("Informe sua altura");
        double altura = teclado.nextDouble();*/
       // Verificando como fazer
       
       double resultado = imc.calculoIMC();
        System.out.printf("O seu IMC equivale a %.2f \n",resultado);
        
        if(resultado < 18.5){
            System.out.println("Abaixo do peso normal");
        } else if (resultado >=18.5 && resultado < 25){
            System.out.println("Peso normal");
        } else if (resultado >=25 && resultado < 30){
            System.out.println("Excesso de peso");
        } else if (resultado >=30 && resultado < 35){
            System.out.println("Obesidade I");
        } else if (resultado >=35){
            System.out.println("Obesidade II");
        }   
    }
}
