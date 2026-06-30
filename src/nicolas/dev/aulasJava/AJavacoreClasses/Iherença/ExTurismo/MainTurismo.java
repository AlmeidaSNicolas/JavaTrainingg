package nicolas.dev.aulasJava.AJavacoreClasses.Iherença.ExTurismo;

import nicolas.dev.aulasJava.AJavacoreClasses.Iherença.ExTurismo.Atividades.TrilhaGuiada;

public class MainTurismo {
    public static void main(String[] args) {

        TrilhaGuiada trilhaBuciero = new TrilhaGuiada("Rota de Laredo ao Monte", 12, 15.5);

        System.out.println("--- Relatório da Atividade ---");


        trilhaBuciero.imprimirRelatorio();


    }
}