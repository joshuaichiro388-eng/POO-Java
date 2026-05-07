package entidade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void listarLivros() {
        for (Livro l : livros) {
            System.out.println(l);
        }
    }

    public void listarUsuarios() {
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
    }

    public void emprestarLivro(Usuario usuario, Livro livro) {
        livro.emprestar();

        Date devolucao = new Date(System.currentTimeMillis() + (5L * 24 * 60 * 60 * 1000)); // +5 dias

        Emprestimo e = new Emprestimo(usuario, livro, devolucao);
        emprestimos.add(e);
    }

    public void devolverLivro(Emprestimo e) {
        e.finalizar();
    }

    public void listarDisponiveis() {
        for (Livro l : livros) {
            if (l.getQtdDisponivel() > 0) {
                System.out.println(l);
            }
        }
    }

    public void listarIndisponiveis() {
        for (Livro l : livros) {
            if (l.getQtdDisponivel() == 0) {
                System.out.println(l);
            }
        }
    }

    public void listarEmprestimosAtivos() {
        for (Emprestimo e : emprestimos) {
            if (e.isAtivo()) {
                System.out.println(e);
            }
        }
    }

    public void listarEmprestimosFinalizados() {
        for (Emprestimo e : emprestimos) {
            if (!e.isAtivo()) {
                System.out.println(e);
            }
        }
    }
}
