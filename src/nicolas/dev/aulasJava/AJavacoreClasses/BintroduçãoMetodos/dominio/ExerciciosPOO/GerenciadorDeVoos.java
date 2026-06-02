package nicolas.dev.aulasJava.AJavacoreClasses.BintroduçãoMetodos.dominio.ExerciciosPOO;

public class GerenciadorDeVoos {
    Aviao[] avioes = new Aviao[10];

    public void adicionarVoo(Aviao aviao){
        for(int i = 0; i < avioes.length; i++){
            if(avioes[i] == null){
                avioes[i] = aviao;
                System.out.println("Aviao adicionado");
                break;
            }
        }
    }

    public void listarVoos(){
        for(int i = 0; i < avioes.length; i++){
            if(avioes[i] != null){
                System.out.println("Dados da aeronave : " + avioes[i].getId() + "| Destino : " + avioes[i].getDestino() );
            }
        }
    }

    public Aviao buscarVoo(int id){
        for(int i = 0; i < avioes.length; i++){
            if(avioes[i] != null && avioes[i].getId() == id ){
                return avioes[i];
            }
        }
        return null;
    }

    public void atualizarStatus(int id, String novoStatus){
        for(int i = 0; i < avioes.length; i++){
            if(avioes[i] != null && avioes[i].getId() == id){
                avioes[i].setStatus(novoStatus);
                System.out.println("Status atualizado com sucesso");
                break;
            }
        }
    }

    public void removerVoo(int id){
        for(int i = 0; i < avioes.length; i++){
            if(avioes[i] != null && avioes[i].getId() == id){
                avioes[i] = null;
                break;
            }
        }
    }

}
