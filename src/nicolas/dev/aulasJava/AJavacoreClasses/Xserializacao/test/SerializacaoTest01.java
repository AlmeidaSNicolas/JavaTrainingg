package nicolas.dev.aulasJava.AJavacoreClasses.Xserializacao.test;

import nicolas.dev.aulasJava.AJavacoreClasses.Xserializacao.dominio.Aluno;
import nicolas.dev.aulasJava.AJavacoreClasses.Xserializacao.dominio.Veiculos;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno(1, "Nicolas", "Nicolas1011.");
        Veiculos veiculo1 = new Veiculos("14A-S32", "Serjao", 40000, 150);

        Aluno aluno2 = new Aluno(2, "aNA jU", "ana123");
        serializar(aluno2);
        deserializar();

        serializar(aluno1);
        deserializar();

        serializar2(veiculo1);

    }
    private static void serializar(Aluno aluno){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
            System.out.println(aluno);
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    private static void serializar2(Veiculos veiculos){
        Path path = Paths.get("pasta/dadosVeiculos.ser");
        try (ObjectOutputStream oss = new ObjectOutputStream(Files.newOutputStream(path))){
            oss.writeObject(veiculos);
        }catch (IOException e){
            System.out.println(e);
            e.printStackTrace();
        }

    }

    private static void deserializar(){
        Path path = Paths.get("pasta/dadosVeiculos.ser");
        try (ObjectInputStream oss = new ObjectInputStream(Files.newInputStream(path))){
            Object o = oss.readObject();
            System.out.println("objeto lido acima");
        }catch (IOException | ClassNotFoundException e){
            System.out.println(e);
            e.printStackTrace();
        }

    }

}
