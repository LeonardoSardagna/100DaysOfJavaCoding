package com.praticando.java.Day09.exercicio;

//public: qualquer classe pode acessar essa classe
//sem declarar: apenas classes dentro do mesmo pacote pode acessar essa classe
//private: só pode ser acessado dentro da própria classe
//protected: permite acessar no mesmo pacote e de sub pacotes
public class Carro {
    public String nome;
    private String modelo;
    protected double capGasolina;
    int quantPassageiro;

    public Carro(String nome, String modelo, double capGasolina, int quantPassageiro) {
        this.nome = nome;
        this.modelo = modelo;
        this.capGasolina = capGasolina;
        this.quantPassageiro = quantPassageiro;
    }

    public Carro() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCapGasolina() {
        return capGasolina;
    }

    public void setCapGasolina(double capGasolina) {
        this.capGasolina = capGasolina;
    }

    public int getQuantPassageiro() {
        return quantPassageiro;
    }

    public void setQuantPassageiro(int quantPassageiro) {
        this.quantPassageiro = quantPassageiro;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capGasolina=" + capGasolina +
                ", quantPassageiro=" + quantPassageiro +
                '}';
    }
}
