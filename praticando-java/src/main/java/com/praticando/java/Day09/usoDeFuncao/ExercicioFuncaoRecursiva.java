package com.praticando.java.Day09.usoDeFuncao;

import java.util.Scanner;

public class ExercicioFuncaoRecursiva {
    Scanner scanner = new Scanner(System.in);
    //funções recursivas

    //fatorial
    public void calculaFatorialRecursivo() {
        System.out.print("Digite um número para calcular seu fatorial: ");
        int num = scanner.nextInt();
        int fatorial = fatorial(num);
        System.out.println(fatorial);
    }

    static int fatorial(int num) {
        if (num == 0) {
            return 1;
        }

        if (num < 0) {
            throw new IllegalArgumentException("Não pode número negativo");
        }

        return num * fatorial(num - 1);
    }

    //fibonacci
    public void sequenciaFibonacci() {
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println(fibonacci(i));
        }
    }

    static int fibonacci(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Não pode ser negativo");
        }

        if (num < 2) {
            return 1;
        }

        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public void somaNumero() {
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        System.out.println(somatorio(numero));
    }

    static int somatorio(int num) {
        if (num == 0) {
            return 0;
        }
        return num += somatorio(num - 1);
    }
}
