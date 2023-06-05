/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capitulo06;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ficdev
 */
public class FilaCarros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Queue<Carro> minhaFila = new LinkedList<Carro>();
        minhaFila.add(new Carro("Ford", "Mustang", 2020));
        minhaFila.add(new Carro("Chevrolet", "Camaro", 2021));
        minhaFila.add(new Carro("Dodge", "Charged", 2019));
        //Carro carroRemovido = minhaFila.remove(); //remolve o primeiro elemento da fila
        
    }

}
