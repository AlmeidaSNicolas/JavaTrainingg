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

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor);
    }
}
