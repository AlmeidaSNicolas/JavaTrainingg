package nicolas.dev.aulasJava.AJavacoreClasses.Opolimorfismo.ExClaude.Ex2.Test2;

import nicolas.dev.aulasJava.AJavacoreClasses.Opolimorfismo.ExClaude.Ex2.Dominio2.Desconto;
import nicolas.dev.aulasJava.AJavacoreClasses.Opolimorfismo.ExClaude.Ex2.Dominio2.DescontoFixo;
import nicolas.dev.aulasJava.AJavacoreClasses.Opolimorfismo.ExClaude.Ex2.Dominio2.DescontoPercentual;
import nicolas.dev.aulasJava.AJavacoreClasses.Opolimorfismo.ExClaude.Ex2.Dominio2.DescontoProgressivo;

import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) {

        ArrayList<Desconto> descontos = new ArrayList<>();
        descontos.add(new DescontoFixo(200));
        descontos.add(new DescontoPercentual(200));
        descontos.add(new DescontoProgressivo(200));

        for(Desconto d : descontos){
            d.aplicarDesconto(500);
            System.out.println();
        }

    }
}
