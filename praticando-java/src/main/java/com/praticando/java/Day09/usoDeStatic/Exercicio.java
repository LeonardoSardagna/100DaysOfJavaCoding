package com.praticando.java.Day09.usoDeStatic;

public class Exercicio {
    public static void main(String[] args) {
        //testando classe static Contador
        System.out.println("Classe contador");
        imprimirNaTela(Contador.retornaContador());
        imprimirNaTela(Contador.incrementar());
        imprimirNaTela(Contador.incrementar());
        imprimirNaTela(Contador.retornaContador());
        imprimirNaTela(Contador.incrementar());
        imprimirNaTela(Contador.zerar());
        imprimirNaTela(Contador.retornaContador());
        System.out.println();

        //testenado a classe static Calculadora
        System.out.println("Classe calculadora");
        imprimirNaTela(Calculadora.somar(1, 2));
        imprimirNaTela(Calculadora.subtrair(8, 3));
        imprimirNaTela(Calculadora.multiplicar(4, 2));
        imprimirNaTela(Calculadora.dividir(8, 4));
        imprimirNaTela(Calculadora.potencia(4, 2));
        imprimirNaTela(Calculadora.fatorialRecursivo(5));
        imprimirNaTela(Calculadora.fatorialNormal(5));

        System.out.println("Classe Conversão de unidades de area");
        double metroQuadradoParaPesQuadrado = ConversaoDeUnidadeDeArea.metroQuadradoParaPesQuadrado(5);
        double pesQuadradoParaCentimetroQuadrado = ConversaoDeUnidadeDeArea.pesQuadradoParaCentimetroQuadrado(5);
        double milhaQuadradaParaAcres = ConversaoDeUnidadeDeArea.milhaQuadradaParaAcres(5);
        double acreParaPesQuadrado = ConversaoDeUnidadeDeArea.acreParaPesQuadrado(5);

        System.out.println(metroQuadradoParaPesQuadrado);
        System.out.println(pesQuadradoParaCentimetroQuadrado);
        System.out.println(milhaQuadradaParaAcres);
        System.out.println(acreParaPesQuadrado);

        System.out.println("Classe Conversão de unidade tempo");
        imprimirNaTela(ConversaoDeUnidadeDeTempo.minutoParaSegundo(1));
        imprimirNaTela(ConversaoDeUnidadeDeTempo.horaParaMinuto(1));
        imprimirNaTela(ConversaoDeUnidadeDeTempo.diaParaHora(1));
        imprimirNaTela(ConversaoDeUnidadeDeTempo.mesParaDia(1));
        imprimirNaTela(ConversaoDeUnidadeDeTempo.anoParaDia(1));

    }

    public static void imprimirNaTela(int num) {
        System.out.println(num);
    }
}
