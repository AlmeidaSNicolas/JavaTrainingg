package nicolas.dev.aulasJava.AJavacoreClasses.BintroduçãoMetodos.dominio;

public class imprimir {
    public static void imprimir(people Pessoa) {
        System.out.println("--------------");


        System.out.println(Pessoa.getNome());
        System.out.println(Pessoa.sexo);
        System.out.println(Pessoa.getIdade());
    }
}
