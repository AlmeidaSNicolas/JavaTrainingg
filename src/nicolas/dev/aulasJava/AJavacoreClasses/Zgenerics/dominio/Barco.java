package nicolas.dev.aulasJava.AJavacoreClasses.Zgenerics.dominio;

public class Barco {
    private String name;

    public Barco(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "nome='" + name + '\'' +
                '}';
    }
}
