package algo;

import java.util.ArrayList;

public class Usuario {

    private String nome;
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarEmprestimo(Emprestimo e) {
        emprestimos.add(e);
    }

    public void removerEmprestimo(Emprestimo e) {
        emprestimos.remove(e);
    }

    public void listarEmprestimos() {
        for (Emprestimo e : emprestimos) {
            System.out.println(e.getItem().getTitulo());
        }
    }
}