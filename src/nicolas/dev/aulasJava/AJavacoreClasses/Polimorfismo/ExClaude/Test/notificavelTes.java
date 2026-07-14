package nicolas.dev.aulasJava.AJavacoreClasses.Polimorfismo.ExClaude.Test;

import nicolas.dev.aulasJava.AJavacoreClasses.Polimorfismo.ExClaude.Dominio.NotficacaoEmail;
import nicolas.dev.aulasJava.AJavacoreClasses.Polimorfismo.ExClaude.Dominio.NotificacaoPush;
import nicolas.dev.aulasJava.AJavacoreClasses.Polimorfismo.ExClaude.Dominio.NotificacaoSMS;
import nicolas.dev.aulasJava.AJavacoreClasses.Polimorfismo.ExClaude.Dominio.Notificavel;

import java.util.ArrayList;
import java.util.List;

public class notificavelTes {
    public static void main(String[] args) {

        List<Notificavel> notificacoes = new ArrayList<>();

        notificacoes.add(new NotificacaoPush("rrrrrrrrrr"));
        notificacoes.add(new NotificacaoSMS("1293099999999900")); // inválido de propósito
        notificacoes.add(new NotficacaoEmail("tesgm@ail.com")); // inválido de propósito

        for (Notificavel n : notificacoes) {
            n.enviar();
            System.out.println();
        }
    }
}
