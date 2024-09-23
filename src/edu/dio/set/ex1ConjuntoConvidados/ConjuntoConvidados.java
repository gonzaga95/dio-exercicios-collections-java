package edu.dio.set.ex1ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidado(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado convidado : convidados){
            if(convidado.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = convidado;
                break;
            }
        }
        if(convidadoParaRemover != null){
            convidados.remove(convidadoParaRemover);
        } else throw new RuntimeException("Convidado não encontrado");
    }

    public int contarConvidados(){
        return convidados.size();
    }

    public void exibirConvidados() {
        for(Convidado convidado : convidados){
            System.out.println(convidado);
        }
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Nome 1", 1);
        conjuntoConvidados.adicionarConvidado("Nome 2", 2);
        conjuntoConvidados.adicionarConvidado("Nome 3", 2);

        System.out.println(conjuntoConvidados.contarConvidados());

        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidado(2);

        conjuntoConvidados.exibirConvidados();
    }
}
