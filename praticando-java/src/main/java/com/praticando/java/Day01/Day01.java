package com.praticando.java.Day01;

public class Day01 {
    public void executarOperacoesAritmeticas() {
        int valor01 = 10;
        int valor02 = 2;
        int valor03 = 40;

        calculadora(valor01, valor02, valor03, "Resultado da multiplicação entre ", "*");
        calculadora(valor01, valor02, valor03, "Resultado da soma entre ", "+");
        calculadora(valor01, valor02, valor03, "Resultado da subtração entre ", "-");
        calculadora(valor01, valor02, valor03, "Resultado da divisão entre ", "/");
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

    public static void calculadora(int valor01, int valor02, int valor03, String mensagem, String tipoDaEquacao) {
        switch (tipoDaEquacao) {
            case "+":
                int soma = valor01 + valor02 + valor03;
                System.out.println(mensagem + valor01 + " + " + valor02 + " + " + valor03 + " é " + soma);
                break;
            case "-":
                int subtracao = valor01 - valor02 - valor03;
                System.out.println(mensagem + valor01 + " - " + valor02 + " - " + valor03 + " é " + subtracao);
                break;
            case "*":
                int multiplicacao = valor01 * valor02 * valor03;
                System.out.println(mensagem + valor01 + " * " + valor02 + " * " + valor03 + " é " + multiplicacao);
                break;
            case "/":
                double divisao = (double) (valor01 + valor02) / valor03;
                System.out.println(mensagem + valor01 + " + " + valor02 + " / " + valor03 + " é " + divisao);
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
