package edu.dio.set.ex4ListaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        this.tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        if (!tarefas.isEmpty()){
            for (Tarefa tarefa : tarefas) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    tarefas.remove(tarefa);
                }
                else throw new RuntimeException("Tarefa não localizada");
            }
        } else throw new RuntimeException("Lista de tarefas vazia");
    }

    public Set<Tarefa> exibirTarefas() {
        return this.tarefas;
    }

    public int contarTarefas(){
        return this.tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if (!tarefas.isEmpty()){
            for (Tarefa tarefa : tarefas) {
                if (tarefa.isStatus()){
                    tarefasConcluidas.add(tarefa);
                }
            }
        } else throw new RuntimeException("Lista de tarefas vazia");
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if (!tarefas.isEmpty()){
            for (Tarefa tarefa : tarefas) {
                if (!tarefa.isStatus()){
                    tarefasPendentes.add(tarefa);
                }
            }
        } else throw new RuntimeException("Lista de tarefas vazia");
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida (String descricao){
        if (!tarefas.isEmpty()){
            for (Tarefa tarefa : tarefas) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    tarefa.setStatus(true);
                }
            }
        }
        else throw new RuntimeException("Lista de tarefas vazia");
    }

    public void marcarTarefaPendente (String descricao){
        if (!tarefas.isEmpty()){
            for (Tarefa tarefa : tarefas) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    tarefa.setStatus(false);
                }
            }
        }
        else throw new RuntimeException("Lista de tarefas vazia");
    }

    public void limparListaTarefas(){
        this.tarefas.clear();
    }
}
