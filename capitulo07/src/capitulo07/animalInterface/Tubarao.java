/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo07.animalInterface;

/**
 *
 * @author ficdev
 */
public class Tubarao implements Animal,Peixe {
    public void respirar() {
        System.out.println("Usando guelras!");
    }
    
    public void nadar(){
        System.out.println("Mergulhando!");
    }
}
