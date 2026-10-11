package nicolas.dev.aulasJava.AJavacoreClasses.Api;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {
    private int statusCode;
    private String message;



    public int getStatusCode(){
        return statusCode;
    }

    public String getMessage(){
        return message;
    }
}
