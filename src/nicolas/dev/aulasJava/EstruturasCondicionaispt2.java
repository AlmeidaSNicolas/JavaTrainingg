package nicolas.dev.aulasJava;

import org.w3c.dom.ls.LSOutput;

public class EstruturasCondicionaispt2 {
    public static void main(String[] args) {

        //se a idade for menor do que 15 imprima infantil, se idade for maior igual a 15 e idade menor do que 18 imprima
        // juvenil se idade for maior que >=18 categoria adulto

        int idade = 27;



        if(idade <15 ){
            System.out.println("Categoria infantil ");
        }else if (idade >= 15 && idade < 18){
            System.out.println("Categoria juvenil");
        }else{
            System.out.println("Categoria adulto");
        }



    }
}
