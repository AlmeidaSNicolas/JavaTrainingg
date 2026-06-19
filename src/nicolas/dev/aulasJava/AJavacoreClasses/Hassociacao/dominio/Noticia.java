package nicolas.dev.aulasJava.AJavacoreClasses.Hassociacao.dominio;

public class Noticia {
    private String titulo;
    private String conteudo;
    private String categoria;

    public Noticia(String titulo, String conteudo, String categoria) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


}
