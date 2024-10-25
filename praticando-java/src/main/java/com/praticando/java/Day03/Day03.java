package com.praticando.java.Day03;

import java.util.Scanner;

public class Day03 {
    Scanner scanner = new Scanner(System.in);

    public void verificarIdadeMaiorIdade() {
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        if (idade == 10) {
            System.out.println("Acesso negado para crianças");
        } else if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Acesso negado para menor de idade");
        }
    }

    public void compararPalavras() {
        System.out.println("Digite a primeira palavra: ");
        String palavra01 = scanner.nextLine();

        System.out.println("Digite a segunda palavra: ");
        String palavra02 = scanner.nextLine();

        if (palavra01.equalsIgnoreCase(palavra02)) {
            System.out.println("A palavra " + palavra01 + " é igual a palavra " + palavra02);
        } else {
            System.out.println("São palavras diferentes");
        }
    }

    public void verificarSomaMaiorQue10() {
        System.out.println("Digite o 1° número: ");
        int numero01 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o 2° número: ");
        int numero02 = scanner.nextInt();

        int soma = numero01 + numero02;

        if (soma > 10) {
            System.out.println("A soma entre o numero " + numero01 + " e o número " + numero02 + " é " + soma);
            System.out.println("Maior que 10");
        } else {
            System.out.println("A soma entre o numero " + numero01 + " e o número " + numero02 + " é " + soma);
            System.out.println("Menor que 10");
        }
    }

    public void verificarParidade() {
        System.out.println("Digite um número para saber se ele é par ou ímpar");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
    }

    //utilizando o length
    public void verificarTamanhoDaPalavra() {
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        int condicional = 5;

        if (palavra.length() > condicional) {
            System.out.println("A palavra " + palavra + " possui " + palavra.length() + " caracteres");
            System.out.println("Maior que " + condicional);
        } else {
            System.out.println("A palavra " + palavra + " possui " + palavra.length() + " caracteres");
            System.out.println("Menor que " + condicional);
        }
    }

    //usando conectivo lógico &&
    public void verificarnumeroEntre5e20() {
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero >= 5 && numero <= 20) {
            System.out.println("O número " + numero + " está entre 5 e 20");
        } else {
            System.out.println("o número não está entre 5 e 20");
        }
    }

    public void verificadorPalavraDia() {
        //FAÇA UM PROGRAMA QUE LEIA UMA PALAVRA
        //E INFORME SE A PALAVRA FOR “DIA” OU NÃO
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        if (palavra.equalsIgnoreCase("dia")) {
            System.out.println("Digitou dia");
        } else {
            System.out.println("Não digitou dia");
        }
    }

    //Usando os conectivos lógicos && ou ||

    public void varificarNumeroQuebradoMenor5ouMaior10() {
        //faça um programa que leia um número quebrado e imprima na tela se ele for menor que 5
        //ou maior que 10
        System.out.print("Digite um número: ");
        String numeroString = scanner.nextLine();
        double numero = Double.parseDouble(numeroString);

        if (numero < 5 || numero > 10) {
            if (numero > 10) {
                System.out.println("O número " + numero + " é maior que " + 10);
            } else {
                System.out.println("O número " + numero + " é menor que " + 5);
            }
        } else {
            System.out.println("O número " + numero + " não é menor que 5 e nem maior que 10");
        }
    }

    public void verificarUmNumeroMaiorQue10() {
        // FAÇA UM PROGRAMA QUE
        // 1-LEIA 2 NÚMEROS INTEIROS E
        // 2-IMPRIMA NA TELA SE PELO MENOS UM DELES FOR MAIOR QUE 10
        System.out.println("Digite dois número:");
        System.out.print("Digite o primeiro número: ");
        int numero01 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o segundo número: ");
        int numero02 = scanner.nextInt();

        if (numero01 > 10 || numero02 > 10) {
            if (numero01 > 10) {
                System.out.println("O número " + numero01 + " é maior que 10");
            }
            if (numero02 > 10) {
                System.out.println("O número " + numero02 + " é maior que 10");
            }
        } else {
            System.out.println("Os dois número não são maiores que 10");
        }
    }

    public void verificarDoisNumerosMaioresQue10() {
        System.out.println("Insira dois número no programa");

        System.out.print("Primeiro número: ");
        int numero01 = scanner.nextInt();

        System.out.print("Segundo número: ");
        int numero02 = scanner.nextInt();

        if (numero01 > 10 && numero02 > 10) {
            System.out.println("Os números " + numero01 + " e " + numero02 + " são maiores que 10");
        } else {
            if (numero01 < 10) {
                System.out.println("O número " + numero01 + " é menor que 10");
            } else {
                System.out.println("O número " + numero02 + " é menor que 10");
            }
        }
    }
}
