package com.praticando.java.Day04;

import java.util.Scanner;

public class ExercicioWhile {
    Scanner scanner = new Scanner(System.in);

    //utilizando o laço de repetição while
    public void imprimirNumerosAte10() {
        int i = 0;
        while (i <= 10) {
            //imprime o número
            System.out.println("Número: " + i);
            //aumenta o valor de "i" em 1 e 1
            i++;
        }
    }

    public void pedirEntrataIgual10() {
        int i = 0;
        while (i != 10) {
            System.out.println("Digite 10: ");
            i = scanner.nextInt();
        }
        System.out.println("Número: " + i);
        System.out.println("Fim");
    }

    public void pedirDoisNumerosMaioresQue10() {
        int a = 0;
        int b = 0;
        while (a <= 10 && b <= 10) {
            System.out.println("Digite o Primeiro número: ");
            a = scanner.nextInt();

            System.out.println("Digite o Segundo número: ");
            b = scanner.nextInt();
        }
        System.out.println("Número 1: " + a);
        System.out.println("Número 2: " + b);
        System.out.println("Fim");
    }

    public void pedirNumeroEntre1e6() {
        int a = 0;

        while (a < 1 || a > 6) {
            System.out.println("Digite um número entre 1-6: ");
            a = scanner.nextInt();
        }
        System.out.println("Número: " + a);
        System.out.println("Fim");
    }

    //utilizando o do while - a diferença é que o do while vai executar pelo menos uma vez o código
    public void imprimirNomeCondicional() {
        int i = 10;

        do {
            System.out.println("Leonardo");
        } while (i < 5);
    }

    public void somaDos10PrimeirosNumerosNaturais() {
        //faça um programa que imprima na tela a soma dos 10
        //primeiros números naturais
        int i = 0;
        int soma = 0;
        while (i < 10) {
            soma += i;
            i++;
        }
        System.out.println("Soma dos 10 números naturais: " + soma);
    }

    public void multiplica2NumerosAtepassarDe100() {
        //faça um programa que leia um número e multiplique
        //o resultado por 2 até o número passar de 100
        Scanner scanner1 = new Scanner(System.in);
        int i = -1;
        //validação da entrada
        while (i < 0 || i > 100) {
            System.out.println("Digite um número entre 1 a 100: ");
            i = scanner1.nextInt();
        }
        //multiplicação
        while (i < 100) {
            i = i * 2;
        }
        System.out.println("Multiplicação: " + i);
    }

    public void imprimirDoisNumeroMostrandoSeusInteiros() {
        //faça um programa que leia dois numeros e imprima
        //todos os números inteiros entre eles, sem contar eles

        System.out.print("Digite o primeiro número inteiro: ");
        int a = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o segundo número inteiro: ");
        int b = scanner.nextInt();
        scanner.nextLine();

        int i = 0;

        // se "a" for menor que "b", quer dizer que "a" é o número inferior
        if (a < b) {
            i = a + 1;// "i" recebe um número acima de "a"

            while (i < b) {
                System.out.println(i);
                i++;
            }
        } else {
            i = b + 1;

            while (i < a) {
                System.out.println(i);
                i++;
            }
        }
    }
}
