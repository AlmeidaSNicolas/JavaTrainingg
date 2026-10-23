package nicolas.dev.aulasJava.AJavacoreClasses.Zgenerics.dominio;

public class Cliente {
    private String name;

    public Cliente(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                '}';
    }
}
