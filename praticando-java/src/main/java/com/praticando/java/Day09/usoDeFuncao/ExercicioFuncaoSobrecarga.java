package com.praticando.java.Day09.usoDeFuncao;

public class ExercicioFuncaoSobrecarga {
    //três métodos com o mesmo nome e função mas
    //que retorna o tem parâmetros difernetes(assinatura)
    public int soma(int num1, int num2) {
        return num1 + num2;
    }

    public double soma(double num1, double num2) {
        return num1 + num2;
    }

    public int soma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
