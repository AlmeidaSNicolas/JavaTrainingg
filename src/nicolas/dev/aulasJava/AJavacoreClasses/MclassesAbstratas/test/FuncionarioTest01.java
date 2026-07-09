package nicolas.dev.aulasJava.AJavacoreClasses.MclassesAbstratas.test;

import nicolas.dev.aulasJava.AJavacoreClasses.MclassesAbstratas.dominio.Desenvolvedor;
import nicolas.dev.aulasJava.AJavacoreClasses.MclassesAbstratas.dominio.Funcionario;
import nicolas.dev.aulasJava.AJavacoreClasses.MclassesAbstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Gerente g1 = new Gerente("Pedro", 6000);
        Desenvolvedor d1 = new Desenvolvedor("Nicolas", 8000, "JAVA");

        g1.imprime();
        d1.imprime();

        System.out.println(g1);
        System.out.println(d1);
    }
}
