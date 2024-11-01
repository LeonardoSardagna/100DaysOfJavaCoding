package com.praticando.java.Day09.usoDeStatic;

//Escreva a classe ConversaoDeUnidadesDeTempo com métodos estáticos
//para conversão aproximada das unidades de velocidade segundo a lista
//abaixo.
//• 1 minuto = 60 segundos
//• 1 hora = 60 minutos
//• 1 dia = 24 horas
//• 1 semana = 7 dias
//• 1 mês = 30 dias
//• 1 ano = 365.25 dias
public class ConversaoDeUnidadeDeTempo {
    public static int minutoParaSegundo(int minuto) {
        return minuto * 60;
    }

    public static int horaParaMinuto(int hora) {
        return hora * 60;
    }

    public static int diaParaHora(int dia) {
        return dia * 24;
    }

    public static int semanaParaDia(int semana) {
        return semana * 7;
    }

    public static int mesParaDia(int mes) {
        return mes * 30;
    }

    public static int anoParaDia(int ano) {
        return ano * 365;
    }
}
