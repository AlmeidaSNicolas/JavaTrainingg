package nicolas.dev.aulasJava.AJavacoreClasses.FblocosDeInicializaçãoStatic.StaticTest;

import nicolas.dev.aulasJava.AJavacoreClasses.FblocosDeInicializaçãoStatic.StaticDomain.ModificadoresStatic;

public class TestStatic {

    public static void main(String[] args) {
        ModificadoresStatic c1 = new ModificadoresStatic("BMW", 280);
        ModificadoresStatic c2 = new ModificadoresStatic("Porshe", 240);
        ModificadoresStatic c3 = new ModificadoresStatic("Ferrari", 300);


        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
