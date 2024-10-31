package com.praticando.java.Day09;

import com.praticando.java.Day09.exercicio.Carro;

public class ModificadoresDeAcesso {
    static void modificadoresDeAcesso() {
        Carro carro = new Carro("BMW", "M5", 200, 5);
        System.out.println(carro.nome);
    }

    public void encapsulamento(){
        //criando o construtor
        Carro carro = new Carro();

        //setando os valores
        carro.setNome("BMW");
        carro.setModelo("M1");
        carro.setQuantPassageiro(5);
        carro.setCapGasolina(200);

        //buscando os valores
        System.out.println("Nome: "+carro.getNome());
        System.out.println("Modelo: "+carro.getModelo());
        System.out.println("Quantidade de passageiro: "+carro.getQuantPassageiro());
        System.out.println("Capacidade de gasolina: "+carro.getCapGasolina());
    }
}
