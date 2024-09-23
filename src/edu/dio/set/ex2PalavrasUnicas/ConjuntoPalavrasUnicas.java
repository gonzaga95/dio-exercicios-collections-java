package edu.dio.set.ex2PalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavras;

    public ConjuntoPalavrasUnicas() {
        palavras = new HashSet<>();
    }

    public void adicionaPalavra(String palavra) {
        palavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        palavras.remove(palavra);
    }

    public boolean verificarPalavra (String palavra) {
        return palavras.contains(palavra);
    }

    public Set<String> exibirPalavrasUnicas() {
        return palavras;
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavrasUnicas  = new ConjuntoPalavrasUnicas();

        palavrasUnicas.adicionaPalavra("Palavra");
        palavrasUnicas.adicionaPalavra("Palavra");
        palavrasUnicas.adicionaPalavra("Palavrão");
        palavrasUnicas.adicionaPalavra("Palavrona");
        System.out.println(palavrasUnicas.exibirPalavrasUnicas());

        palavrasUnicas.removerPalavra("Palavra");

        System.out.println(palavrasUnicas.verificarPalavra("Palavrão"));

        System.out.println(palavrasUnicas.exibirPalavrasUnicas());
    }
}
