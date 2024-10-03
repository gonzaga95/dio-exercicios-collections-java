package edu.dio.map.ex1AgendaContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatosMap;

    public AgendaContatos() {
        contatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        contatosMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!contatosMap.isEmpty()) {
            contatosMap.remove(nome);
        } else throw new RuntimeException("Agenda de contatos vazia");
    }

    public void exibirContatos() {
        if (!contatosMap.isEmpty()) {
            System.out.println("Contatos:" + contatosMap);
        } else throw new RuntimeException("Agenda de contatos vazia");
    }

    public Integer pesquisarPorNome(String nome) {
        Integer telefoneContato = null;
        if (!contatosMap.isEmpty()) {
            telefoneContato = contatosMap.get(nome);
        } else throw new RuntimeException("Agenda de contatos vazia");
        return telefoneContato;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("João", 123456);
        agendaContatos.adicionarContato("Maria", 321654);

        agendaContatos.exibirContatos();

        System.out.println("Por nome: ");
        System.out.println(agendaContatos.pesquisarPorNome("Maria"));
    }
}
