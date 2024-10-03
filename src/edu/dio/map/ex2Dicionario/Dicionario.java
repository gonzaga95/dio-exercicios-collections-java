package edu.dio.map.ex2Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        this.dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if (!dicionarioMap.isEmpty()) {
            this.dicionarioMap.remove(palavra);
        }
    }

    public Map<String, String> getDicionarioMap() {
        if (this.dicionarioMap.isEmpty()) {
            return this.dicionarioMap;
        } else throw new RuntimeException("Dicionário vazio");
    }

    public String pesquisarPorPalavra(String palavra){
        if (!dicionarioMap.isEmpty()) {
            return this.dicionarioMap.get(palavra);
        }
        else throw new RuntimeException("Dicionário vazio");
    }
}
