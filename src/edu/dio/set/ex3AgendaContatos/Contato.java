package edu.dio.set.ex3AgendaContatos;

import java.util.Objects;

public class Contato {
    private String nome;
    private long numeroTelefone;

    public Contato(String nome, long numeroTelefone) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }

    public void setNumeroTelefone(long numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getNome() {
        return nome;
    }

    public long getNumeroTelefone() {
        return numeroTelefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNome());
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numeroTelefone=" + numeroTelefone +
                '}';
    }
}
