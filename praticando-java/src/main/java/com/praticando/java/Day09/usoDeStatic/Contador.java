package com.praticando.java.Day09.usoDeStatic;

//Escreva uma classe chamada Contador, que tem um atributo estático que
//é incrementado sempre que a classe for instanciada. Crie métodos para
//zerar, incrementar e retornar o valor do contador. Desenvolva um
//programa para testar essa classe
public class Contador {
    private static int contador;

    public static int incrementar() {
        return contador++;
    }

    public static int zerar() {
        return contador = 0;
    }

    public static int retornaContador() {
        return contador;
    }

}
