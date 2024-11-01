package com.praticando.java.Day06;

import java.util.Scanner;

public class Constante {
    Scanner scanner = new Scanner(System.in);

    //Constantes
    public void usoDeConstantes() {
        final int LIMITE_SUPERIOR = 10;
        for (int i = 0; i < LIMITE_SUPERIOR; i++) {
            System.out.println("Leonardo");
        }
        //Não posso alterar a constante
        //LIMITE_SUPERIOR = 100;
    }
}
