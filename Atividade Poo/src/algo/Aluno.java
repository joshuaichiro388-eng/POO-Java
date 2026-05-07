package algo;

public class Aluno extends Usuario {

    private int limiteEmprestimo;

    public Aluno(String nome) {
        super(nome);
        this.limiteEmprestimo = 3;
    }

    public int getLimiteEmprestimo() {
        return limiteEmprestimo;
    }
}
