/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ficdev
 */
public class Usuario {
    private int id;
    private String nome;
    private String email;
    private int telefone;
    private int qtdLivrosEmprestados;
    private List<Livro> livrosEmprestados = new ArrayList<>();
    
    public Usuario(String nome, String email, int telefone){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.qtdLivrosEmprestados = 0;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public int getTelefone(){
        return this.telefone;
    }
    
    public int getQtdLivrosEmprestados(){
        return qtdLivrosEmprestados;
    }
    
    public boolean getPossuiVaga(){
        return qtdLivrosEmprestados < 3;
    }
    
    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }
    
    public void adicionarLivro(Livro livro) {
        livrosEmprestados.add(livro);
        qtdLivrosEmprestados++;
    }
    
    public void removerLivro(Livro livro) {
        livrosEmprestados.remove(livro);
        qtdLivrosEmprestados--;
    }
    
}
