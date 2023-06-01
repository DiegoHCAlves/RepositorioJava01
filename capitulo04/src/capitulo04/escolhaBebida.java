/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo04;

import java.util.Scanner;

/**
 *
 * @author ficdev
 */
public class escolhaBebida {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escolha uma das bebidas abaixo: ");
        System.out.println("1 - Refrigerante");
        System.out.println("2 - Suco");
        System.out.println("3 - Cerveja");
        System.out.println("4 - Água");
        
        int bebida = teclado.nextInt();
        
        switch(bebida){
            case 1:
                System.out.println("O valor é R$ 3,00");
                break;
            case 2:
                System.out.println("O valor é R$ 5,00");
                break;           
            case 3:
                System.out.println("O valor é R$ 7,00");
                break;               
            case 4:
                System.out.println("O valor é R$ 2,00");
                break; 
            default:
                System.out.println("Valor inválido");
        }
    }

    
    
}
