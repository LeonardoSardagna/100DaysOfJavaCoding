package com.praticando.java.Day04;

import java.util.Scanner;

public class ExercicioSwitch {
    //faça um programa que leia um número e imprima qual
    //dia da semana de acordo com o número lido usado
    Scanner scanner = new Scanner(System.in);

    //utilizando o switch
    public void marcarConsultaPorDia() {
        System.out.println("""
                 Escolha um dia da semana para marcar sua consulta: 
                 1- Domingo
                 2- Segunda-feira
                 3- Terça-feira
                 4- Quarta-feira
                 5- Quinta-feira
                 6- Sexta-feira
                 7- Sábado
                """);
        System.out.print("Opção: ");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Consulta marcada para domingo");
                break;
            case 2:
                System.out.println("Consulta marcada para segunda-feira");
                break;
            case 3:
                System.out.println("Consulta marcada para terça-feira");
                break;
            case 4:
                System.out.println("Consulta marcada para quarta-feira");
                break;
            case 5:
                System.out.println("Consulta marcada para quinta-feira");
                break;
            case 6:
                System.out.println("Consulta marcada para sexta feira");
                break;
            case 7:
                System.out.println("Consulta marcada no Sábado");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
