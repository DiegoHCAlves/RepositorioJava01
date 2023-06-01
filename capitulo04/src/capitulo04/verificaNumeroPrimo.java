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
public class verificaNumeroPrimo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor");
        float numero = teclado.nextFloat();
        //int numero = 8;
        int i = 2;
        boolean ehPrimo = true;
        
        if (numero<2){
            ehPrimo = false;
        } else {
            for(i=2;i<=(numero/2);i++){
                if(numero%i==0){
                    ehPrimo = false;
                    break;
                }
            }
        }
        if (ehPrimo == true){
            System.out.println("Este número é primo");
        } else {
            System.out.println("Este número não é primo");
        }
    }
    
}
