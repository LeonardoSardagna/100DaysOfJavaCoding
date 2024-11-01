package com.praticando.java.Day07;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExercicioLinkedHashSet {
    //exercício linkedHashSet
    public void manterOrdemDeInsercao() {
        //Crie um programa que armazene palavras em
        // um LinkedHashSet e exiba as palavras na ordem em que foram inseridas.
        Set<String> palavrasSet = new LinkedHashSet<>();
        palavrasSet.add("Avião");
        palavrasSet.add("Leão");
        palavrasSet.add("Barraca");
        palavrasSet.add("Satélite");

        palavrasSet.forEach(System.out::println);
    }

    public void eliminarDuplicatasComOrdem() {
        //Crie um programa que leia uma lista de números inteiros e
        //armazene-os em um LinkedHashSet para remover duplicatas,
        //mantendo a ordem de inserção, e depois exiba os números.
        Set<Integer> integerSet = new LinkedHashSet<>();
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        integerArrayList.add(1);
        integerArrayList.add(1);
        integerArrayList.add(3);
        integerArrayList.add(3);
        integerArrayList.add(4);
        integerArrayList.add(5);
        integerArrayList.add(2);
        integerArrayList.add(4);
        integerArrayList.add(1);

        integerSet.addAll(integerArrayList);

        integerSet.forEach(System.out::println);
    }
}
