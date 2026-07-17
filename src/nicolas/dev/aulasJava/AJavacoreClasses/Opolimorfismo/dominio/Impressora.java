package nicolas.dev.aulasJava.AJavacoreClasses.Opolimorfismo.dominio;

public class Impressora {

    public void Imprimir(Produto produto){
        System.out.println("--------------");
        System.out.println("Dados da sua compra : ");
        System.out.println("Nome do produto :  " + produto.getNome());
        System.out.println("Valor do produto : " + produto.getValor());
        System.out.println();
    }

}
