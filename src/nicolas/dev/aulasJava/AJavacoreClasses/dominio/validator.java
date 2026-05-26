package nicolas.dev.aulasJava.AJavacoreClasses.dominio;

public class validator {

    public boolean podeVotar(int idade){
        if(idade < 16){
            System.out.println("Voce nao pode votar");
            return false;
        }else{
            System.out.println("Voce pode votar, faça um bom uso");
            return true;
        }

    }


}
