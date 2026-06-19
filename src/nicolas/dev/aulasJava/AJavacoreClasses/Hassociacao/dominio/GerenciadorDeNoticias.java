package nicolas.dev.aulasJava.AJavacoreClasses.Hassociacao.dominio;

import java.util.ArrayList;
import java.util.Arrays;

public class GerenciadorDeNoticias {

    static {
        System.out.println("Iniciando nova noticia");
    }

    ArrayList<Noticia> Noticias = new ArrayList<>();

    public void adicionarNoticia(Noticia n) {
        // 1. Fail Fast de segurança para evitar erro de NullPointerException
        if (n == null || n.getTitulo() == null) {
            System.out.println("Não consigo adicionar notícias nulas ou sem título.");
            return; // O 'return' encerra a execução do método imediatamente aqui
        }

        // 2. Variável de controle para checar duplicata
        boolean duplicada = false;

        // 3. Percorre a lista para comparar o título da nova notícia com as que já existem
        for (Noticia noticiaExistente : Noticias) {
            if (noticiaExistente.getTitulo().equals(n.getTitulo())) {
                duplicada = true;
                break; // Já descobrimos que é duplicada, então paramos o laço mais cedo
            }
        }

        // 4. Decisão final com base na checagem
        if (duplicada) {
            System.out.println("Notícia já existe! Não consigo adicionar notícias duplicadas.");
        } else {
            Noticias.add(n);
            System.out.println("Notícia adicionada com sucesso.");
        }
    }

    public void listarNoticas() {
        if (Noticias.isEmpty()) {
            System.out.println("Nao consigo listar noticias vazias");
        } else {
            System.out.println("Noticias listadas Abaixo");
            System.out.println("------------");
            for (Noticia n : Noticias) {
                System.out.println("Titulo " + n.getTitulo());
                System.out.println("Conteudo " + n.getConteudo());
                System.out.println("Categoria " + n.getCategoria());
                System.out.println("---------------");
            }
            System.out.println("Noticias Listadas com sucesso");
        }

    }

    public void quantidadeDeNoticias(){
        if(Noticias.isEmpty()){
            System.out.println("Nao há noticias para Listar");
        }else{
        System.out.println("Quantidade de noticias" +  ": "  + Noticias.size());
            System.out.println();
    }
    }

    public void buscarPorCategoria(String categoria){
        boolean encontrou = false;

        for (Noticia n : Noticias) {
            if (n.getCategoria().equals(categoria)){
                encontrou = true;
                System.out.printf("Dados da noticia %n" + n.getTitulo() );
                System.out.printf( "%n" + n.getConteudo());
                System.out.printf( "%n" + n.getCategoria());
                System.out.println();
                System.out.println("---------");
            }
        }

        if(!encontrou){
            System.out.println("Categoria inexistente/invalida");
        }
    }

    public void removerNoticias(String titulo){
        for(Noticia n: Noticias){
            if (new String(titulo).equals(n.getTitulo())) {
                Noticias.remove(n);
                System.out.println("Removido com sucesso");
                break;
            }
        }
    }

    public void limparFeedDoDia(){
        Noticias.clear();
        System.out.println("Limpando Feed Diario");
    }

}
