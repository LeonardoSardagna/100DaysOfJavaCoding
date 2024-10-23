package com.praticando.java;

public class Day01 {
    public void executarOperacoesAritmeticas(){
        int valor01 = 10;
        int valor02 = 2;
        int valor03 = 40;

        //Faça um programa que multiplique 3 valores e mostre o resultado na tela
        int resultadoMultiplicacao = valor01 * valor02 * valor03;
        System.out.println("Resultado da multiplicação entre "+valor01+"X"+valor02+"X"+valor03+" é "+ resultadoMultiplicacao);

        //Faça um programa que some 3 valores e mostre o resultado na tela
        int resultadoSoma = valor01 + valor02 + valor03;
        System.out.println("Resultado da soma entre "+valor01+"+"+valor02+ "+" +valor03+" é "+ resultadoSoma);

        //Faça um programa que subtraia 3 valores e mostre o resultado na tela
        int resultadoSubtracao = valor03 - valor01;
        System.out.println("Resultado da subtração entre "+valor03+"-"+valor01+ " é "+ resultadoSubtracao);

        //Faça um programa que divida um valor e mostre o resultado na tela
        int resultadoDivisao = (valor01+valor03) / valor02;
        System.out.println("Resultado da divisão entre ("+valor01 +"+"+ valor03+")/"+valor02 +" é "+ resultadoDivisao);
    }
}
