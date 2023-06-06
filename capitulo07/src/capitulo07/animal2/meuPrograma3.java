/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo07.animal2;

/**
 *
 * @author ficdev
 */
public class meuPrograma3 {

    public static void main(String[] args) {
        Animal meusAnimais[] = new Animal[10];
        meusAnimais[0] = new Animal(4, 30);
        meusAnimais[1] = new Cachorro(4, 15);
        meusAnimais[2] = new Gato(4, 10);
        meusAnimais[0].falar();
        meusAnimais[1].falar();
        meusAnimais[2].falar();
    }
}
