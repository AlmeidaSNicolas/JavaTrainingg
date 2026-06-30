package nicolas.dev.aulasJava.AJavacoreClasses.Iherença.ExTurismo.Atividades;

import nicolas.dev.aulasJava.AJavacoreClasses.Iherença.ExTurismo.Core.ExperienciaNatureza;

public class TrilhaGuiada extends ExperienciaNatureza {

    private double distanciaKm;

    public TrilhaGuiada(String nomeDaRota, int limiteParticipantes, double distanciaKm){
        super(nomeDaRota, limiteParticipantes);
        this.distanciaKm = distanciaKm;
    }

    public void imprimirRelatorio(){
        System.out.println("Sua distancia é de : " + this.distanciaKm + " rota escolhida : " + super.nomeDaRota + " com um limite de participantes de : " + super.limiteParticipantes);
    }


}
