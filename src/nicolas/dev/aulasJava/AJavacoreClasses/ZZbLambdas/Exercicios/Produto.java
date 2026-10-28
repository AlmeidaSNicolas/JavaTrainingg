package nicolas.dev.aulasJava.AJavacoreClasses.ZZbLambdas.Exercicios;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
}
