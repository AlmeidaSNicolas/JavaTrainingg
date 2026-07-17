package nicolas.dev.aulasJava.SuperExercicioGemini.domain;

public class Voo {
    private String codigo;
    private StatusVoo status;
    private Aeronave aeronave;
    private Piloto piloto;



    private Comissario[] comissarios = new Comissario[4];
    private int contadorComissarios = 0;


    private static int totalVoosRegistrados = 0;

    public Voo(String codigo) {
        this.codigo = codigo;
        this.status = StatusVoo.AGENDADO;
        Voo.totalVoosRegistrados++;
    }

    public void adicionarComissario(Comissario c){
        if(contadorComissarios >= 4){
            throw new RuntimeException("Erro: Limite máximo de 4 comissários excedido no voo " + this.codigo);
        }

        this.comissarios[contadorComissarios] = c;
        contadorComissarios++;
    }

    public void iniciarVoo(){
        if(this.piloto == null || this.aeronave == null){
            throw new RuntimeException("Erro: Não há piloto ou aeronave designados para o voo " + this.codigo);
        }
        this.status = StatusVoo.EM_ANDAMENTO;
        System.out.println("Voo " + this.codigo + " iniciado com sucesso!");
    }

    public static int getTotalVoosRegistrados() { return totalVoosRegistrados; }
    public String getCodigo() { return codigo; }
    public void setAeronave(Aeronave aeronave) { this.aeronave = aeronave; }
    public void setPiloto(Piloto piloto) { this.piloto = piloto; }
}