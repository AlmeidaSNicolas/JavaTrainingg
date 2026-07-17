package nicolas.dev.aulasJava.Desafios.ArraylistsPolimorficas.ArraysListasPolimorficas;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    public static void main(String[] args) {

        List<String> tarefas = new ArrayList<>();

        tarefas.add("Acordar");
        tarefas.add("Sair pra treinar calistenia");
        tarefas.add("Correr 6km");
        tarefas.add("AlmoçaoGraudo");
        tarefas.add("Domrir e estudar depois");

        System.out.println("Suas tarefas " + tarefas);

        System.out.println("Primeira tarefa : " + tarefas.get(0));
        System.out.println("Ultima tarefa : " + tarefas.get(3));

        for(String tarefa : tarefas){
            System.out.println(tarefa);
        }


    }
}
