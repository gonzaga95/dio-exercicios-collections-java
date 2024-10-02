package edu.dio.set.ex6GerenciadorAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    Set<Aluno> alunos;

    public GerenciadorAlunos() {
        alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, Double media){
        alunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(Long matricula){
        for(Aluno aluno : alunos){
            if(aluno.getMatricula().equals(matricula)){
                alunos.remove(aluno);
                break;
            }
        }
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunos);
        if (!alunos.isEmpty()){
            return alunosPorNome;
        }
        else throw new RuntimeException("Gerenciador de alunos vazio");
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new comparatorAlunoPorMedia());
        if (!alunos.isEmpty()){
            alunosPorNota.addAll(alunos);
        }
        return alunosPorNota;
    }

    public Set<Aluno> exibirAlunos(){
        if (alunos.isEmpty()) throw new RuntimeException("Gerenciador de alunos vazio");
        return alunos;
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();
        gerenciador.adicionarAluno("Aluno5", 11L, 1.0);
        gerenciador.adicionarAluno("Aluno2", 22L, 10.0);
        gerenciador.adicionarAluno("Aluno9", 33L, 5.0);

        System.out.println(gerenciador.exibirAlunos());

        gerenciador.removerAluno(33L);

        System.out.println(gerenciador.exibirAlunosPorNota());
        System.out.println(gerenciador.exibirAlunosPorNome());

    }
}
