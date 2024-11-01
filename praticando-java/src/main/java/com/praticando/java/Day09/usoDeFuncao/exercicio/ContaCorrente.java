package com.praticando.java.Day09.usoDeFuncao.exercicio;

public class ContaCorrente {
    //Cria uma classe para representar uma conta corrente que possui um
    //número, um saldo, um status que informa se ela é especial ou não, um
    //limite. Desenvolva métodos para realizar saque (verificando se o cliente
    //pode realizar saques), despositar dinheiro, consultar saldo e verificar se o
    //cliente está usando cheque especial ou não. Desenvolva um programa
    //para testar essa classe.

    private String numeroConta;
    private double saldo;
    private Status status;
    private int limite;

    public ContaCorrente(String numeroConta, double saldo, Status status, int limite) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.status = status;
        this.limite = limite;
    }

    public ContaCorrente() {
    }

    public void realizarSaque(double valorDoSaque){
        if (valorDoSaque > this.saldo){
            System.out.println("Valor é maior do que o seu saldo");
        }else {
            System.out.println("Saque realizado com sucesso!");
            this.saldo -= valorDoSaque;
        }
    }

    public void depositarDinheiro(double valorDoDeposito){
        this.saldo+=valorDoDeposito;
    }

    public void verificacaoDeConta(){
        if (this.status == Status.ESPECIAL){
            System.out.println("Sua conta é especial");
        }else {
            System.out.println("Sua conta é normal");
        }
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Status getStatus() {
        return status;
    }

    public int getLimite() {
        return limite;
    }

    @Override
    public String toString() {
        return "Número da Conta: " + numeroConta +
                ", Saldo: " + saldo +
                ", Status: " + status +
                ", Limite: " + limite;
    }
}
