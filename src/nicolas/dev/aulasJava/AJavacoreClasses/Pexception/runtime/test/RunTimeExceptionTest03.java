package nicolas.dev.aulasJava.AJavacoreClasses.Pexception.runtime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao(){
        try{
            System.out.println("Abrindo");
            System.out.println("Inserindo dados");
            return "Conexão aberta";
        }catch(Exception e)
        {
            e.printStackTrace();
        }finally {
            System.out.println("Fechando recurso do SO");
        }
        return null;
    }
}
