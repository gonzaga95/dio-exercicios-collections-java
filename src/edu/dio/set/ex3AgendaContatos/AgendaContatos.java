package edu.dio.set.ex3AgendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, long numero) {
        contatos.add(new Contato(nome, numero));
    }

    public Set<Contato> exibirContatos() {
        return contatos;
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c : contatos) {
            if (c.getNome().contains(nome)) {
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, long novoNumero) {
        Contato contatoAtualizar = null;
        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                contatoAtualizar = c;
                contatoAtualizar.setNumeroTelefone(novoNumero);
                break;
            }
        }
        return contatoAtualizar;
    }
}
