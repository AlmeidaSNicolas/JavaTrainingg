package nicolas.dev.aulasJava.AJavacoreClasses.Xserializacao.desafios;

import java.io.Serializable;

public class usuarioSessao implements Serializable {
    private String username;
    private String email;
    private transient String tokenAcesso;

    public usuarioSessao(String username, String email, String tokenAcesso) {
        this.username = username;
        this.email = email;
        this.tokenAcesso = tokenAcesso;
    }

    @Override
    public String toString() {
        return "usuarioSessao{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", tokenAcesso='" + tokenAcesso + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTokenAcesso() {
        return tokenAcesso;
    }

    public void setTokenAcesso(String tokenAcesso) {
        this.tokenAcesso = tokenAcesso;
    }
}
