package nicolas.dev.aulasJava.AJavacoreClasses.Ninterfaces.test;

import nicolas.dev.aulasJava.AJavacoreClasses.Ninterfaces.dominio.DataBaseLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {

        DataBaseLoader d1 = new DataBaseLoader();
        d1.checkPermission();
        d1.load();

        }
}
