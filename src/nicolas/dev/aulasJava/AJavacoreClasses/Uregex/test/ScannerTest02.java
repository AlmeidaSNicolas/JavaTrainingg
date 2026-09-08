package nicolas.dev.aulasJava.AJavacoreClasses.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String textp = "Levi,Eren,Mikasa,true,2-0-0";
        Scanner scanner = new Scanner(textp);
        scanner.useDelimiter(",");

        while(scanner.hasNext()){
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.printf("int : " + i);
            } else if (scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println(b);
            }else{
                System.out.println("Nomes : " + scanner.next());
            }
        }

    }
}
 