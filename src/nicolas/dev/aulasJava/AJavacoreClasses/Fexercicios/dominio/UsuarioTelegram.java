package nicolas.dev.aulasJava.AJavacoreClasses.Fexercicios.dominio;

public class UsuarioTelegram {
    private int chatId;
    private String userName;
    private String focoDePesquisa;
    private boolean isAdmin;

    public UsuarioTelegram(int chatId, String userName){
        this.chatId = chatId;
        this.userName = userName;
        this.focoDePesquisa = "Global";
        this.isAdmin = false;
    }

    public UsuarioTelegram(int chatId, String userName, String focoDePesquisa){
        this(chatId,userName);
        this.focoDePesquisa = focoDePesquisa;
        this.isAdmin = false;
    }

    public UsuarioTelegram(int chatId, String userName, String focoDePesquisa, boolean isAdmin){
        this(chatId, userName, focoDePesquisa);
        this.isAdmin = isAdmin;
    }

    public void imprime(){
        System.out.println(this.chatId);
        System.out.println(this.userName);
        System.out.println(this.focoDePesquisa);
        if(this.isAdmin){
            System.out.println("Painel admmin liberado");
        }else{
            System.out.println("Usuario comum");
        }
    }


}
