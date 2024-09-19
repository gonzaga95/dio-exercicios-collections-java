package edu.dio.list.ex2CarrinhoDeCompras;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Item {
    private String nome;
    private BigDecimal preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = new BigDecimal(preco).setScale(2, RoundingMode.HALF_UP);
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "- " + nome + " | R$ " + preco + " | " + quantidade;
    }
}
