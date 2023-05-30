/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo02;

import java.util.Scanner;

/**
 *
 * @author ficdev
 */
public class Desafio02 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
             
        System.out.print("Digite seu peso: ");
        float peso = input.nextFloat();
        
        System.out.print("Digite sua altura em metros: ");
        float altura = input.nextFloat();

       //float res = peso/(altura*altura);
        
        System.out.printf("%s, seu IMC é igual a %.2f \n", nome,peso/(altura*altura));
    }
}

// imc = peso/(altura x altura)