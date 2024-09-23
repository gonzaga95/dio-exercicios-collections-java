package edu.dio.list.ex6OrdenaNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    List<Integer> listaNumeros;

    public OrdenacaoNumeros (){
        listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero (int numero){
        listaNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        Collections.sort(listaNumeros);
        return listaNumeros;
    }

    public List<Integer> ordenarDescendente() {
        Collections.sort(listaNumeros, Collections.reverseOrder());
        return listaNumeros;
    }

    @Override
    public String toString() {
        return "OrdenacaoNumeros{" +
                "listaNumeros=" + listaNumeros +
                '}';
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(5);

        System.out.println(ordenacaoNumeros);

        ordenacaoNumeros.ordenarAscendente();

        System.out.println(ordenacaoNumeros);

        ordenacaoNumeros.adicionarNumero(25);

        ordenacaoNumeros.ordenarDescendente();
        System.out.println(ordenacaoNumeros);
    }
}
