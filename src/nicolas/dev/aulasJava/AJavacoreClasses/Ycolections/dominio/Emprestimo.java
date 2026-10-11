package nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.dominio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Objects;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Emprestimo {
    Livro livro;
    private String cpfLeitor;
    private LocalDate dataEmprestimo;


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Emprestimo emprestimo = (Emprestimo) obj;

        return Objects.equals(livro, emprestimo.livro) && Objects.equals(cpfLeitor, emprestimo.cpfLeitor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livro, cpfLeitor);
    }
}
