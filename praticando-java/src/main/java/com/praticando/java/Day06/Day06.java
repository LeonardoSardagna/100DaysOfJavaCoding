package com.praticando.java.Day06;

import java.util.ArrayList;
import java.util.Scanner;

public class Day06 {
    Scanner scanner = new Scanner(System.in);

    //Constantes
    public void usoDeConstantes() {
        final int LIMITE_SUPERIOR = 10;
        for (int i = 0; i < LIMITE_SUPERIOR; i++) {
            System.out.println("Leonardo");
        }
        //Não posso alterar a constante
        //LIMITE_SUPERIOR = 100;
    }

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

        //Definindo vetpres de várias formas
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

    public void buscarNumerosNoArray() {
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Qual número deseja buscar?");
        int escolhaNumero = scanner.nextInt();
        scanner.nextLine();

        boolean verificadorDeIgualdade = false;

        for (int i = 0; i < 5; i++) {
            if (escolhaNumero == numeros[i]) {
                verificadorDeIgualdade = true;
                break;
            }
        }

        if (verificadorDeIgualdade) {
            System.out.println("Esse número se encontra na lista");
            System.out.println("Números ecolhido: " + escolhaNumero);

            System.out.println();

            System.out.println("Números na lista: ");
            for (int j = 0; j < 5; j++) {
                System.out.println(numeros[j]);
            }
        } else {
            System.out.println("O número não está presente na lista");
        }
    }

    public void usoDeArrayList() {
        //Criação da lista
        ArrayList<Integer> arrayList = new ArrayList<>();

        //Adicionando elementos
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        //imprimindo cada elemento na lista
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        //ou
        arrayList.forEach(System.out::println);
    }

    public void adicionaNumerosNaLista() {
        //faça um programa que adicione números inteiros num arraylist ate
        //o número digitado ser -1. depois imprima a lista na tela
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        int valorLido = 0;

        System.out.println("Para finalizar o programa digite: -1");
        while (valorLido != -1) {
            System.out.print("Informe o número: ");
            valorLido = scanner.nextInt();
            //so adiciona se não for um -1
            if (valorLido >= 0){
                integerArrayList.add(valorLido);
            }
        }

        for (int i = 0; i < integerArrayList.size(); i++){
            System.out.println(integerArrayList.get(i));
        }
    }
}
