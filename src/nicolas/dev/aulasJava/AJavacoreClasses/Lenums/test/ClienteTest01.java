package nicolas.dev.aulasJava.AJavacoreClasses.Lenums.test;

import nicolas.dev.aulasJava.AJavacoreClasses.Lenums.dominio.Cliente;
import nicolas.dev.aulasJava.AJavacoreClasses.Lenums.dominio.MetodoPagamento;
import nicolas.dev.aulasJava.AJavacoreClasses.Lenums.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Joao", TipoCliente.PESSOA_FISICA, MetodoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Maria", TipoCliente.PESSOA_JURIDICA, MetodoPagamento.CREDITO);


        System.out.println(cliente1);
        System.out.println(cliente2);

    }
}
