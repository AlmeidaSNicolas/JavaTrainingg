package nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.teste;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BigOtest {
    public static void main(String[] args) {
        List<String> produtos = new LinkedList<>();
        produtos.add("Notebook");
        produtos.add("Mouse");
        produtos.add("Teclado");

        imprimir(produtos);

        List<String> filtrados =
                filtrarPorTamanho(produtos, 6);
        imprimir(filtrados);
    }

    static void imprimir(List<String> lista) {
        for (String s : lista)
            System.out.println(s);
    }

    static List<String> filtrarPorTamanho(List<String> lista, int
            min) {
        List<String> resultado = new ArrayList<>();
        for (String s : lista) if (s.length() >=
                min) resultado.add(s);
        return resultado;
    }
}
