package nicolas.dev.aulasJava.AJavacoreClasses.TresourceBundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {

        ResourceBundle bundle = ResourceBundle.getBundle("message", new Locale("pt", "BR"));
        System.out.println(bundle.getString("bom.dia"));
        boolean sadsa = bundle.containsKey("ola");
        System.out.println(sadsa);

        ResourceBundle bundleEN = ResourceBundle.getBundle("message", new Locale("en", "US"));
        System.out.println(bundleEN.getString("hello"));
    }

}
