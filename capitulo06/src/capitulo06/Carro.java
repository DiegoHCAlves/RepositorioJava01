/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo06;

/**
 *
 * @author ficdev
 */
public class Carro {

    private String nome;
    private String marca;
    private int ano;
    
    public Carro(String nome, String marca, int ano){
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
    } 
    
    public String getNome(){
        return nome;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }

}
