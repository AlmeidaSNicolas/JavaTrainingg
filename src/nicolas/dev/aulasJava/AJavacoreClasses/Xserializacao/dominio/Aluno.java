package nicolas.dev.aulasJava.AJavacoreClasses.Xserializacao.dominio;

import java.io.*;

public class Aluno implements Serializable {
    private long id;
    private String nome;
    private String password;
    private transient Turma turma;

    public Aluno(long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", turma=" + turma +
                '}';
    }

    @Serial
    private void writeObject(ObjectOutputStream oss){
        try {
            oss.defaultWriteObject();
            oss.writeUTF(turma.getNome());
        }catch (IOException e){
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream ois){
        try {
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            turma = new Turma(nomeTurma);
        }catch (IOException | ClassNotFoundException e){
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
