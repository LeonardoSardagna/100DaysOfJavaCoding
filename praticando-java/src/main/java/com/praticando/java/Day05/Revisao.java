package com.praticando.java.Day05;

import com.praticando.java.Day05.exercicio01.Produto;
import com.praticando.java.Day05.exercicio02.Usuario;
import com.praticando.java.Day05.exercicioFinal.Livros;
import com.praticando.java.Day05.exercicioFinal.StatusLivro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Revisao {
    //Exercícios de revisão

    Scanner scanner = new Scanner(System.in);

    //Exercício 01.01 - Calcula o preço com desconto para cada produto e imprime o resultado
    public void calculaDesconto() {
        //Instanciando produtos
        Produto produto01 = new Produto("Banana", 5.0, 5);
        Produto produto02 = new Produto("Maça", 7.0, 4);
        Produto produto03 = new Produto("Refrigerante", 10.0, 7);
        Produto produto04 = new Produto("Hipercalórico", 99.0, 20);
        Produto produto05 = new Produto("Cerveja", 80.0, 2);

        //Criando lista de produtos
        ArrayList<Produto> listaDeProduto = new ArrayList<>();

        //Adicionando produtos na lista
        listaDeProduto.add(produto01);
        listaDeProduto.add(produto02);
        listaDeProduto.add(produto03);
        listaDeProduto.add(produto04);
        listaDeProduto.add(produto05);

        //percorrendo a lista e adicionando os descontos
        for (Produto produto : listaDeProduto) {
            produto.calculaPrecoComDesconto(produto);
        }

        listaDeProduto.forEach(System.out::println);
    }

    //Exercício 01.02 - Solicita dados do usuário para cadastro e retorna um objeto Usuario.
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

    //Exercício 02.01 - Calcula o montante final aplicando juros compostos.
    public void calculoDeJurosCompostos() {
        System.out.print("insira o valor inicial: R$");
        double valorInicial = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Insira a taxa de juros anual: ");
        double taxaDeJuros = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Insira o período de tempo em anos: ");
        int anos = scanner.nextInt();
        scanner.nextLine();

        double montante = valorInicial * Math.pow((1 + taxaDeJuros / 100), anos);

        System.out.println("O montante final é: " + String.format("%.2f", montante));
    }

    //Exercício 02.02 - Manipula uma lista de números inseridos pelo usuário.
    public void manipulacaoDeListas() {
        System.out.print("Insira uma sequência de valores separados por espaços: ");
        String valores = scanner.nextLine();

        //Converte os valores em um lista de inteiros
        String[] valoresConvertidos = valores.split(" ");
        List<Integer> listaDeValores = new ArrayList<>();

        //Utilizo o for para armazenar os dados na lista, fazendo o parse da string para o integer
        for (String numeros : valoresConvertidos) {
            listaDeValores.add(Integer.parseInt(numeros));
        }
    }

    //Exercício 03.01 - Valida a senha do usuário em até três tentativas para liberar o acesso.
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

    //Exercício 03.02 - Avalia e aprova crédito baseado na idade e renda do usuário.
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
            System.out.println("Idade mínima 21 anos. Sua idade: " + usuario.getIdade());
        }
    }

    //Exercício 04.01 - Calcula o fatorial de um número fornecido pelo usuário.
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

    //Exercício 04.02 - Calcula e exibe a média das temperaturas da semana e os dias com temperaturas acima da média.
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

        //Zero o contador novamente
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

    //Projeto Final - Sistema de Livraria para cadastro, busca e controle de disponibilidade de livros.
    public void livraria() {
        int i = 0;
        ArrayList<Livros> livrosArrayList = new ArrayList<>();
        Livros livro01 = new Livros("48 leis do poder", "Leonardo", 2024, StatusLivro.disponivel);
        Livros livro02 = new Livros("Nada pode me ferir", "Valmir", 2024, StatusLivro.disponivel);
        Livros livro03 = new Livros("Nunca é hora de parar", "Mari", 2024, StatusLivro.disponivel);
        Livros livro04 = new Livros("Poder do hábito", "Brian", 2024, StatusLivro.emprestado);

        livrosArrayList.add(livro01);
        livrosArrayList.add(livro02);
        livrosArrayList.add(livro03);
        livrosArrayList.add(livro04);
        do {
            // Mostra o menu de opções ao usuário
            System.out.println("Bem vindo a livraria nacional Sardagna");
            System.out.print("|-------------------------------------|\n");
            System.out.print("|      Livraria Nacional Sardagna     |\n");
            System.out.print("|-------------------------------------|\n");
            System.out.print("| Opção 1 - Cadastrar Livro           |\n");
            System.out.print("| Opção 2 - Buscar Livro              |\n");
            System.out.print("| Opção 3 - Devolver Livro            |\n");
            System.out.print("| Opção 4 - Exibir livros disponíveis |\n");
            System.out.print("| Opção 5 - Exibir todos os livros    |\n");
            System.out.print("| Opção 6 - Sair                      |\n");
            System.out.print("|-------------------------------------|\n");
            System.out.println("Digite uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    livrosArrayList.add(cadastroLivro(livrosArrayList));
                    break;
                case 2:
                    buscarLivro(livrosArrayList);
                    break;
                case 3:
                    mudarDisponibilidadeDoLivro(livrosArrayList);
                    break;
                case 4:
                    exibirLivrosDisponiveis(livrosArrayList);
                    break;
                case 5:
                    exibirTodosOsLivros(livrosArrayList);
                    break;
                case 6:
                    System.out.println("Volte sempre. Saindo...");
                    i = 1;
                    break;
            }
        } while (i < 1);
    }

    //Método para realizar o cadastro do livro
    public Livros cadastroLivro(ArrayList<Livros> livrosArrayList) {
        System.out.println("Insira um livro no nosso banco de dados: ");

        System.out.print("Nome do livro: ");
        String nome = scanner.nextLine();

        System.out.print("Autor: ");
        String autor = scanner.nextLine();

        System.out.print("Ano da publicação: ");
        int ano = scanner.nextInt();
        scanner.nextLine();

        var verificarLivro = livrosArrayList.stream().filter(livros -> (
                livros.getTitulo().equalsIgnoreCase(nome)
        )).findAny();

        if (verificarLivro.isEmpty()) {
            Livros livros = new Livros(nome, autor, ano, StatusLivro.disponivel);
            System.out.println("Livro cadastrado com sucesso!");
            return livros;
        } else {
            System.out.println("Este livro já está cadastrado na nossa biblioteca");
        }
        return null;
    }

    public void buscarLivro(ArrayList<Livros> livrosArrayList) {
        System.out.println("Gostaria de buscar um livro? Sim/Não:");
        String escolha = scanner.nextLine();

        switch (escolha) {
            case "Sim":
                System.out.println("Busque o livro pelo título: ");
                String buscaNome = scanner.nextLine();

                for (int i = 0; i < livrosArrayList.size(); i++) {

                    if (livrosArrayList.get(i).getTitulo().equalsIgnoreCase(buscaNome)) {

                        if (livrosArrayList.get(i).getStatusLivroEnum() != StatusLivro.emprestado) {
                            System.out.println("Gostaria de pegar emprestado esse livro? Sim/Não");
                            String resposta = scanner.nextLine();

                            switch (resposta) {
                                case "Sim":
                                    livrosArrayList.get(i).setStatusLivroEnum(StatusLivro.emprestado);
                                    System.out.println("Livro " + livrosArrayList.get(i).getStatusLivroEnum() + " com sucesso");
                                    break;
                                case "Não":
                                    System.out.println("Volte sempre!");
                                    break;
                            }
                        } else {
                            System.out.println("Sinto muito, mas o livro está " + livrosArrayList.get(i).getStatusLivroEnum());
                        }
                    }
                }
                break;
            case "Não":
                System.out.println("Volte sempre!");
                break;
        }
    }

    public void mudarDisponibilidadeDoLivro(ArrayList<Livros> livrosArrayList) {
        System.out.println("Qual livro gostaria de deixar disponível?");
        String livro = scanner.nextLine();

        livrosArrayList.stream().filter(livros -> (
                livros.getTitulo().equalsIgnoreCase(livro)
        )).forEach(livros -> {
            livros.setStatusLivroEnum(StatusLivro.disponivel);
        });

        System.out.println("Disponibilidade do livro alterada com sucesso");
    }

    public void exibirLivrosDisponiveis(ArrayList<Livros> livrosArrayList) {
        if (!livrosArrayList.isEmpty()) {
            System.out.println("Esses são os livros disponíveis!");
            livrosArrayList.stream().filter(livros -> (
                    livros.getStatusLivroEnum() == StatusLivro.disponivel
            )).forEach(System.out::println);
        } else {
            System.out.println("Sem livros no momento");
        }
    }

    public void exibirTodosOsLivros(ArrayList<Livros> livrosArrayList) {
        if (!livrosArrayList.isEmpty()) {
            System.out.println("Esses são todos os livros disponíveis na nossa biblioteca:");
            livrosArrayList.stream().sorted(Comparator.comparing(Livros::getTitulo))
                    .forEach(System.out::println);
        } else {
            System.out.println("Sem livros no momento");
        }
    }
}
