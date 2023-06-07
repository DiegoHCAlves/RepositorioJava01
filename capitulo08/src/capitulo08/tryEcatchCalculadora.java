/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo08;

import java.util.Scanner;

/**
 *
 * @author ficdev
 */
public class tryEcatchCalculadora {
    public static void main(String[] args) {
        try {
            System.out.println("Digite 1 valor");
            Scanner teclado = new Scanner(System.in);
            int numeroUm = teclado.nextInt();
            System.out.println("Digite o 2 valor");
            int numeroDois = teclado.nextInt();
            
            System.out.println("Escolha a operacao que deseja fazer: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtracao");
            System.out.println("3 - Divisao");
            System.out.println("4 - Multiplicacao");
            int opcao = teclado.nextInt();
            int resultado = 0;
            
            switch(opcao){
                case 1 -> resultado = numeroUm+ numeroDois;
                case 2 -> resultado = numeroUm - numeroDois;
                case 3 -> resultado = numeroUm / numeroDois;
                case 4 -> resultado = numeroUm * numeroDois;
                default -> System.out.println("Opcao invvalida");                    
            }
            
            System.out.println("O resultado e " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Nao e possível dividir por zero.");
        }
    }
}
