package nicolas.dev.aulasJava.AJavacoreClasses.Ninterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover{
    @Override
    public void load(){
        System.out.println("Carregando DB...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo DB...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissoes no banco de dados");
    }
}
