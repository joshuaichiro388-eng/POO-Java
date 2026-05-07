package algo;

public class ServidorAdministrativo extends Usuario {

    private int limiteEmprestimo;

    public ServidorAdministrativo(String nome) {
        super(nome);
        this.limiteEmprestimo = 4;
    }

    public int getLimiteEmprestimo() {
        return limiteEmprestimo;
    }
}