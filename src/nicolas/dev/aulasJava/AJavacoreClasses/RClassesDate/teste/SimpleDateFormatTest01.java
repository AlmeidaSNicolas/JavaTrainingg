package nicolas.dev.aulasJava.AJavacoreClasses.RClassesDate.teste;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String mascara = "yyyy.MM.dd G 'at' HH:mm:ss z ";
        SimpleDateFormat spdf = new SimpleDateFormat(mascara);
        System.out.println(spdf.format(new Date()));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome :");
        String nome = scanner.nextLine();

        if (nome.equals("Nicolas")) {
            System.out.println(spdf.format(new Date()));
        }else{
            System.out.println("nao é o nicolas, portanto data negada!!");
        }

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Insira seus dados para logar :");
        String email = scanner1.nextLine();
        String password = scanner1.nextLine();

        boolean estaValido = true;

        if(email != null && !email.isBlank() && password != null && !password.isBlank() && estaValido){
            System.out.println("Librando dados ultraSecretos");
            System.out.println(spdf.format(new Date()));
        }else{
            System.out.println("Login nao permitido, falta de dados");

        }
    }
}
