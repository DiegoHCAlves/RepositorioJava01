/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.service;

import biblioteca.model.Livro;
import biblioteca.model.Usuario;
import biblioteca.repository.LivroRepository;
import biblioteca.repository.UsuarioRepository;
import java.util.List;

/**
 *
 * @author ficdev
 */
public class BibliotecaService {

    private LivroRepository livroRepository = new LivroRepository();
    private UsuarioRepository usuarioRepository = new UsuarioRepository();

    public void cadastrarLivro(Livro livro) {
        livroRepository.cadastrar(livro);
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarioRepository.cadastrar(usuario);
    }

    public void realizarEmprestimo(int idLivro, int idUsuario) throws
        EmprestimoException {
        Livro livro = livroRepository.buscarPorId(idLivro);
        Usuario usuario = usuarioRepository.buscarPorId(idUsuario);
        if (livro != null && usuario != null && livro.isDisponivel() && usuario.getPossuiVaga()) {
            livro.setDisponivel(false);
            usuario.adicionarLivro(livro);
        } else {
            throw new EmprestimoException("Não foi possível realizar o empréstimo.");
        }
    }

    public void realizarDevolucao(int idLivro, int idUsuario) throws
        DevolucaoException {
        Livro livro = livroRepository.buscarPorId(idLivro);
        Usuario usuario = usuarioRepository.buscarPorId(idUsuario);
        if (livro != null && usuario != null && !livro.isDisponivel() && usuario.getLivrosEmprestados().contains(livro)) {
            livro.setDisponivel(true);
            usuario.removerLivro(livro);
        } else {
            throw new DevolucaoException("Não foi possível realizar a devolução. ");
        }
    }

    public List<Livro> listarLivros() {
        return livroRepository.buscarTodos();
    }

    public List<Usuario> listarUsuarios() {
        return usuarioRepository.buscarTodos();
    }

    public Livro buscarLivro(int id) {
        return livroRepository.buscarPorId(id);
    }

    public Usuario buscarUsuario(int id) {
        return usuarioRepository.buscarPorId(id);
    }
}
