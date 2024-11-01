package com.praticando.java.Day09.usoDeFuncao.exercicio;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("12345", 2000, Status.ESPECIAL, 20000);
        System.out.println(contaCorrente);
        contaCorrente.depositarDinheiro(2000);
        System.out.println(contaCorrente);
        contaCorrente.realizarSaque(4100);
        System.out.println(contaCorrente);
        contaCorrente.realizarSaque(4000);
        contaCorrente.verificacaoDeConta();
        System.out.println(contaCorrente);
    }
}
