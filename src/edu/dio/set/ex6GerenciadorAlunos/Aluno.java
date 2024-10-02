package edu.dio.set.ex6GerenciadorAlunos;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{

    private String nome;
    private Long matricula;
    private Double media;

    public Aluno(String nome, Long matricula, Double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    public Double getMedia() {
        return media;
    }

    public Long getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Aluno a) {
        return this.nome.compareTo(a.getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(getMatricula(), aluno.getMatricula());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getMatricula());
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", media=" + media +
                '}';
    }
}

class comparatorAlunoPorMedia implements Comparator<Aluno> {
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getMedia(), a2.getMedia());
    }
}
