/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo07.animal2;

/**
 *
 * @author ficdev
 */
public class Cachorro extends Animal {

    String corPelo;

    public void falar() {
        latir();
    }

    private void latir() {
        System.out.println("auau!");
    }
    
    public Cachorro(int p, int a) {
        super(p,a);
    }

}
