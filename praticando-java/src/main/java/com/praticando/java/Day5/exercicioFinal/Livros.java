package com.praticando.java.Day5.exercicioFinal;

public class Livros {
    private String titulo;
    private String autor;
    private int ano;
    private Enum<StatusLivro> staus;

    public Livros(String titulo, String autor, int ano, Enum<StatusLivro> staus) {
        if (!titulo.isBlank()) {
            this.titulo = titulo;
        } else {
            throw new IllegalArgumentException("O título não pode ser null");
        }
        if (!autor.isBlank()) {
            this.autor = autor;
        } else {
            throw new IllegalArgumentException("O autor não pode ser null");
        }
        if (ano > 0) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("O ano não pode conter um valor negativo");
        }
        this.staus = staus;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Enum<StatusLivro> getStaus() {
        return staus;
    }

    public void setStaus(Enum<StatusLivro> staus) {
        this.staus = staus;
    }

    @Override
    public String toString() {
        return "titulo: " + titulo +
                ", autor: " + autor +
                ", ano: " + ano +
                ", staus: " + staus;
    }
}
