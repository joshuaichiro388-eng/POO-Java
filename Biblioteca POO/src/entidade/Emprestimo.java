package entidade;

import java.util.Date;

public class Emprestimo {
    private Usuario usuario;
    private Livro livro;
    private Date dataEmprestimo;
    private Date dataPrevista;
    private boolean ativo;
    private double multa;

    public Emprestimo(Usuario usuario, Livro livro, Date dataPrevista) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = new Date();
        this.dataPrevista = dataPrevista;
        this.ativo = true;
        this.multa = 0;
    }

    public void finalizar() {
        if (!ativo) {
            throw new IllegalStateException("Já finalizado");
        }
        ativo = false;
        calcularMulta();
        livro.devolver();
    }

    private void calcularMulta() {
        long atraso = (new Date().getTime() - dataPrevista.getTime()) / (1000 * 60 * 60 * 24);

        if (atraso <= 0) {
            multa = 0;
        } else if (atraso <= 3) {
            multa = atraso * 2;
        } else {
            multa = atraso * 5;
        }
    }

    public boolean isAtivo() {
        return ativo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    @Override
    public String toString() {
        return livro.getTitulo() + " -> " + usuario.getNome() +
                " | Ativo: " + ativo +
                " | Multa: R$ " + multa;
    }
}