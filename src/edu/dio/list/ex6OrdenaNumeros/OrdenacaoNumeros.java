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
        Collections.reverse(listaNumeros);
        return listaNumeros;
    }
}
