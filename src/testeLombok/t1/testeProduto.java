package testeLombok.t1;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class testeProduto {

    private String nome;
    private int preco;
    private String dataValidade;


    public static void imprimirDados(testeProduto produto){
        System.out.println("Dados de produto abaixo");
        System.out.println(produto.nome);
        System.out.println(produto.preco);
        System.out.println(produto.dataValidade);
    }

}
