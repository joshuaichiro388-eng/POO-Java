package algo;

public class Professor extends Usuario {

    private int limiteEmprestimo;

    public Professor(String nome) {
        super(nome);
        this.limiteEmprestimo = 5;
    }

    public int getLimiteEmprestimo() {
        return limiteEmprestimo;
    }
}
