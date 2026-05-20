package POO.exPOO.entity;

public class login {
    public String login;
    public String senha;
    boolean estaBloqueado;
    public int tentativasIncorretas;

    public login(String login, String senha){
        this.login = login;
        this.senha = senha;
        estaBloqueado = false;
        tentativasIncorretas = 0;
    }

    // Mudamos de void para boolean
    public boolean autenticar(String loginInformado, String senhaInformada) {
        if (estaBloqueado == true) {
            System.out.println("Usuario bloqueado, trancando seu acesso");
            return false;
        }

        if (this.login.equals(loginInformado) && this.senha.equals(senhaInformada)) {
            System.out.println("Login realizado com sucesso, bem vindo.");
            tentativasIncorretas = 0;
            return true;
        } else {
            tentativasIncorretas++;
            System.out.println("Credenciais incorretas, Tentativas: " + tentativasIncorretas);


            if (tentativasIncorretas >= 1) {
                estaBloqueado = true;
                System.out.println("Usuario bloqueado por excesso de tentativas");
            }
            return false;
        }
    }
}