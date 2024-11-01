package com.praticando.java.Day07.exercicioTreeSet;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

//LinkedHashSet
public class OrdemVisitantes {
    //Crie um programa que registre os visitantes em um museu,
    // O programa deve permitir registrar, exibir a lista de visitantes
    // na ordem de chegada e verificar se um visitante específico já passou pelo museu.
    Scanner scanner = new Scanner(System.in);

    public void registroVisitantes() {
        int i = 0;
        Set<String> listaParticipante = new LinkedHashSet<>();
        while (i < 1) {
            System.out.println();
            System.out.println("                Museu Sardagna                ");
            System.out.print("|--------------------------------------------|\n");
            System.out.print("|                    Opções                  |\n");
            System.out.print("|--------------------------------------------|\n");
            System.out.print("| Opção 1 - Cadastrar Visitante              |\n");
            System.out.print("| Opção 2 - Verificar Participante           |\n");
            System.out.print("| Opção 3 - Exibir Lista De Participantes    |\n");
            System.out.print("| Opção 4 - Sair                             |\n");
            System.out.print("|--------------------------------------------|\n");
            System.out.print("Digite uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Cadastro de Participante");
                    System.out.print("Digite o nome do participante: ");
                    String addNome = scanner.nextLine();
                    if (listaParticipante.add(addNome.toUpperCase())) {
                        System.out.println("Participante adicionado com sucesso");
                    } else {
                        System.out.println("Esse participante já esta na lista");
                    }
                    break;
                case 2:
                    System.out.print("Qual o participante deseja buscar: ");
                    String nomeBusca = scanner.nextLine();
                    if (listaParticipante.contains(nomeBusca.toUpperCase())) {
                        System.out.println("O usuário já esta na lista");
                    } else {
                        System.out.println("Participante não encontrado na lista");
                    }
                    break;
                case 3:
                    System.out.println("Lista completa em ordem de chegada: ");
                    if (listaParticipante.isEmpty()) {
                        System.out.println("A lista está vazia");
                    } else {
                        for (String lista : listaParticipante) {
                            System.out.println("Nome: " + lista);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Volte sempre. Obrigado");
                    i = 1;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
