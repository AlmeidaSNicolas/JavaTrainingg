package nicolas.dev.aulasJava.AJavacoreClasses.Pexception.exception.Test;

import nicolas.dev.aulasJava.AJavacoreClasses.Pexception.exception.Dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }

    }

    private static void logar() throws LoginInvalidoException {
        Scanner sc = new Scanner(System.in);
        String usernameDb = "Nicolas";
        String senhaDb = "Nicolas1011.";
        System.out.println("Usuario");
        String userNameDigitado = sc.nextLine();
        System.out.println("Senha");
        String senhaDigitado = sc.nextLine();

        if(!usernameDb.equals(userNameDigitado) || !senhaDb.equals(senhaDigitado) ){
            throw new LoginInvalidoException("Usuario ou senha invalidos");
        }

        System.out.println("Usuario logado com sucesso");

    }
}
