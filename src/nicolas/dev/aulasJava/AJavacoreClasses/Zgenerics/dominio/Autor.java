package nicolas.dev.aulasJava.AJavacoreClasses.Zgenerics.dominio;

public class Autor {
    private String name;
    private String id;

    public Autor(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
