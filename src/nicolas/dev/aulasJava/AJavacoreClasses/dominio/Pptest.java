package nicolas.dev.aulasJava.AJavacoreClasses.dominio;

public class Pptest {
    public static void main(String[] args) {

        people p1 = new people();


        System.out.println("Dados pessoais abaixo : ");
        p1.setNome("Ncolas");
        p1.getNome();
        p1.setIdade(21);
        p1.getIdade();
        p1.sexo = 'M';
        p1.imprime();

    }
}
