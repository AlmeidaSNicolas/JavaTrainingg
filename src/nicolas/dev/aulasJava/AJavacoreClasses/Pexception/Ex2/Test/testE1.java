package nicolas.dev.aulasJava.AJavacoreClasses.Pexception.Ex2.Test;

import nicolas.dev.aulasJava.AJavacoreClasses.Pexception.Ex2.Model.MochilaRasgadaException;
import nicolas.dev.aulasJava.AJavacoreClasses.Pexception.Ex2.Model.Personagem;

public class testE1 {
    public static void main(String[] args)throws MochilaRasgadaException {

        Personagem p1 = new Personagem(10, 20);

        p1.saquearItem(2);


    }
}
