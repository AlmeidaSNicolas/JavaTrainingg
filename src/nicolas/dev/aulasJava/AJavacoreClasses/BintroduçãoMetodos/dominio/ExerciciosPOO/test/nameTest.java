package nicolas.dev.aulasJava.AJavacoreClasses.BintroduçãoMetodos.dominio.ExerciciosPOO.test;

import nicolas.dev.aulasJava.AJavacoreClasses.BintroduçãoMetodos.dominio.name;

public class nameTest {
    public static void main(String[] args) {



        name lista1 = new name();

        String[] names = {"pedro", "jao"};

        lista1.listName(names);

        System.out.println("ARRAY COMUM ACIMA VARARGS ABAIX0 : ------------");

        lista1.listNameVarArgs("jaco", "joao");


    }
}
