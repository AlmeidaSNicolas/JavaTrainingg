package nicolas.dev.aulasJava.AJavacoreClasses.QclassesUtilitariasString.test;


import java.sql.SQLOutput;

public class StringTest01 {
    public static void main(String[] args) {

        String nome = "    luffy sales de almeida    ";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("f", "l"));

        String nomeCompleto = "NicolasSalesAlmeida";
        System.out.println(nomeCompleto.replace("a", "b"));

        String numeros = "012345678";

        System.out.println(numeros.substring(1, 9));
        System.out.println(nome);
        System.out.println(nome.trim());

        String logBruto = "  [LOG-2026] - USUARIO: dev_jiraya - STATUS: ativo   ";
// 1. Remova os espaços das pontas
// 2. Converta tudo para maiúsculas
// 3. Substitua "ATIVO" por "PROCESSADO"
// 4. Extraia apenas o "LOG-2026" com substring


        System.out.println(logBruto.replace("ativo", "processado").trim().toUpperCase());
        System.out.println(logBruto.substring(3,11));
    }

}
