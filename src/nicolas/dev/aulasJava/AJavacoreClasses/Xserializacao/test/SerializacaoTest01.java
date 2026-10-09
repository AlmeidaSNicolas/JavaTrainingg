package nicolas.dev.aulasJava.AJavacoreClasses.Xserializacao.test;

import nicolas.dev.aulasJava.AJavacoreClasses.Xserializacao.dominio.Aluno;
import nicolas.dev.aulasJava.AJavacoreClasses.Xserializacao.dominio.Turma;
import nicolas.dev.aulasJava.AJavacoreClasses.Xserializacao.dominio.Veiculos;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {

        Aluno aluno2 = new Aluno(2, "aNA jU", "ana123");
        Turma turma = new Turma("maratona java");
        aluno2.setTurma(turma);
        serializar(aluno2);
        deserializar();

        Aluno aluno1 = new Aluno(1, "Nioclas", "tt123");
        Turma turma1 = new Turma("Maratona sex");
        aluno1.setTurma(turma1);
        serializar(aluno1);
        deserializar();
    }

    private static void serializar(Aluno aluno){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    private static void deserializar(){
        Path path = Paths.get("pasta/aluno.ser");
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
