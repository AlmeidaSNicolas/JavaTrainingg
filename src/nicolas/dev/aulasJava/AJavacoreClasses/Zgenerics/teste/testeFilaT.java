package nicolas.dev.aulasJava.AJavacoreClasses.Zgenerics.teste;

import nicolas.dev.aulasJava.AJavacoreClasses.Zgenerics.Service.FilaService;
import nicolas.dev.aulasJava.AJavacoreClasses.Zgenerics.dominio.Cliente;

import java.util.ArrayList;
import java.util.List;

public class testeFilaT {
    public static void main(String[] args) {


        FilaService<Cliente> fila = new FilaService<>();
        fila.estaVazia();
        fila.tamanho();
        fila.entrar(new Cliente("Nicolas"));
        fila.entrar(new Cliente("Pedroca"));
        fila.entrar(new Cliente("hecto"));


        fila.chamarProximo();
        fila.tamanho();
        fila.estaVazia();

    }
}
