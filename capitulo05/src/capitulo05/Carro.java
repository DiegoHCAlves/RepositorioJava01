/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo05;

/**
 *
 * @author ficdev
 */
public class Carro {
    public String modelo;
    protected int ano;
    private String fabricante;
    
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
    
    public String getFabricante() {
        return this.fabricante;
    }
}
