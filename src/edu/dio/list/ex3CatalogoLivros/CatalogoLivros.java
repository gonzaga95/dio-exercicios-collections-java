package edu.dio.list.ex3CatalogoLivros;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livro> listaLivros;

    public CatalogoLivros() {
        listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, Year anoPublicacao) {
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!listaLivros.isEmpty()){
            for (Livro livro : listaLivros){
                if (livro.getAutor().equals(autor)){
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(Year anoInicial, Year anoFinal){
        List<Livro> livrosPorAno = new ArrayList<>();
        if (!listaLivros.isEmpty()){
            for (Livro livro : listaLivros){
                if (!livro.getAno().isAfter(anoFinal) && !livro.getAno().isBefore(anoInicial)){
                    livrosPorAno.add(livro);
                }
            }
        }
        return livrosPorAno;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorAutor = null;
        if (!listaLivros.isEmpty()){
            for (Livro livro : listaLivros){
                if (livro.getTitulo().equals(titulo)){
                    livroPorAutor = livro;
                    break;
                }
            }
        }
        return livroPorAutor;
    }
}
