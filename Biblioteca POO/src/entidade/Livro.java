package entidade;

public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private Integer qtdPaginas;
    private Integer qtdDisponivel;

    public Livro(String titulo, String autor, String editora, Integer qtdDisponivel) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Título inválido");
        }
        if (autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("Autor inválido");
        }
        if (editora == null || editora.trim().isEmpty()) {
            throw new IllegalArgumentException("Editora inválida");
        }
        if (qtdDisponivel == null || qtdDisponivel < 0) {
            throw new IllegalArgumentException("Quantidade inválida");
        }

        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.qtdDisponivel = qtdDisponivel;
    }

    public void setQtdPaginas(Integer qtdPaginas) {
        if (qtdPaginas == null || qtdPaginas <= 0) {
            throw new IllegalArgumentException("Páginas inválidas");
        }
        this.qtdPaginas = qtdPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getQtdDisponivel() {
        return qtdDisponivel;
    }

    public void emprestar() {
        if (qtdDisponivel <= 0) {
            throw new IllegalStateException("Sem estoque");
        }
        qtdDisponivel--;
    }

    public void devolver() {
        qtdDisponivel++;
    }

    @Override
    public String toString() {
        return titulo + " | Autor: " + autor +
                " | Editora: " + editora +
                " | Disponível: " + qtdDisponivel;
    }
}
