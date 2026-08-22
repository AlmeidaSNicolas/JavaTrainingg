package nicolas.dev.aulasJava.AJavacoreClasses.QclassesUtilitariasString.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concat(300_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String " + (fim - inicio) + "ms");

        long inicio2 = System.currentTimeMillis();
        concatBuild(300_000);
        long fim2 = System.currentTimeMillis();
        System.out.println("Tempo gasto para String builder " + (fim2 - inicio2) + "ms");

        StringBuilder sb2 = new StringBuilder("Nicolas");
        sb2.append(" Sales ").append(" Almeida ");


        System.out.println("Resposta do append do sb2");
        sb2.delete(1,3);
        System.out.println(sb2);



    }

    private static void concat(int tamanho){
         String texto = "";
        for (int i = 0; i < tamanho; i++) {
             texto += i ;
        }
    }

    private static void concatBuild(int tamanho){
        StringBuilder sBuilder = new StringBuilder(tamanho);
        for(int i = 0; i < tamanho; i++){
            sBuilder.append(i);
        }

    }

}
