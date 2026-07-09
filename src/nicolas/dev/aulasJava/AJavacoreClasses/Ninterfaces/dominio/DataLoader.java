package nicolas.dev.aulasJava.AJavacoreClasses.Ninterfaces.dominio;

public interface DataLoader {
    void load();

    default void checkPermission(){
        System.out.println("Checando Permissao...");
    };
}
