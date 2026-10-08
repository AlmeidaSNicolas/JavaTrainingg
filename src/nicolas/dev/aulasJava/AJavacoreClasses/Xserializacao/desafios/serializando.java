package nicolas.dev.aulasJava.AJavacoreClasses.Xserializacao.desafios;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class serializando {
    public static void main(String[] args) {

        usuarioSessao usuarioSessao = new usuarioSessao("nicolasDeusDoMundo", "nicolasdeus@gmail.com", "nCoLaS1011@");

        serializando(usuarioSessao);

        deserializar();

    }

    private static void serializando(usuarioSessao usuarioSessao){
        Path path = Paths.get("pasta/usuario.ser");

        try(ObjectOutputStream oss = new ObjectOutputStream(Files.newOutputStream(path))){
            oss.writeObject(usuarioSessao);
        }catch (IOException e){
            System.out.println(e);
            e.printStackTrace();
        }
    }

    private static void deserializar(){
        Path path = Paths.get("pasta/usuario.ser");
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
