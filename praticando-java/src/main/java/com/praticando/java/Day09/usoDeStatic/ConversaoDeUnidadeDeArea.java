package com.praticando.java.Day09.usoDeStatic;

//Escreva a classe ConversaoDeUnidadesDeArea com métodos estáticos
//para conversão das unidades de área segundo a lista abaixo.
//• 1 metro quadrado = 10.76 pés quadrados
//• 1 pé quadrado = 929 centímetros quadrados
//• 1 milha quadrada = 640 acres
//• 1 acre = 43.560 pés quadrados
public class ConversaoDeUnidadeDeArea {
    public static double metroQuadradoParaPesQuadrado(double metro) {
        return metro * 10.76;
    }

    public static double pesQuadradoParaCentimetroQuadrado(double pes) {
        return pes * 929;
    }

    public static double milhaQuadradaParaAcres(double milha) {
        return milha * 640;
    }

    public static double acreParaPesQuadrado(double acre) {
        return acre * 43560;
    }
}
