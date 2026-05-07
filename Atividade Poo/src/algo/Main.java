package algo;

import java.time.LocalDate;

public class Main {

  public static void main(String[] args) {
    Livro livro = new Livro("Java Basico", "Joshua");
    Revista revista = new Revista("Jujuts Kaisen", 10);
    Tese tese = new Tese("IA", "João", "Carlos", "Inteligência Artificial");
    Usuario user = new Usuario("klebãoXD");
    Aluno aluno = new Aluno("Fulano");
    Professor prof = new Professor("Maria");
    ServidorAdministrativo serv = new ServidorAdministrativo("Carlos");
    Biblioteca biblioteca = new Biblioteca();
    biblioteca.adicionarItem(livro);
    biblioteca.adicionarItem(revista);
    biblioteca.adicionarItem(tese);
    Emprestimo emp = new Emprestimo(
            user,
            livro,
            LocalDate.now(),
            LocalDate.now().plusDays(3)
    );
    user.adicionarEmprestimo(emp);
    double multa = emp.calcularMulta(LocalDate.now().plusDays(5));
    System.out.println("--- EMPRÉSTIMO ---");
    System.out.println(emp.getUsuario().getNome());
    System.out.println(emp.getItem().getTitulo());
    System.out.println("Multa: " + multa);
    System.out.println("--- ITENS ---");
    biblioteca.listarItens();
    System.out.println("--- FILTROS ---");
    System.out.println("Livros:");
    biblioteca.listarLivros();
    System.out.println("Revistas:");
    biblioteca.listarRevistas();
    System.out.println("Teses:");
    biblioteca.listarTeses();
    System.out.println("--- COMPARAÇÃO ---");
    System.out.println("Livro -> autor: " + livro.getAutor());
    System.out.println("Revista -> edicao: " + revista.getEdicao());
    System.out.println("Tese -> autor: " + tese.getAutor());
    System.out.println("--- USUÁRIOS ---");
    System.out.println(aluno.getNome() + " limite: " + aluno.getLimiteEmprestimo());
    System.out.println(prof.getNome() + " limite: " + prof.getLimiteEmprestimo());
    System.out.println(serv.getNome() + " limite: " + serv.getLimiteEmprestimo());
    System.out.println("--- EMPRÉSTIMOS DO USUÁRIO ---");
    user.listarEmprestimos();
    System.out.println("--- REMOÇÃO ---");
    user.removerEmprestimo(emp);
    user.listarEmprestimos();
    System.out.println("--- FILA ---");
    biblioteca.reservar(user, livro);
    biblioteca.reservar(new Usuario("Stev"), livro);
    biblioteca.reservar(new Usuario("Bruno"), livro);
    biblioteca.devolverItem(livro);
  }
}