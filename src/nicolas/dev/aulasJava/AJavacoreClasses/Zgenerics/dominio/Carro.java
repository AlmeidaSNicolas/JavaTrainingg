package nicolas.dev.aulasJava.AJavacoreClasses.Zgenerics.dominio;

public class Carro {
    private String name;
    private Integer id;

    public Carro(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
