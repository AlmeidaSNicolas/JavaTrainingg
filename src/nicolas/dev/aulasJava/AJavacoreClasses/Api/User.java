package nicolas.dev.aulasJava.AJavacoreClasses.Api;

public class User {
    private int id;
    private String nome;
    private String email;
    private boolean estaAtivo;

    public User(int id, String nome, String email){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.estaAtivo = true;
    }

    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public boolean isAtivo(){
        return estaAtivo;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setAtivo(boolean estaAtivo){
        this.estaAtivo = estaAtivo;
    }


}
