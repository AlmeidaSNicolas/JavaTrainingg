package nicolas.dev.aulasJava;

public class EstruturasCondicionais {
    public static void main(String[] args) {

        int idade = 12;
        boolean estaAutorizado = idade >=  18;

        if(estaAutorizado){
            System.out.println("Voce pode comprar, aproveite");
        }

        if(!estaAutorizado){
            System.out.println("Voce nao pode comprar bebida");
        }

       double salario = 6000;
       String mensagemDoar = "Eu vou doar 50tinha pro devDojo";
       String mensagemNaoDoar = "Sou muquirana e nao doarei";

       String Resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;



       System.out.println(Resultado);
    }
}
