package nicolas.dev.aulasJava.AJavacoreClasses.dominio;

public class name {
    public void listName(String[] names){
        for(String nome: names){
            System.out.println("nome : " + nome);

        }
    }

    public void listNameVarArgs(String... names){
        for(String nome: names){
            System.out.println("nome : " + nome);
        }
    }
}
