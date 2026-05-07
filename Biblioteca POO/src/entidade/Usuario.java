package entidade;

import java.util.Date;

public class Usuario {
    private String nome;
    private String registro;
    private Date dataNasc;

    public Usuario(String nome, String registro, Date dataNasc) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (registro == null || registro.trim().isEmpty()) {
            throw new IllegalArgumentException("Registro inválido");
        }
        if (dataNasc == null) {
            throw new IllegalArgumentException("Data inválida");
        }

        this.nome = nome;
        this.registro = registro;
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public String getRegistro() {
        return registro;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    @Override
    public String toString() {
        return nome + " (" + registro + ")";
    }
}
