package nicolas.dev.aulasJava.AJavacoreClasses.Fexercicios.dominio;

public class fontes {
    private String nome;
    private String url;
    private String paisOrigem;
    private int nivelDeConfiabilidade; //travar de 1 a 5;


    public fontes(String nome, String url){
        this.nome = nome;
        this.url = url;
        this.paisOrigem = "Desconhecido";
        this.nivelDeConfiabilidade = 3;
    }

    public fontes(String nome, String url, String paisOrigem){
        this(nome, url);
        this.paisOrigem = paisOrigem;
    }

    public fontes(String nome, String url, String paisOrigem, int nivelDeConfiabilidade){
        this(nome,url,paisOrigem);
        this.nivelDeConfiabilidade = nivelDeConfiabilidade;
    }

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.url);
        System.out.println(this.paisOrigem);
        System.out.println(this.nivelDeConfiabilidade);
    }
}
