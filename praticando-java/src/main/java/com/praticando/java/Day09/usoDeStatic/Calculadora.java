package com.praticando.java.Day09.usoDeStatic;

//Escreva uma classe Calculadora que tenha os seguintes métodos: somar,
//subtrair, multiplicar, dividir (dois números), elevar à potência n.
//Desenvolva um programa para testar essa classe.
public class Calculadora {
    public static int somar(int num01, int num02) {
        return num01 + num02;
    }

    public static int subtrair(int num01, int num02) {
        return num01 - num02;
    }

    public static int multiplicar(int num01, int num02) {
        return num01 * num02;
    }

    public static int dividir(int num01, int num02) {
        return num01 / num02;
    }

    public static int potencia(int num1, int num2) {
        int total = 1;
        for (int i = 1; i <= num2; i++) {
            total *= num1;
        }
        return total;
    }

    //Escreva um método para calcular factorial de um número na classe
    //Calculadora do exercício anterior.
    public static int fatorialRecursivo(int num) {
        if (num == 0) {
            return 1;
        }

        if (num < 0) {
            throw new IllegalArgumentException("Não pode número negativo");
        }

        return num * fatorialRecursivo(num - 1);
    }

    public static int fatorialNormal(int num) {
        if (num == 0) {
            return 1;
        }

        if (num < 0) {
            throw new IllegalArgumentException("Não pode negtivo");
        }

        int total = 1;
        for (int i = num; i > 1; i--) {
            total *= i;
        }

        return total;
    }
}
