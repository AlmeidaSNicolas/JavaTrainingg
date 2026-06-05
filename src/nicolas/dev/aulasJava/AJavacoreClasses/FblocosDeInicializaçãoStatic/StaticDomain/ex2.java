package nicolas.dev.aulasJava.AJavacoreClasses.FblocosDeInicializaçãoStatic.StaticDomain;

import java.util.HashMap;
import java.util.Map;

public class ex2 {
    public static Map<String, String> parametros = new HashMap<>();

    static{
        System.out.println("Carregando dados iniciais do Sistema");
        parametros.put("URL", "jdbc:mysql://localhost:3306/bancodedados");
        parametros.put("usuario", "admin");
        parametros.put("timeout", "30s");
    }

    public static String getParametro(String chave) {
        return parametros.get(chave);
    }
}
