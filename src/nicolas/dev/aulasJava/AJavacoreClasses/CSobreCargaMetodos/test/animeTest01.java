package nicolas.dev.aulasJava.AJavacoreClasses.CSobreCargaMetodos.test;

import nicolas.dev.aulasJava.AJavacoreClasses.CSobreCargaMetodos.dominio.anime;

public class animeTest01 {
    public static void main(String[] args) {

        anime a1 = new anime();

        a1.init("Super onze TEMP 1", "anime", 24, "Futebol");

        a1.imprime();
    }
}
