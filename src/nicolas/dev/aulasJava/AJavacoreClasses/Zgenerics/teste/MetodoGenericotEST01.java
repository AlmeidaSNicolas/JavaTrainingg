package nicolas.dev.aulasJava.AJavacoreClasses.Zgenerics.teste;

import nicolas.dev.aulasJava.AJavacoreClasses.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericotEST01 {
    public static void main(String[] args) {

    criarArrayComUmobj(new Carro("Civicao bolado", 123));

    }

    private static <T> void criarArrayComUmobj(T t){
        List<T> arrayGenerico = List.of(t);
        System.out.println(arrayGenerico);

    }

}

