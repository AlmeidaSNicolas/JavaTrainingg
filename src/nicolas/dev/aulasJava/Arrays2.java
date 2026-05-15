package nicolas.dev.aulasJava;

public class Arrays2 {
    public static void main(String[] args) {

        String[] nomes = {"Joao", "Silvio", "Goku", "Mario", "Que mario ?", "Aquele que te comeu atras do armario"};

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        for(String nome : nomes){
            System.out.println(nome);
        }
    }
}
