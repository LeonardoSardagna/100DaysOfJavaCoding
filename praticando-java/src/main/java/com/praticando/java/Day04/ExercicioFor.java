package com.praticando.java.Day04;

import java.util.Scanner;

public class ExercicioFor {
    Scanner scanner = new Scanner(System.in);

    //utilizando o loop for
    public void numerosDe10a20() {
        //faça um programa que imprima números de 10 a 20, de dois em dois

        for (int i = 10; i <= 20; i += 2) {
            System.out.println("Número: " + i);
        }
    }

    public void somaDe5Valores() {
        //faça um programa que leia 5 valores(usando o for)
        //e mostre a soma deles
        int soma = 0;
        //faça algo 5 vezes
        for (int i = 0; i < 5; i++) {
            System.out.print("Insira o " + (i + 1) + "° valor: ");
            soma += scanner.nextInt();
        }
        System.out.println("A soma total dos números inseridos foi de " + soma);
    }
}
