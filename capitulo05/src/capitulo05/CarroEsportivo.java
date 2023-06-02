/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo05;

/**
 *
 * @author ficdev
 */
public class CarroEsportivo extends Carro {
    public void acelerar() {
        this.ano = 2023;
        this.modelo = "Esportivo";
        //this.fabricate = "Ferraria"; // erro de compilação, fabricante é privado
    }
}
