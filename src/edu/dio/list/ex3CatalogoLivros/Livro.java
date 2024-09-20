package edu.dio.list.ex3CatalogoLivros;

import java.time.Year;

public class Livro {
    private String titulo;
    private String autor;
    private Year ano;

    public Livro(String titulo, String autor, Year ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Year getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ano=" + ano +
                '}';
    }
}
