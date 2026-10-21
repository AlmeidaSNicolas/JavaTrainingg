package nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.teste;

import nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.dominio.celular;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {

        celular celular1 = new celular("askj123", "aplle");
        celular celular2 = new celular("AZB12", "Xiaomi");

        List<celular> listaCelular = new ArrayList<>();
        listaCelular.add(celular1);
        listaCelular.add(celular2);



        for (celular celular : listaCelular){
            System.out.println(celular.toString());
        }

        System.out.println(listaCelular.contains(celular2));
        System.out.println(listaCelular.indexOf(celular1));

    }
}
