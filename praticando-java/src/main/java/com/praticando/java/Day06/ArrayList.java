package com.praticando.java.Day06;

import java.util.Scanner;

public class ArrayList {
    Scanner scanner = new Scanner(System.in);

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
        java.util.ArrayList<Integer> arrayList = new java.util.ArrayList<>();

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
        java.util.ArrayList<Integer> integerArrayList = new java.util.ArrayList<>();

        int valorLido = 0;

        System.out.println("Para finalizar o programa digite: -1");
        while (valorLido != -1) {
            System.out.print("Informe o número: ");
            valorLido = scanner.nextInt();
            //so adiciona se não for um -1
            if (valorLido >= 0) {
                integerArrayList.add(valorLido);
            }
        }

        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.println(integerArrayList.get(i));
        }
    }
}
