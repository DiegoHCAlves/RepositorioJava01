/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo03;

/**
 *
 * @author ficdev
 */
public class TestePessoa {
    public static void main(String[] args) {
        //instanciação de classe pessoa 
        Pessoa p1 = new Pessoa();
        
        p1.setNome("João");
        p1.setIdade(25);
        
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Nome: " + p1.getIdade());
    }
    
}
