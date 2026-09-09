package nicolas.dev.aulasJava.AJavacoreClasses.Vio.desafios;

import java.io.*;

public class desafio4 {
    public static void main(String[] args) {

        File file = new File("relatorio_usuarios.txt");

        // 1. Fase de Escrita com Buffer
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write("--- RELATÓRIO DE USUÁRIOS ---");
            bw.newLine();
            bw.write("ID : 1 , Cargo : Java Developer, Nome : Nicolas");
            bw.newLine();
            bw.write("ID : 2 , Cargo : React Developer, Nome : Ana Julia");
            bw.newLine();
            bw.write("ID : 45 , Cargo : CTO, Nome : Jaco");
            bw.newLine(); // Quebra a linha final para o próximo append não grudar!

            bw.flush(); // Força o envio dos dados da memória RAM para o disco físico

        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2. Fase de Leitura
        try (FileReader fr = new FileReader(file)) {
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}