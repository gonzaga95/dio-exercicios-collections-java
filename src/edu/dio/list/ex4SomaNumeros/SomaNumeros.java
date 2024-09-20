package edu.dio.list.ex4SomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> listaNumeros;

    public SomaNumeros() {
        listaNumeros = new ArrayList<>();
    }

    public void adicionaNumeros(int num){
        listaNumeros.add(num);
    }

    public int calcularSoma(){
        int soma = 0;
        if (!listaNumeros.isEmpty()) {
            for (Integer num : listaNumeros){
                soma += num;
            }
        }
        return soma;
    }

    public Integer encontrarMaiorNumero(){
        int maior = 0;
        if (!listaNumeros.isEmpty()) {
            for (Integer num : listaNumeros){
                if (num > maior){
                    maior = num;
                }
            }
        }
        return maior;
    }

    public Integer encontrarMenorNumero(){
        int menor = 0;
        if (!listaNumeros.isEmpty()) {
            for (Integer num : listaNumeros){
                if (num < menor){
                    menor = num;
                }
            }
        }
        return menor;
    }

    public List<Integer> exibirNumeros(){
        return listaNumeros;
    }
}
