package com.praticando.java.Day05.exercicio01;

//exercício 01
public class Produto {
    private String nome;
    private double preco;
    private int desconto;

    public void calculaPrecoComDesconto(Produto produto) {
        double precoComDesconto = produto.preco * (1 - (produto.desconto / 100.0));
        produto.setPreco(precoComDesconto);
    }

    public Produto(String nome, double preco, int desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return "nome=" + nome +
                ", preco=" + preco +
                ", desconto=" + desconto;
    }
}
