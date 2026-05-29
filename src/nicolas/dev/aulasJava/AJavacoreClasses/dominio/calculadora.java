package nicolas.dev.aulasJava.AJavacoreClasses.dominio;

public class calculadora {
    public void somaArray(int[] numeros){
        int soma =0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
