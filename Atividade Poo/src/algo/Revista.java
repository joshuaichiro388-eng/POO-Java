package algo;

public class Revista extends ItemBiblioteca {

    private int edicao;

    public Revista(String titulo, int edicao) {
        super(titulo);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }
}
