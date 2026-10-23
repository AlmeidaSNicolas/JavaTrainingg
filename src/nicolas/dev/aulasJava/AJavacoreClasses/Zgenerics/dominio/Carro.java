package nicolas.dev.aulasJava.AJavacoreClasses.Zgenerics.dominio;

public class Carro {
    private String name;

    public Carro(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + name + '\'' +
                '}';
    }
}
