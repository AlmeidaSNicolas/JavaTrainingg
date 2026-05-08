package nicolas.dev.aulasJava;

public class aula04Operadores {
    public static void main(String[] args) {

        //operadores aritimeticos nos permitem realizar contas etc sendo eles: + - / *

        int numero1 = 10;
        int numero2 = 20;
        String valor = "valor";
        System.out.println(" é o valor" + numero2 + numero1 );

        boolean isVinteEqualsDez = 20 >= 10;
        boolean is2maiorQueUm = 2 > 1;

        //operadores logicos sao: && (AND) || (OR) !

        int idade = 21;
        float salario = 5000;
        boolean temPassaporte = true;
        boolean temFaculdade = true;

        if(temPassaporte == false && temFaculdade == true){
            System.out.println("Voce esta apto");
        }else if(temPassaporte == true && temFaculdade ==false){
            System.out.println("Voce nao esta apto para adentrar em nossa empresa");
        }

        if (idade <= 21 && salario < 4000){
            System.out.println("Voce infelizmente é muito novo e recebe muito pouco para trabalhar conosco");
        }else{
            System.out.println("Bem vindo a empresa ");
        }


        double valorContaCorrent = 200;
        double valorContaPoupanca = 4500;
        float valorPlaystation = 5000f;

        boolean isPlayCompravel = valorContaCorrent > valorPlaystation || valorContaPoupanca > valorPlaystation;

        System.out.println("isPlayCompravel: " + isPlayCompravel);



        double bonus = 2000;
        bonus += 1000;

        System.out.println(bonus);

        //

        // ++ --
        int contador = 0;
        contador += 1;
        contador++;

        System.out.println(++contador);

        ////ex

            double preco = 2000;
            double porcentagem = 10;

            double valorDesconto = preco * porcentagem / 100;
            double precoFinal = preco - valorDesconto;
            boolean temDesconto = true;
            boolean temCupom = false;

            if(!temDesconto && porcentagem > 0 || temCupom) {
                System.out.println("Desconto aplicado de: " + porcentagem);
            }else {
                System.out.println("Nao teve descontos aplicados, seu valor é " + preco);
                return;
            }

            System.out.println("precoFinal: " + precoFinal);



    }


}