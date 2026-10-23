package nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.dominio;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

@Getter
@AllArgsConstructor
public class Aluno2 {
    private String matricula;
    private String nome;

    @Override
    public String toString() {
        return "Aluno2{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if (obj == null || getClass() != obj.getClass()){
            return false;
        }

        Aluno2 aluno2 = (Aluno2) obj;

        return Objects.equals(this.matricula, aluno2.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }
}
