/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capitulo05;

/**
 *
 * @author ficdev
 */
public class Capitulo05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 10;
        int b = 20;
        
        System.out.println("Antes de chamar o método:");
        System.out.println("a = " + a + ", b = " + b);
        
        // Chamada do método soma
        soma(a,b);
        
        System.out.println("Depois de chamar o método:");
        System.out.println("a = " + a + ", b = " + b);
    }
        public static void soma(int x, int y){
            
            int resultado = x + y;
            System.out.println("Resultado da soma: " + resultado);
            
            //altera o valor do parâmetro x
            x = 0;
            System.out.println("Valor de x dentro do método: " + x);
    }
    


}
