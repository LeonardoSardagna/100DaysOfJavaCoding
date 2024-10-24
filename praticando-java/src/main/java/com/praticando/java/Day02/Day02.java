package com.praticando.java.Day02;

import java.util.Scanner;

public class Day02 {
    public void somaDeValores() {
        //scanner é utilizado para inserir valores durante a execução do programa.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira três valores para fazer a soma:");
        System.out.println("Valor 01: ");
        int valor01 = scanner.nextInt();
        System.out.println("Valor 02: ");
        int valor02 = scanner.nextInt();
        System.out.println("Valor 03: ");
        int valor03 = scanner.nextInt();

        int resultado = valor01 + valor02 + valor03;

        System.out.println("Resultado da soma de " + valor01 + "+" + valor02 + "+" + valor03 + " é igual a " + resultado);
    }

    public void leituraNomeCompleto() {
        Scanner scanner = new Scanner(System.in);

        String nome, sobrenome;

        System.out.println("Insira o seu nome e sobrenome:");
        System.out.print("Nome: ");
        nome = scanner.nextLine();
        System.out.print("Sobrenome: ");
        sobrenome = scanner.nextLine();

        System.out.println("Nome completo: " + nome + " " + sobrenome);
    }

    //podemos converter os valores utilzando o parse
    public void conversaoDePeso() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        String peso = scanner.nextLine();
        //valor era String e foi convertido para inteiro
        double metadePeso = Double.parseDouble(peso) / 2;
        System.out.println("A metade do peso " + peso + " é " + metadePeso);
    }
}
