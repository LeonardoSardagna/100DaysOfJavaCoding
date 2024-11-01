package com.praticando.java.Day07.exercicioLinkedHashSet;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//TreeSet
public class ProdutosOrdenados {
    //Crie um programa que permita adicionar produtos a uma lista
    //e exiba a lista em ordem alfabética.
    //organizar os produtos automaticamente conforme são inseridos.
    //O programa deve permitir adicionar, remover e exibir todos os produtos em ordem alfabética.
    Scanner scanner = new Scanner(System.in);

    public void ListaProdutos() {
        Set<String> listaProdutos = new TreeSet<>();
        int i = 0;

        do {
            System.out.println();
            System.out.println("           Minha Sacola                ");
            System.out.print("|-------------------------------------|\n");
            System.out.print("|               Opções                |\n");
            System.out.print("|-------------------------------------|\n");
            System.out.print("| Opção 1 - Cadastrar Produto         |\n");
            System.out.print("| Opção 2 - Verificar Produto         |\n");
            System.out.print("| Opção 3 - Exibir Lista Completa     |\n");
            System.out.print("| Opção 4 - Excluir Produto           |\n");
            System.out.print("| Opção 5 - Sair                      |\n");
            System.out.print("|-------------------------------------|\n");
            System.out.print("Digite uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    if (listaProdutos.add(nomeProduto.toUpperCase())) {
                        System.out.println("Produto adicionado com sucesso!");
                    } else {
                        System.out.println("Produto já está na sua sacola!");
                    }
                    break;
                case 2:
                    System.out.print("Qual produto você deseja buscar na sacola?");
                    String nomeBusca = scanner.nextLine();
                    if (listaProdutos.contains(nomeBusca.toUpperCase())) {
                        System.out.println("Produto está na sua sacola");
                    } else {
                        System.out.println("Produto não esta na sua sacola");
                    }
                    break;
                case 3:
                    System.out.println("Minha Sacola:");
                    if (!listaProdutos.isEmpty()) {
                        for (String lista : listaProdutos) {
                            System.out.println("Produto: " + lista);
                        }
                    } else {
                        System.out.println("Lista de produtos vazia");
                    }
                    break;
                case 4:
                    System.out.println("Qual produto você deseja excluir?");
                    String nomeExcluir = scanner.nextLine();
                    if (listaProdutos.contains(nomeExcluir.toUpperCase())) {
                        listaProdutos.remove(nomeExcluir.toUpperCase());
                        System.out.println("Produto excluído com sucesso");
                    } else {
                        System.out.println("Esse produto não esta presente na sua sacola para excluir");
                    }
                    break;
                case 5:
                    System.out.println("Volte sempre!");
                    i = 1;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (i < 1);

    }
}
