package nicolas.dev.aulasJava.AJavacoreClasses.Owrapper.teste;


import java.sql.SQLOutput;

public class wrapperTest01 {

    public static void main(String[] args) {

        Short sP = 100; //Autoboxing, transformando em um Wrapper

        short sU = sP; //Unboxing, transformando um Wrapper em um tipo Primitivo

        Integer iTW2 = Integer.parseInt("1009203");
        Byte btw2 = Byte.parseByte("125");
        boolean verdadeiro = Boolean.parseBoolean("trUE");
        Character chC = '1';

        System.out.println(Character.isDigit(chC));
        System.out.println(iTW2);
        System.out.println("teste Byte " + btw2);
        System.out.println(verdadeiro);



    }



}
