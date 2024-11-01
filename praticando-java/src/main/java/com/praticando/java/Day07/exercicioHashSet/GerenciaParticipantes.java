package com.praticando.java.Day07.exercicioHashSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//projeto HashSet
public class GerenciaParticipantes {
    Scanner scanner = new Scanner(System.in);

    //Crie um programa que gerencie uma lista de participantes únicos para um sorteio.
    //O programa deve permitir adicionar o nome dos participantes,
    //verificar se um nome já está na lista
    //exibir todos os participantes cadastrados
    //(sem manter ordem de inserção ou alfabética, apenas garantindo que não existam duplicatas).
    public void sorteioParticipantes() {
        int i = 0;

        //adicionando o hashset
        Set<String> listaParticipantes = new HashSet<>();

        //enquando i(0) < 1 faça
        while (i < 1) {
            //menu
            System.out.println();
            System.out.println("Bem vindo a Lista De Participantes");
            System.out.print("|-------------------------------------|\n");
            System.out.print("|               Lista                 |\n");
            System.out.print("|-------------------------------------|\n");
            System.out.print("| Opção 1 - Cadastrar Participantes   |\n");
            System.out.print("| Opção 2 - Verificar Participante    |\n");
            System.out.print("| Opção 3 - Exibir Lista Completa     |\n");
            System.out.print("| Opção 4 - Sair                      |\n");
            System.out.print("|-------------------------------------|\n");
            System.out.println("Digite uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            //switch de opção
            switch (opcao) {
                case 1:
                    System.out.print("Insira o nome completo do participante: ");
                    String nome = scanner.nextLine();
                    if (listaParticipantes.add(nome.toUpperCase())) {
                        System.out.println("Participante adicionado com sucesso");
                    } else {
                        System.out.println("Participante já está na lista");
                    }
                    break;
                case 2:
                    System.out.print("Busque o participante: ");
                    String busca = scanner.nextLine();
                    if (listaParticipantes.contains(busca.toUpperCase())) {
                        System.out.println("Participante encontrado");
                    } else {
                        System.out.println("Prticipante não encontrado");
                    }
                    break;
                case 3:
                    System.out.println("Lista completa");
                    if (!listaParticipantes.isEmpty()) {
                        for (String lista : listaParticipantes) {
                            System.out.println("Nome: " + lista);
                        }
                    } else {
                        System.out.println("Não possui participantes na lista");
                    }
                    break;
                case 4:
                    System.out.println("Volte Sempre. Obrigado");
                    i = 1;
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }

        }
    }
}
