package nicolas.dev.aulasJava.AJavacoreClasses.BintroduçãoMetodos.dominio.Api;

public class ApiResponse {
    private int statusCode;
    private String message;

    public ApiResponse(int statusCode, String message){
        this.message = message;
        this.statusCode = statusCode;
    }

    public int getStatusCode(){
        return statusCode;
    }

    public String getMessage(){
        return message;
    }
}
