package com.praticando.java.Day09.usoDeFuncao;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioFuncao {
    Scanner scanner = new Scanner(System.in);

    //uso de funções
    public void verificacaoDeNumeroPrimo() {
        //Crie uma função chamada isPrimo que receba um número inteiro e retorne
        //true se o número for primo e false caso contrário. Depois, no main,
        //peça ao usuário para digitar um número e exiba se ele é primo ou não.
        System.out.print("Digite um número para verificar se ele é primo ou não: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        Boolean verificador = isPrimo(numero);
        if (verificador) {
            System.out.println(numero + " é um número primo");
        } else {
            System.out.println(numero + " não é um número primo");
        }
    }

    static boolean isPrimo(int numero) {
        return numero % 2 == 0;
    }

    public void mediaNotasSituacao() {
        //Crie uma função chamada calcularMedia que receba um array de notas (double)
        //e retorne a média. Depois, crie uma função chamada verificarSituacao que
        //receba a média e retorne uma string "Aprovado", "Recuperação" ou "Reprovado"
        //de acordo com a média (>= 7: Aprovado, >= 5: Recuperação, < 5: Reprovado).
        //No main, peça ao usuário para inserir notas, calcule a média e exiba a situação.
        ArrayList<Double> listaDeNotas = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota da prova " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("A nota tem que ser maior que zero e menor que 10.");
                System.out.println("Insira novamente");
            } else {
                listaDeNotas.add(nota);
            }
        }
        System.out.println("Notas cadastradas com sucesso!!");
        double media = calcularMedia(listaDeNotas);
        verificarSituacao(media);
    }

    static double calcularMedia(ArrayList<Double> listaDeNotas) {
        double soma = 0;
        for (int i = 0; i < listaDeNotas.size(); i++) {
            soma += listaDeNotas.get(i);
        }
        double media = soma / listaDeNotas.size();

        return media;
    }

    static void verificarSituacao(Double media) {
        if (media >= 7) {
            System.out.println("Aluno aprovado");
        } else if (media == 6) {
            System.out.println("Aluno em recuperação");
        } else {
            System.out.println("Aluno Reprovado");
        }
    }

    public void ordenacaoDeStrings() {
        //Crie uma função chamada ordenarNomes que receba um array de nomes (strings)
        //e retorne um novo array com os nomes em ordem alfabética. No main, peça
        //ao usuário para inserir os nomes, ordene-os com a função e exiba os
        //nomes ordenados.
        ArrayList<String> listaDePalavras = new ArrayList<>();
        while (true) {
            System.out.println("Insira palavras aleatórias para ordenar em ordem alfabética ou sair para encerrar o programa:");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            } else {
                listaDePalavras.add(nome);
            }
        }
        System.out.println("Ordenação da lista");
        Set<String> ordenacao = ordenarNomes(listaDePalavras);
        for (String palavra : ordenacao) {
            System.out.println(palavra);
        }
    }

    static Set<String> ordenarNomes(ArrayList<String> nomes) {
        Set<String> listaOrdenada = new TreeSet<>();
        listaOrdenada.addAll(nomes);
        return listaOrdenada;
    }

    public void calculadoraFatorial() {
        //Crie uma função chamada calcularFatorial que receba um número inteiro
        //n e retorne o fatorial de n. No main, peça ao usuário para inserir
        //um número e exiba o fatorial calculado.

        System.out.println("Digite um número para exibir o fatorial");
        int numero = scanner.nextInt();
        calculaFatorial(numero);
    }

    static void calculaFatorial(int numero) {
        if (numero < 0) {
            System.out.println("Não existe fatoração para numeros negativos");
        }

        StringBuilder fatoracao = new StringBuilder();
        int resultadoFatorial = 1;
        for (int i = numero; i > 1; i--) {
            resultadoFatorial *= i;
            fatoracao.append(i);

            if (i > 1) {
                fatoracao.append(" X ");
            }
        }
        System.out.println(numero + "! = " + fatoracao.toString() + " = " + resultadoFatorial);
    }
}
