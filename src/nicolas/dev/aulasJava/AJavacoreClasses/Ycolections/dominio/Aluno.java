package nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.dominio;

import lombok.Getter;

import java.util.Objects;

import java.util.Comparator;


class ALunoPorNomeComparator implements Comparator<Aluno>{
    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        return aluno1.getName().compareTo(aluno2.getName());
    }
}

class AlunoPorNotaComparator implements Comparator<Aluno>{
    @Override
    public int compare(Aluno o1, Aluno o2) {
        if (o1.getNota() > o2.getNota()){
            return -1;
        } else if(o1.getNota() < o2.getNota()){
            return  1;
        }
        return 0;
    }
}

@Getter
public class Aluno implements Comparable<Aluno> {
    private Long registration;
    private String name;
    private double nota;

    public Aluno(Long registration, String name, double nota) {
        Objects.requireNonNull(registration, "Registration cant be null");
        Objects.requireNonNull(name, "name cant be null");
        if (nota > 10 || nota < 0){
            throw new IllegalArgumentException();
        }
        this.registration = registration;
        this.name = name;
        this.nota = nota;
    }



    @Override
    public int compareTo(Aluno o) {

        return this.registration.compareTo(o.registration);

    }


}
