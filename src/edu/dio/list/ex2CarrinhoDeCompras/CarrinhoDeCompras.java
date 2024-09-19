package edu.dio.list.ex2CarrinhoDeCompras;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> carrinho;

    public CarrinhoDeCompras(){
        carrinho = new ArrayList<Item>();
    }

    public void adicionarItem(String nome, BigDecimal preco, int quantidade){
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemRemover = new ArrayList<>();
        for(Item item : carrinho){
            if (item.getNome().equals(nome)){
                itemRemover.add(item);
            }
        }
        carrinho.removeAll(itemRemover);
    }

    public String calcularValorTotal(){
        BigDecimal soma = new BigDecimal(0);
        for (Item item : carrinho){
            soma.add(item.getPreco());
    }
        return "R$ " + soma.doubleValue();
        }

    public void exibirItens(){
        System.out.println("ITEM  |  VALOR  |  QUANTIDADE");
        for (Item item : carrinho){
            System.out.println(item);
        }
    }
}
