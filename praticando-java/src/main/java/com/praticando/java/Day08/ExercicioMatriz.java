package com.praticando.java.Day08;

import java.util.Random;
import java.util.Scanner;

public class ExercicioMatriz {
    //Matrizes
    static Scanner scanner = new Scanner(System.in);

    public void usoDeMatrizes() {
        int[][] matriz = new int[3][3];
        adicionarValorNaMatrizDeInteiros(matriz);
        percorrerValorNaMatrizDeInteiros(matriz);
    }

    public void valoresAleatorio() {
        //Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-
        //9. Após isso determine o maior número da matriz e a sua posição
        //(linha, coluna).
        int[][] matriz = new int[4][4];

        Random gerador = new Random();

        adicionarValorNaMatrizDeInteiros(matriz);
        percorrerValorNaMatrizDeInteiros(matriz);

        int maior = 0;
        int linha = 0;
        int coluna = 0;

        //verificando o maior elemento da matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        System.out.println("Maior número: " + maior);
        System.out.print("[" + linha + "]" + " [" + coluna + "]");
    }

    public void maiorMenorLinhaEColuna() {
        //Gere e imprima uma matriz M 10x10 com valores aleatórios entre
        //0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
        //qual é o maior e o menor valor da coluna 7.
        int[][] matriz = new int[10][10];
        Random random = new Random();

        adicionarValorNaMatrizDeInteiros(matriz);
        percorrerValorNaMatrizDeInteiros(matriz);

        //verificar qual é o maior e menor valor da linha 5 e qual o maior e menor valor da coluna 7
        int linha5 = 5;
        int maiorL5 = 0;
        int menorL5 = 101;
        for (int i = 0; i < matriz[linha5].length; i++) {
            if (matriz[linha5][i] > maiorL5) {
                maiorL5 = matriz[linha5][i];
            }
            if (matriz[linha5][i] < menorL5) {
                menorL5 = matriz[linha5].length;
            }
        }
        System.out.println("O maior valor da linha 5: " + maiorL5);
        System.out.println("O menor valor da linha 5: " + menorL5);

        int maiorC7 = 0;
        int menorC7 = 101;
        int coluna7 = 7;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i][coluna7]; j++) {
                if (matriz[i][coluna7] > maiorC7) {
                    maiorC7 = matriz[i][coluna7];
                }
                if (matriz[i][coluna7] < menorC7) {
                    menorC7 = matriz[i][coluna7];
                }
            }
        }
        System.out.println("O maior valor da coluna 7: " + maiorC7);
        System.out.println("O menor valor da coluna 7: " + menorC7);
    }

    public void matrizPar() {
        //Capture do teclado valores para preenchimento de uma matriz M
        //3x3. Após a captura imprima a matriz criada e encontre a
        //quantidade de números pares, a quantidade de números ímpares.
        int[][] matriz = new int[3][3];

        adicionarValorNaMatrizDeInteiros(matriz);
        percorrerValorNaMatrizDeInteiros(matriz);

        //verificando a quantidade de números pares e ímpares
        int contadorDePares = 0;
        int contadorDeImpares = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    contadorDePares++;
                } else {
                    contadorDeImpares++;
                }
            }
        }

        System.out.println("A matriz possuí " + contadorDePares + " números pares");
        System.out.println("A matriz possuí " + contadorDeImpares + " numeros ímpares");
    }

    public void compromisso() {
        //Faça um programa para armazenar em uma matriz os
        //compromissos de uma agenda pessoal. Cada dia do mês deve
        //conter 24 horas, onde para cada uma destas 24 horas podemos
        //associar um tarefa específica (compromisso agendado). O
        //programa deve ter um menu onde o usuário indica o dia do mês
        //que deseja alterar e a hora, entrando em seguida com o
        //compromisso, ou então, o usuário pode também consultar a
        //agenda, fornecendo o dia e a hora para obter o
        //compromisso armazenado.

        String[][] matriz = new String[31][24];

        Boolean contador = false;

        while (!contador) {
            System.out.print("|-------------------------------------|\n");
            System.out.print("|            Minha agenda             |\n");
            System.out.print("|-------------------------------------|\n");
            System.out.print("| Opção 1 - Cadastrar Compromisso     |\n");
            System.out.print("| Opção 2 - Verificar Compromissos    |\n");
            System.out.print("| Opção 3 - Sair                      |\n");
            System.out.print("|-------------------------------------|\n");
            System.out.print("Digite uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    boolean diaValido = false;
                    int dia = 0;

                    while (!diaValido) {
                        System.out.print("Coloque o dia do mês: ");
                        dia = scanner.nextInt();

                        if (dia > 0 && dia < 31) {
                            diaValido = true;
                        } else {
                            System.out.println("Dia inválido!");
                        }
                    }

                    boolean horaValida = false;
                    int hora = 0;

                    while (!horaValida) {
                        System.out.print("Coloque a hora: ");
                        hora = scanner.nextInt();
                        if (hora >= 0 && hora <= 23) {
                            horaValida = true;
                        } else {
                            System.out.println("Hora inválido!");
                        }
                    }

                    dia--;
                    scanner.nextLine();
                    System.out.print("Digite o seu compromisso: ");
                    matriz[dia][hora] = scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Seu compromisso");
                    System.out.print("Dia do mês(1 a 31): ");
                    int diaEscolhido = scanner.nextInt();
                    System.out.print("Hora do dia(0 a 23): ");
                    int horaEscolhida = scanner.nextInt();

                    validarDiaeHora(diaEscolhido, horaEscolhida, matriz);

                    break;
                case 3:
                    System.out.println("Obridado! Encerrando...");
                    contador = true;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }

    static void validarDiaeHora(int diaEscolhido, int horaEscolhida, String[][] matriz) {
        if (diaEscolhido >= 1 && diaEscolhido <= 31 && horaEscolhida >= 0 && horaEscolhida <= 23) {
            diaEscolhido--;
            String compromisso = matriz[diaEscolhido][horaEscolhida];

            if (compromisso != null) {
                System.out.println("Compromisso: " + compromisso);

            } else {
                System.out.println("Nenhum compromisso encontrado");
            }
        } else {
            System.out.println("Dia ou hora inválida");
        }
    }

    static void adicionarValorNaMatrizDeInteiros(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor da posição [" + i + "]" + " [" + j + "]: ");
                int valor = scanner.nextInt();
                matriz[i][j] = valor;
            }
            System.out.println();
        }
    }

    static void percorrerValorNaMatrizDeInteiros(int[][] matriz) {
        System.out.println("Matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + i + "]" + " [" + j + "]: " + matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void percorrerValorNaMatrizDeStrings(String[][] matriz) {
        System.out.println("Matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + i + "]" + " [" + j + "]: " + matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}