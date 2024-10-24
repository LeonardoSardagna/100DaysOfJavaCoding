package com.praticando.java.Day01;

public class Day01 {
    public void executarOperacoesAritmeticas() {
        int valor01 = 10;
        int valor02 = 2;
        int valor03 = 40;

        //Faça um programa que multiplique 3 valores e mostre o resultado na tela
        int resultadoMultiplicacao = valor01 * valor02 * valor03;
        System.out.println("Resultado da multiplicação entre " + valor01 + "X" + valor02 + "X" + valor03 + " é " + resultadoMultiplicacao);

        //Faça um programa que some 3 valores e mostre o resultado na tela
        int resultadoSoma = valor01 + valor02 + valor03;
        System.out.println("Resultado da soma entre " + valor01 + "+" + valor02 + "+" + valor03 + " é " + resultadoSoma);

        //Faça um programa que subtraia 3 valores e mostre o resultado na tela
        int resultadoSubtracao = valor03 - valor01;
        System.out.println("Resultado da subtração entre " + valor03 + "-" + valor01 + " é " + resultadoSubtracao);

        //Faça um programa que divida um valor e mostre o resultado na tela
        int resultadoDivisao = (valor01 + valor03) / valor02;
        System.out.println("Resultado da divisão entre (" + valor01 + "+" + valor03 + ")/" + valor02 + " é " + resultadoDivisao);
    }

    public void somaDeTresValoresQuebrados() {
        //faça um programa que mostre a soma de 3 valores quebrados
        double valor01 = 10.5;
        double valor02 = 5.5;
        double valor03 = 50.5;
        double resultado = valor01 + valor02 + valor03;
        System.out.println("Soma dos valores " + valor01 + "+" + valor02 + "+" + valor03 + " é " + resultado);
    }

    public void restoDaDivisaoDeDoisValores() {
        //faça um programa que mostre o resto da divisão de dois valores quebrados
        double valor01 = 3.2;
        double valor02 = 1.5;

        double resultado = valor01 % valor02;
        //resulatado foi um longo número quebrado
        System.out.println("O resto da divisão é " + resultado);

        //usar a biblioteca String e o método format para formatar a quantidade de casa decimais
        // "%.2F" quer dizer que após o "." exibir apenas duas casas decimais. O F é de float
        System.out.println("O resto da divisão é " + String.format("%.2f", resultado));
    }
}
