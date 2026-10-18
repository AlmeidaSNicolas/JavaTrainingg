package nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.teste;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BigOTest02 {
    public static void main(String[] args) {
        int n = 100_000;

        // Teste A: inserir no início
        System.out.println("ArrayList  add(0,x): " + inserirNoInicio(new ArrayList<>(), n) + " ms");
        System.out.println("LinkedList add(0,x): " + inserirNoInicio(new LinkedList<>(), n) + " ms");

        // Teste B: acesso por índice
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }

        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(i);
        }

        // TODO: crie uma ArrayList e uma LinkedList, cada uma com n elementos
        // TODO: chame acessarPorIndice com cada uma e imprima o tempo

        System.out.println("LinkedList get(i) " + acessarPorIndice(linkedList));
        System.out.println("Arraylit get(i) " + acessarPorIndice(arrayList));
    }

    static long inserirNoInicio(List<Integer> lista, int n) {
        long inicio = System.nanoTime();
        for (int i = 0; i < n; i++) {
            lista.add(0, i);
        }
        // TODO: faça lista.add(0, i) n vezes
        long fim = System.nanoTime();
        return (fim - inicio) / 1_000_000; // nanossegundos → milissegundos
    }

    static long acessarPorIndice(List<Integer> lista) {
        long inicio = System.nanoTime();
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i);
        }
        // TODO: percorra com for (int i = 0; ...) e chame lista.get(i)
        long fim = System.nanoTime();
        return (fim - inicio) / 1_000_000;
    }
}