package edu.dio.list.ex1ListaTarefas;

public class Tarefa {
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String toString() {
        return  descricao;
    }
}
