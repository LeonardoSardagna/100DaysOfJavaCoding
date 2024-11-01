package com.praticando.java.Day06;

import java.util.Scanner;

public class Vetores {
    Scanner scanner = new Scanner(System.in);

    //Vetores
    public void usoDeVetores() {
        //Vetor com tamanho definido
        final int TAM = 5;
        int[] vetor01 = new int[TAM];

        //Vetor com valore definidos
        int[] vetor02 = {1, 2, 3, 4, 5};
        //Imprimindo os valores dos vetores
        for (int i = 0; i < 5; i++) {
            System.out.println(vetor02[i]);
        }

        //Inserir valores em um vetor e imprimir na tela
        int[] vetor03 = new int[TAM];
        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite um valor para a posição " + (i + 1) + " do vetor: ");
            vetor03[i] = scanner.nextInt();
        }

        System.out.println("Imprimindo os valores dos vetores");
        for (int i = 0; i < TAM; i++) {
            System.out.println(vetor03[i]);
        }

        //Definindo vetores de várias formas
        int[] vetorInt = {1, 2, 3, 4, 5};
        double[] vetorDouble = {1.5, 2.7, 3.9, 4.4, 5.3};
        char[] vetorChar = {'a', 'b'};
        float[] vetorFloat = {1.3f, 1.4f, 2.5f};
    }

    public void diaDaSemanaComVetor() {
        //faça um programa que leia um número e imprima na tela
        //qual dia da semana de acordo com o número lido usando o vetor

        String[] diaDaSemana = {
                "Domingo",
                "Segunda-feira",
                "Terça-feira",
                "Quarta-feira",
                "Quinta-feira",
                "Sexta-feira",
                "Sábado"};

        System.out.print("Digite um número: ");
        int opcao = scanner.nextInt();

        //Primeira forma
        System.out.println(diaDaSemana[opcao - 1]);

        //Segunda forma
        switch (opcao) {
            case 1:
                System.out.println(diaDaSemana[0]);
                break;
            case 2:
                System.out.println(diaDaSemana[1]);
                break;
            case 3:
                System.out.println(diaDaSemana[2]);
                break;
            case 4:
                System.out.println(diaDaSemana[3]);
                break;
            case 5:
                System.out.println(diaDaSemana[4]);
                break;
            case 6:
                System.out.println(diaDaSemana[5]);
                break;
            case 7:
                System.out.println(diaDaSemana[6]);
                break;
        }
    }
}
