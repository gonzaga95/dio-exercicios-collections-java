package edu.dio.set.ex5CadastroProdutos;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private long codigo;

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public long getCodigo() {
        return codigo;
    }

    @Override
    public int compareTo(Produto p) {
        return this.getNome().compareTo(p.getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(getCodigo(), produto.getCodigo());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigo());
    }

    @Override
    public String toString() {
        return "Produto{" +
                "cod: " + codigo +
                ", produto: '" + nome + '\'' +
                ", preço: " + preco +
                ", qtd: " + quantidade +
                '}';
    }
}

class ComparatorProdutoPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto o1, Produto o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}
