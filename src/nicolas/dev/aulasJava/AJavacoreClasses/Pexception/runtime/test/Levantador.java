package nicolas.dev.aulasJava.AJavacoreClasses.Pexception.runtime.test;

public class Levantador {
    private String nome;
    private int assistenciasPerfeitas;
    private int totalTentativas;

    public Levantador(String nome, int assistenciasPerfeitas, int totalTentativas) {
        this.nome = nome;
        this.assistenciasPerfeitas = assistenciasPerfeitas;
        this.totalTentativas = totalTentativas;
    }

    public String getNome() {
        return nome;
    }
    public int getAssistenciasPerfeitas() {
        return assistenciasPerfeitas;
    }
    public int getTotalTentativas() {
        return totalTentativas;
    }

    public void registrarLevantamento(boolean foiPerfeito){
        if(totalTentativas < 0){
            throw new EstatisticaInvalidaException("Numero de tentativas invalida, nao pode ser negativo");
        }
        totalTentativas++;
        if (foiPerfeito){
            ++totalTentativas;
            ++assistenciasPerfeitas;
            System.out.println(totalTentativas + " tentativas perfeitas");
            System.out.println(assistenciasPerfeitas + " assistencias perfeitas");
        }
    }
}
