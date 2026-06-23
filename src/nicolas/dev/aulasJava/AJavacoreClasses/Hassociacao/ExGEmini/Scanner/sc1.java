package nicolas.dev.aulasJava.AJavacoreClasses.Hassociacao.ExGEmini.Scanner;

import java.util.Scanner;

public class sc1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira seus dados:");
        String next = sc.nextLine();
        System.out.println("Dados inseridos : " + next);

        if (next.equals("Nicolas") || next.isBlank()) {
            System.out.println("Sabia que voce voltaria HAHSSAHDHSAH");
        }
    }
}
