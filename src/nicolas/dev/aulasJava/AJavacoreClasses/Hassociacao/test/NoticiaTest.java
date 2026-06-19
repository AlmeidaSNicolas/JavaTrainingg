package nicolas.dev.aulasJava.AJavacoreClasses.Hassociacao.test;

import nicolas.dev.aulasJava.AJavacoreClasses.Hassociacao.dominio.GerenciadorDeNoticias;
import nicolas.dev.aulasJava.AJavacoreClasses.Hassociacao.dominio.Noticia;

public class NoticiaTest {
    public static void main(String[] args) {

        Noticia n1 = new Noticia("EUA X IRA RETORNA", "RECOMEÇA A GUERRA ", "WORLD SEE");
        Noticia n5 = new Noticia("EUA X IRA RETORNA", "RECOMEÇA A GUERRA ", "WORLD SEE");
        GerenciadorDeNoticias g1 = new GerenciadorDeNoticias();
        Noticia n2 = new Noticia("CHINA SE ENVOLVE NA GUERRA, POSSIVEL 3 GUERRA MUNDIAL ESCALANDO?", "CHINA ENTRA NO MEIO DA BRIGA ENTRE EUA X IRA", "WORLD SEE");
        Noticia n3 = new Noticia("Mercado tech em ruinas AI manda no mundo" , "Modelos de AI dominaram o mundo", "AI WAR");


        g1.adicionarNoticia(n1);

        g1.adicionarNoticia(n1);



    }
}
