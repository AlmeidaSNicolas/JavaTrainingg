package nicolas.dev.aulasJava.AJavacoreClasses.BintroduçãoMetodos.dominio.Api;

public class UserRequest {
    private String nome;
    private String email;

    public UserRequest(String nome, String email){
        this.nome = nome;
        this.email = email;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
}
