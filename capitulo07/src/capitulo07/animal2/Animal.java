/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo07.animal2;

/**
 *
 * @author ficdev
 */
public class Animal {

    int altura;
    int pata;

    public void falar() {
        System.out.println("Som");
    }
    
    public Animal(int pata, int altura) {
        this.pata = pata;
        this.altura = altura;
    }

}
