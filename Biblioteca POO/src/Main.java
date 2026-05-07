package core;

import entidade.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Livro l1 = new Livro("Minecraft", "Deus", "Joshua", 9999);
        Livro l2 = new Livro("Naruto", "Kishimoto", "Usuario", 67);

        Usuario u1 = new Usuario("João", "001", new Date());
        Usuario u2 = new Usuario("Maria", "002", new Date());

        biblioteca.cadastrarLivro(l1);
        biblioteca.cadastrarLivro(l2);

        biblioteca.cadastrarUsuario(u1);
        biblioteca.cadastrarUsuario(u2);

        biblioteca.listarLivros();

        biblioteca.emprestarLivro(u1, l1);

        System.out.println("\nEmprestimos ativos:");
        biblioteca.listarEmprestimosAtivos();

        System.out.println("\nDisponíveis:");
        biblioteca.listarDisponiveis();
    }
}
