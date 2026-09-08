package nicolas.dev.aulasJava.AJavacoreClasses.Uregex.test;

import nicolas.dev.aulasJava.AJavacoreClasses.Hassociacao.EXfinal.Local;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ScannerDataTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Cadastro de devs ===");
        System.out.println("Digite seu nome: ");

        String nome = scanner.nextLine();

        System.out.println("Sua idade : " );
        int idade = scanner.nextInt();

        System.out.println("Digite seu salario pretendido : ");
        double salario = scanner.nextDouble();

        System.out.println("Trabalho remoto ? ");
        boolean remoto = scanner.nextBoolean();



        System.out.println("== Resumo do Cadastro ==");
        System.out.println("Nome : " + nome);
        System.out.println("Idade : " + idade);
        System.out.println("Salario desejado : " + salario);
        System.out.println("Remoto : " + remoto);

    }
}
