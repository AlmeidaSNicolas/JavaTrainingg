package nicolas.dev.aulasJava.AJavacoreClasses.test;

import nicolas.dev.aulasJava.AJavacoreClasses.dominio.personagem;

public class PersonaTest {
    public static void main(String[] args) {

        personagem p1 = new personagem("Killua",100, 20);

        personagem p2 = new personagem("Gon", 100, 10);

        p1.treinar();
        p2.treinar();

        

    }
}
