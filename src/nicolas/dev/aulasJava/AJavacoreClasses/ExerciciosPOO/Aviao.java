package nicolas.dev.aulasJava.AJavacoreClasses.ExerciciosPOO;

public class Aviao {
    private int id;
    private String numeroDoVoo;
    private String destino;
    private String status;

    public Aviao(int id, String numeroDoVoo, String destino, String status){
        this.id = id;
        this.numeroDoVoo = numeroDoVoo;
        this.destino = destino;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroDoVoo() {
        return numeroDoVoo;
    }

    public void setNumeroDoVoo(String numeroDoVoo) {
        this.numeroDoVoo = numeroDoVoo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



}
