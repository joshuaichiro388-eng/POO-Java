package algo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Biblioteca {

    private ArrayList<ItemBiblioteca> itens = new ArrayList<>();
    private Queue<Usuario> filaReserva = new LinkedList<>();

    public void adicionarItem(ItemBiblioteca item) {
        itens.add(item);
    }

    public void listarItens() {
        for (ItemBiblioteca i : itens) {
            System.out.println(i.getTitulo());
        }
    }

    public void listarLivros() {
        for (ItemBiblioteca i : itens) {
            if (i instanceof Livro) {
                System.out.println(i.getTitulo());
            }
        }
    }

    public void listarRevistas() {
        for (ItemBiblioteca i : itens) {
            if (i instanceof Revista) {
                System.out.println(i.getTitulo());
            }
        }
    }

    public void listarTeses() {
        for (ItemBiblioteca i : itens) {
            if (i instanceof Tese) {
                System.out.println(i.getTitulo());
            }
        }
    }

    public void reservar(Usuario u, ItemBiblioteca item) {
        if (!item.isDisponivel()) {
            filaReserva.add(u);
            System.out.println(u.getNome() + " entrou na fila");
        } else {
            System.out.println("Item disponível");
        }
    }

    public void devolverItem(ItemBiblioteca item) {
        item.setDisponivel(true);

        if (!filaReserva.isEmpty()) {
            Usuario proximo = filaReserva.poll();
            System.out.println("Item entregue para: " + proximo.getNome());
            item.setDisponivel(false);

        }
    }
}