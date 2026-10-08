package nicolas.dev.aulasJava.AJavacoreClasses.Xserializacao.desafios;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class serializandoProduto {
    public static void main(String[] args) {


       Produto produto = new Produto(21, "Arroz 10k");
       //serializando(produto);
       deserializar();

    }

    private static void serializando(Produto produto){
        Path path = Paths.get("pasta/produtos.ser");

        try(ObjectOutputStream oss = new ObjectOutputStream(Files.newOutputStream(path))){
            oss.writeObject(produto);
        }catch (IOException e){
            System.out.println(e);
            e.printStackTrace();
        }
    }

    private static void deserializar(){
        Path path = Paths.get("pasta/produtos.ser");
        try (ObjectInputStream oss = new ObjectInputStream(Files.newInputStream(path))){
            Object o = oss.readObject();
            System.out.println(o);
            System.out.println("objeto lido acima");
        }catch (IOException | ClassNotFoundException e){
            System.out.println(e);
            e.printStackTrace();
        }

    }
}
