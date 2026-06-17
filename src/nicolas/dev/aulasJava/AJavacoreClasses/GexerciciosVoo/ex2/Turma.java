package nicolas.dev.aulasJava.AJavacoreClasses.GexerciciosVoo.ex2;

import java.sql.SQLOutput;

public class Turma {
    Programador[] alunos = new Programador[30];

    public boolean matricularDev(Programador dev){
        String nome = dev.getNome();
        String matricula = dev.getMatricula();

        if(dev == null || nome == null || matricula == null ){
            System.out.printf("Nao é possivel realizar a matricula desse aluno, sua inscrição nao tem dados suficientes necessarios");
            return false;
        }
        for(int i = 0; i < alunos.length ; i++){
            if(alunos[i] == null){
                alunos[i] = dev;
            }
        }
        System.out.println("Inscrição realizada com sucesso");
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        return true;
    }


}
