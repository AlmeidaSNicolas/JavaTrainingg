package nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.teste;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

public class ListTest001 {
    public static void main(String[] args) {

        List<String> compras = new ArrayList<>();

        compras.add("Arroz");
        compras.add("feijao");
        compras.add("cafe");
        compras.add("leite");

        System.out.println(compras);
        compras.add(1, "açucar");
        compras.set(2, "CAFE SEM AÇUCAR");
        compras.remove("leite");
        compras.remove(0);

        compras.size();

        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(1);
        numeros.remove(1);
        System.out.println(numeros);
    }
}
