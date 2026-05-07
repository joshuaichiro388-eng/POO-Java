package algo;

public class Tese extends ItemBiblioteca {

    private String autor;
    private String orientador;
    private String areaPesquisa;

    public Tese(String titulo, String autor, String orientador, String areaPesquisa) {
        super(titulo);
        this.autor = autor;
        this.orientador = orientador;
        this.areaPesquisa = areaPesquisa;
    }

    public String getAutor() {
        return autor;
    }

    public String getOrientador() {
        return orientador;
    }

    public String getAreaPesquisa() {
        return areaPesquisa;
    }
}