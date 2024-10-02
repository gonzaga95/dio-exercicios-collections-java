package edu.dio.set.ex4ListaTarefas;

public class Tarefa {
    private String descricao;
    private boolean status;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.status = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Tarefa {" + descricao + "}";
    }
}
