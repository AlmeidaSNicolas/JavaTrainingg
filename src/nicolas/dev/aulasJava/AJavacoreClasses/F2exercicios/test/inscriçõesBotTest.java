package nicolas.dev.aulasJava.AJavacoreClasses.F2exercicios.test;

import nicolas.dev.aulasJava.AJavacoreClasses.F2exercicios.dominio.UsuarioTelegram;

public class inscriçõesBotTest {
    public static void main(String[] args) {

        UsuarioTelegram n1 = new UsuarioTelegram(12000, "Nicolas");
        n1.imprime();

        System.out.println("------");

        UsuarioTelegram n2 = new UsuarioTelegram(1, "Cleber", "Tensoes entre paises do golfo");
        n2.imprime();

        System.out.println("-------");

        UsuarioTelegram n3 = new UsuarioTelegram(4, "Joao", "Tensoes brasileiras", true);
        n3.imprime();


    }
}
