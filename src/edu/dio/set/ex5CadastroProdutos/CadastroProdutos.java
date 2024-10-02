package edu.dio.set.ex5CadastroProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    Set<Produto> produtos;

    public CadastroProdutos(){
        produtos = new HashSet<>();
    }

    public void adicionarProduto(long cod,
                                 String nome,
                                 double preco,
                                 int quantidade){
        produtos.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtos);
        if (!produtos.isEmpty()) {
            return produtosPorNome;
        }
        else throw new RuntimeException("Nenhum produto cadastrado");
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorProdutoPorPreco());
        if (!produtos.isEmpty()) {
            produtosPorPreco.addAll(produtos);
            return produtosPorPreco;
        } else throw new RuntimeException("Nenhum produto cadastrado");
    }
}
