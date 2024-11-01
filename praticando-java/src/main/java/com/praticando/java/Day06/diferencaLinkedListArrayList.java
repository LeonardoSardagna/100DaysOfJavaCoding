package com.praticando.java.Day06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class diferencaLinkedListArrayList {
    private final int REPETICOES = 1000;

    public void diferencaEntreLinkeArrayList() {

        java.util.ArrayList<String> arrayList = new java.util.ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        //criando as tarefas e calculando o tempo com o arraylist
        System.out.println("Criando ArrayList");
        long inicioArrayList = System.nanoTime();
        adicionarTarefa(arrayList);
        long fimArrayList = System.nanoTime();
        System.out.println("Tempo para adicionar: " + (fimArrayList - inicioArrayList) + "ns");
        System.out.println();

        //criando as tarefas e calculando o tempo com o linkdlist
        System.out.println("Criando LinkedList");
        long inicioLinkedList = System.nanoTime();
        adicionarTarefa(linkedList);
        long fimLinkedList = System.nanoTime();
        System.out.println("Tempo para adicionar: " + (fimLinkedList - inicioLinkedList) + "ns");
        System.out.println();

        System.out.println("Removendo ArrayList");
        long remocaoArrayList = 0;
        for (int i = 0; i < REPETICOES; i++) {
            java.util.ArrayList<String> tempArrayList = new ArrayList<>(arrayList); //clonar lista
            long inicioRemovendoArrayList = System.nanoTime();
            removerTarefas(tempArrayList, 2);
            long fimRemovendoArrayList = System.nanoTime();
            remocaoArrayList += (fimRemovendoArrayList - inicioRemovendoArrayList);
        }
        System.out.println("Tempo para remover ArrayList: " + (remocaoArrayList / REPETICOES) + "ns");

        System.out.println("Removendo LinkedList");
        long remocaoLinkedList = 0;
        for (int i = 0; i < REPETICOES; i++) {
            LinkedList<String> tempLinkedList = new LinkedList<>(linkedList); //clonar lista
            long inicioRemovendoLinkedList = System.nanoTime();
            removerTarefas(tempLinkedList, 2);
            long fimRemovendoLinkedList = System.nanoTime();
            remocaoLinkedList += (fimRemovendoLinkedList - inicioRemovendoLinkedList);
        }
        System.out.println("Tempo para remover LinkedList: " + (remocaoLinkedList / REPETICOES) + "ns");
    }

    public static void adicionarTarefa(List<String> list) {
        list.add("Estudar para prova");
        list.add("Estudar para a entrevista");
        list.add("Ir para a academia");
        list.add("Almoçar");
        list.add("Ir para a faculdade");
    }

    public static void removerTarefas(List<String> list, int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
            System.out.println("Tarefa no índice " + index + " removida");
        } else {
            System.out.println("Índice inválido");
        }
    }
}
