package algo;

import java.time.LocalDate;

public class Emprestimo {

    private Usuario usuario;
    private ItemBiblioteca item;
    private LocalDate dataEmprestimo;
    private LocalDate dataPrevista;
    private double multa;

    public Emprestimo(Usuario usuario, ItemBiblioteca item, LocalDate dataEmprestimo, LocalDate dataPrevista) {
        this.usuario = usuario;
        this.item = item;
        this.dataEmprestimo = dataEmprestimo;
        this.dataPrevista = dataPrevista;
        item.setDisponivel(false);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public ItemBiblioteca getItem() {
        return item;
    }

    public double calcularMulta(LocalDate dataDevolucao) {
        long diasAtrasados = dataDevolucao.toEpochDay() - dataPrevista.toEpochDay();

        if (diasAtrasados <= 0) {
            multa = 0;
        } else if (diasAtrasados <= 3) {
            multa = diasAtrasados * 2;
        } else {
            multa = diasAtrasados * 5;
        }

        return multa;
    }

    public void devolver() {
        item.setDisponivel(true);
    }

    public double getMulta() {
        return multa;
    }
}
