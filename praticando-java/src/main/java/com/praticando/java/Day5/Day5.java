package com.praticando.java.Day5;

import com.praticando.java.Day5.exercicio01.Produto;
import com.praticando.java.Day5.exercicio02.Usuario;
import com.praticando.java.Day5.exercicioFinal.Livros;
import com.praticando.java.Day5.exercicioFinal.StatusLivro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day5 {
    //Exercícios de revisão
    Scanner scanner = new Scanner(System.in);

    //exercício 01.01
    public void calculaDesconto() {
        //instanciando produto
        Produto produto01 = new Produto("Banana", 5.0, 5);
        Produto produto02 = new Produto("Maça", 7.0, 4);
        Produto produto03 = new Produto("Refrigerante", 10.0, 7);
        Produto produto04 = new Produto("Hipercalórico", 99.0, 20);
        Produto produto05 = new Produto("Cerveja", 80.0, 2);

        //criando uma lista de produtos
        ArrayList<Produto> listaDeProduto = new ArrayList<>();

        //adicionando em uma lista
        listaDeProduto.add(produto01);
        listaDeProduto.add(produto02);
        listaDeProduto.add(produto03);
        listaDeProduto.add(produto04);
        listaDeProduto.add(produto05);

        //percorrendo a lista e adicionando os descontos
        for (Produto produto : listaDeProduto) {
            produto.calculaPrecoComDesconto(produto);
        }

        //precorrendo a lista para verificar os descontos
        listaDeProduto.forEach(System.out::println);

    }

    //exercício 01.02
    public Usuario validacaoDeCadastro() {
        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite seu email: ");
        String email = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        Usuario usuario = new Usuario(nomeCompleto, idade, email, senha);
        System.out.println(usuario);

        return usuario;
    }

    //exercício 02.01
    public void calculoDeJurosCompostos() {
        System.out.print("inica o valor inicial: R$");
        double valorInicial = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Insira a taxa de juros anual: ");
        double taxaDeJuros = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Insira o período de tempo em anos: ");
        int anos = scanner.nextInt();
        scanner.nextLine();

        double montante = valorInicial * Math.pow((1 + taxaDeJuros / 100), anos);

        System.out.println("O montante final é: " + String.format("%.2f", montante));
    }

    //exercício 02.02
    public void manipulacaoDeListas() {
        //pego a sequência de números do usuário com espaço
        System.out.print("Insira uma sequência de valores separados por espaços: ");
        String valores = scanner.nextLine();

        //retiro o espaço do usuário
        String[] valoresConvertidos = valores.split(" ");

        //crio a lista para armazenar os números
        List<Integer> listaDeValores = new ArrayList<>();

        //faço o for para armazenar na lista criada acima fazendo o parse da string para o integer
        for (String numeros : valoresConvertidos) {
            listaDeValores.add(Integer.parseInt(numeros));
        }
    }

    //ecercício 03.01
    public void validacaoDeLogin() {
        Usuario usuario01 = validacaoDeCadastro();

        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();
        int contador = 0;

        while (contador < 3) {
            if (senha.equals(usuario01.getSenha())) {
                System.out.println("Senha correta. Acesso liberado");
                System.out.println(usuario01);
                break;
            } else {
                contador++;
                if (contador == 3) {
                    System.out.println("Sua conta foi bloqueada");
                } else {
                    System.out.println("Senha incorreta. Você possui " + (3 - contador) + " tentativas. tente novamente");
                    System.out.print("Senha: ");
                    senha = scanner.nextLine();
                }
            }
        }
    }

    //ecercício 03.02
    public void sistemaDeCredito() {

        Usuario usuario = validacaoDeCadastro();

        System.out.print("Qual a sua renda mensal?");
        double rendaMensal = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Valor do crédito que deseja: ");
        double credito = scanner.nextDouble();
        scanner.nextLine();

        if (usuario.getIdade() >= 21) {

            if (credito > rendaMensal * 5) {
                System.out.println("Crédito negado");
            } else {
                System.out.println("Crédito aprovado");
            }
        } else {
            System.out.println("Idade miníma 21 anos. Você possui " + usuario.getIdade());
        }
    }

    //exercício 04.01
    public void calculoFatorial() {
        System.out.print("Digite um número para saber seu fatorial: ");
        int fatorial = scanner.nextInt();
        int resultadoFatorial = 1;

        while (fatorial < 0) {
            System.out.println("Não é possível calcular o fatorial de números negativos. Insira um número maior ou igual a 0 para fazer o cálculo de sua fatoração");
            System.out.println("Digite novamente: ");
            fatorial = scanner.nextInt();
        }

        StringBuilder fatoracao = new StringBuilder();

        for (int i = fatorial; i > 1; i--) {
            resultadoFatorial *= i;
            fatoracao.append(i);
            if (i > 1) {
                fatoracao.append(" X ");
            }
        }
        System.out.println(fatorial + "! = " + fatoracao.toString() + " = " + resultadoFatorial);
    }

    //exercício 04.02
    public void controleDeTemperatura() {
        //criação da lista de temperaturas
        ArrayList<Double> listDeTemperatura = new ArrayList<>();

        System.out.println("Digite a temperatura dos dias da semana");

        //for para percorrer os 7 dias da semana
        for (int i = 1; i <= 7; i++) {
            //switch para cada dia
            switch (i) {
                case 1:
                    System.out.print("Domingo: ");
                    //adicionando a temperatura na lista
                    listDeTemperatura.add(scanner.nextDouble());
                    break;
                case 2:
                    System.out.print("Segunda: ");
                    listDeTemperatura.add(scanner.nextDouble());
                    break;
                case 3:
                    System.out.print("Terça: ");
                    listDeTemperatura.add(scanner.nextDouble());
                    break;
                case 4:
                    System.out.print("Quarta: ");
                    listDeTemperatura.add(scanner.nextDouble());
                    break;
                case 5:
                    System.out.print("Quinta: ");
                    listDeTemperatura.add(scanner.nextDouble());
                    break;
                case 6:
                    System.out.print("Sexta: ");
                    listDeTemperatura.add(scanner.nextDouble());
                    break;
                case 7:
                    System.out.print("Sábado: ");
                    listDeTemperatura.add(scanner.nextDouble());
                    break;
            }
        }

        int contador = 0;
        double soma = 0;

        //while para fazer a soma das temperaturas
        while (contador < listDeTemperatura.size()) {
            soma += listDeTemperatura.get(contador);
            contador++;
        }

        //media das temperaturas
        double media = soma / listDeTemperatura.size();

        System.out.println("A soma das temperaturas foi de " + soma);

        System.out.println("A média das temperaturas foi de " + String.format("%.2f", media));

        contador = 0;
        System.out.println("Temperaturas acima da média: ");
        //while para verificar as temperaturas acima da média
        while (contador < listDeTemperatura.size()) {
            if (listDeTemperatura.get(contador) > media) {
                switch ((contador + 1)) {
                    case 1:
                        System.out.println("Domingo: " + listDeTemperatura.get(contador));
                        break;
                    case 2:
                        System.out.println("Segunda: " + listDeTemperatura.get(contador));
                        break;
                    case 3:
                        System.out.println("Terça: " + listDeTemperatura.get(contador));
                        break;
                    case 4:
                        System.out.println("Quarta: " + listDeTemperatura.get(contador));
                        break;
                    case 5:
                        System.out.println("Quinta: " + listDeTemperatura.get(contador));
                        break;
                    case 6:
                        System.out.println("Sexta: " + listDeTemperatura.get(contador));
                        break;
                    case 7:
                        System.out.println("Sábado: " + listDeTemperatura.get(contador));
                        break;
                }
            }
            contador++;
        }
    }

//    projeto final
//    public void livraria() {
//        ArrayList<Livros> livrosArrayList = new ArrayList<>();
//        System.out.println("Insira um livro no nosso banco de dados: ");
//
//        System.out.print("Nome do livro: ");
//        String nome = scanner.nextLine();
//
//        System.out.print("Autor: ");
//        String autor = scanner.nextLine();
//
//        System.out.print("Ano da publicação: ");
//        int ano = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.print("Escolha o status do livro: disponível, emprestado: ");
//        StatusLivro status = StatusLivro.valueOf(scanner.nextLine());
//
//        Livros livros = new Livros(nome, autor, ano, status);
//        System.out.println("Livro cadastrado com sucesso!");
//        livrosArrayList.add(livros);
//    }
}
