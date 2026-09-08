package nicolas.dev.aulasJava.AJavacoreClasses.Uregex.Desafios;

import java.util.Scanner;

public class ScannerTest03EX {
    public static void main(String[] args) {

        String texto = "Goku;42;5000;true";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(";");

        while(scanner.hasNext()){
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("Int : " + i);
            }else if(scanner.hasNextBoolean()){
                boolean b = scanner.nextBoolean();
                System.out.println("Bollean : " + b);
            } else if (scanner.hasNextDouble()) {
                double b = scanner.nextDouble();
                System.out.println("Double : " + b);
            }else{
                System.out.println("String : " + scanner.next());
            }
        }


    }
}
