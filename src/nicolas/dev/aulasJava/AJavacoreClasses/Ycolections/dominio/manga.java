package nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.dominio;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class manga implements Comparable<manga> {
    private Long id;
    private String nomeManga;
    private double preco;

    public manga(Long id, String nomeManga, double preco) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(nomeManga);

        this.id = id;
        this.nomeManga = nomeManga;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "manga{" +
                "id=" + id +
                ", nomeManga='" + nomeManga + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        manga manga = (manga) o;
        return Double.compare(preco, manga.preco) == 0 && Objects.equals(id, manga.id) && Objects.equals(nomeManga, manga.nomeManga);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomeManga, preco);
    }

    @Override
    public int compareTo(manga o) {
        if (this.id < o.getId()){
            return -1;
        }else if (this.id.equals(o.getId())){
            return  0;
        }else{
            return 1;
        }

    }
}
