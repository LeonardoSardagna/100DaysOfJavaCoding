package com.praticando.java.Day07;

import java.util.Set;
import java.util.TreeSet;

public class ExercicioTreeSet {
    //exercício treeset
    public void numerosOrdenados() {
        //Crie um programa que leia uma lista de números inteiros,
        //armazene-os em um TreeSet e exiba os números em ordem crescente.
        Set<Integer> integerSet = new TreeSet<>();
        integerSet.add(1);
        integerSet.add(4);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(0);
        integerSet.add(5);
        //Vai ordenar a lista automáticamente
        integerSet.forEach(System.out::println);
    }

    public void compararNomes() {
        //Crie um programa que armazene nomes em um TreeSet
        //e exiba os nomes em ordem alfabética.
        Set<String> nomesSet = new TreeSet<>();
        nomesSet.add("Leonardo");
        nomesSet.add("Vanderlei");
        nomesSet.add("Anatel");
        nomesSet.add("Valmir");
        nomesSet.add("Mari");

        nomesSet.forEach(System.out::println);
    }
}
