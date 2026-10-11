package testeLombok.t1;

import lombok.CustomLog;

import static testeLombok.t1.testeProduto.imprimirDados;

public class lOJA {
    public static void main(String[] args) {
        testeProduto produto1 = new testeProduto("Arroz", 200, "10/11");

       imprimirDados(produto1);

    }
}
