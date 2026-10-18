package nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.teste;

import java.util.*;

public class BigOtest03 {
    public static void main(String[] args) {
        int n = 100_000;

        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add("Item " + i);
        }

        Set<String> hashSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hashSet.add("New " + i);
        }

        List<String> busca = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            busca.add("Item " + i);
        }

        System.out.println("ArrayList contains " + buscarTodos(arrayList,busca) + "ms");
        System.out.println("HashSet contains " + buscarTodos(hashSet,busca) + "ms");

    }

    static long buscarTodos(Collection<String> collection, List<String> busca) {
        long inicio = System.nanoTime();
        for (String s : busca) {
            collection.contains(s);
        }
        long fim = System.nanoTime();
        return fim - inicio;
    }
}

