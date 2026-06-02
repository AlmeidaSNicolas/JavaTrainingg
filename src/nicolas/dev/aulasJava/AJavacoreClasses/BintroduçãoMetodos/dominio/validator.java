package nicolas.dev.aulasJava.AJavacoreClasses.BintroduçãoMetodos.dominio;

public class validator {

    public boolean podeVotar(int idade){
        if(idade < 16 || idade > 100){
            System.out.println("Voce nao pode votar, ou é muito novo ou esta muito velho");
            return false;
        }else{
            System.out.println("Voce pode votar, faça um bom uso");
            return true;
        }

    }


}
