package com.praticando.java.Day07;

import java.util.*;

public class ExercicioHashSet {
    //Uso de Map
    Scanner scanner = new Scanner(System.in);

    public void adicionarFuncionarios() {
        //Crie um programa que adicione nomes de funcionários
        //e seus respectivos IDs ao HashMap até que o usuário digite "sair".
        //Depois, imprima todos os funcionários cadastrados.
        HashMap<String, Integer> listaDeFuncionarios = new HashMap<>();

        //adiciona funcionário até usuário digitar sair
        while (true) {
            System.out.print("Digite o nóme do funcioário ou 'sair' para encessar: ");
            String nome = scanner.nextLine();
            //se o usuário digitar sair da break no programa
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }
            System.out.print("Digite o id do Funcionário: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            //adiciona o funcionário
            listaDeFuncionarios.put(nome, id);
        }

        //imprime a lista
        for (String key : listaDeFuncionarios.keySet()) {
            System.out.println("Nome: " + key + " Id: " + listaDeFuncionarios.get(key));
        }
    }

    public void verificacaoFuncionario() {
        //Crie um programa que armazene nomes de funcionários e seus respectivos IDs.
        //O programa deve permitir que o usuário digite um nome e retorne o
        //ID correspondente. Se o nome não existir, deve informar que o funcionário
        // não foi encontrado.

        HashMap<String, Integer> listaFuncionario = new HashMap<>();

        //adicona os funcionários na lista
        listaFuncionario.put("Leonardo Sardagna", 12345);
        listaFuncionario.put("Valmir Sardagna", 15978);
        listaFuncionario.put("Mari Neide Shaffer Sardagna", 357894);
        listaFuncionario.put("Brian", 230904);
        listaFuncionario.put("Lucas", 7898562);

        listaFuncionario.remove("Lucas");

        while (true) {
            System.out.print("Busque por um funcionário: ");
            String nomeBuscado = scanner.nextLine();

            if (listaFuncionario.containsKey(nomeBuscado)) {
                System.out.println("Funcionário encontrado");
                System.out.println(listaFuncionario.get(nomeBuscado));
                break;
            } else {
                System.out.println("Funcionário não encontrado. tente novamente");
            }
        }
    }

    //Sets e HashSet LinkedHashSet TreeSet

    //exercício hashset
    public void removerDuplicatas() {
        //Crie um programa que leia uma lista de números inteiros,
        //armazene-os em um HashSet para remover duplicatas e,
        //em seguida, exiba os números únicos.
        ArrayList<Integer> numerosArrayList = new ArrayList<>();
        Set<Integer> numerosHashSetList = new HashSet<>();

        numerosArrayList.add(1);
        numerosArrayList.add(1);
        numerosArrayList.add(2);
        numerosArrayList.add(3);
        numerosArrayList.add(4);
        numerosArrayList.add(4);
        numerosArrayList.add(5);
        numerosArrayList.add(6);
        numerosArrayList.add(5);
        numerosArrayList.add(7);
        numerosArrayList.add(8);

        System.out.println("Lista de números ArrayList: ");
        for (Integer numeros : numerosArrayList) {
            System.out.println(numeros);
        }

        numerosHashSetList.addAll(numerosArrayList);

        System.out.println("Lista de números HashSet: ");

        numerosHashSetList.forEach(System.out::println);

    }

    public void verificarElementos() {
        //Crie um programa que armazene uma lista de nomes em um HashSet
        //e permita que o usuário verifique se um nome está presente no conjunto.
        Set<String> nomes = new HashSet<>();
        nomes.add("Leonardo");
        nomes.add("Valmir");
        nomes.add("Mari");
        nomes.add("Brian");
        nomes.add("Kaue");
        nomes.add("Robert");

        while (true) {
            System.out.print("Qual nome deseja buscar: ");
            String nomeBuscado = scanner.nextLine();

            if (nomes.contains(nomeBuscado)) {
                System.out.println("Usuário encontrado");
                nomes.forEach(System.out::println);
                break;
            } else {
                System.out.println("Usuário não encontrado");
            }
        }
    }
}
