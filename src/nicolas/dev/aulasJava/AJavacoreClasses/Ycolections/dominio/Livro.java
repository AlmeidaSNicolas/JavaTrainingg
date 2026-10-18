package nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.dominio;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Livro {
    private String titulo;
    private String autor;
    private int anoLancamento;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Livro livros = (Livro) obj;

        return Objects.equals(titulo, livros.titulo) && Objects.equals(autor, livros.autor);
    }

    //se x.equals(y) == true, y.hashCode() == x.hashCode() no caso o hashcode tem que ser igual
    //y.hashCode() == x.hashcode() nao necessariamente o equals de y.equals(X) tem que ser true
    //x.equals(y) == false hashcode tem que ser diferente
    //y.hascode() != x.hashcode()  x.equals(y) devera ser false
    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor);
    }
}
