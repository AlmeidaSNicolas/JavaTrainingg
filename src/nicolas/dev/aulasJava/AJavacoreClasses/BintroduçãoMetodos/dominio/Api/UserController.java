package nicolas.dev.aulasJava.AJavacoreClasses.BintroduçãoMetodos.dominio.Api;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    private List<User> database = new ArrayList<>();
    private int idCounter;


    public ApiResponse registrarUsuario(UserRequest userRequest){
        if(userRequest.getNome() == null || userRequest.getNome().isEmpty() ||
           userRequest.getEmail() == null || userRequest.getEmail().isEmpty()
        ){
            return new ApiResponse(400, "Dados invalidos");
        }

        for(User u: database){
            if(u.getEmail().equals(userRequest.getEmail())){
                return new ApiResponse(400, "Email ja cadastrado");
            }
        }

       database.add(new User(idCounter++, userRequest.getNome(), userRequest.getEmail()));
        return new ApiResponse(201, "Registro realizado com sucesso");
    }

    public List<User> listarUsuarios(){
        return database;
    }

    public ApiResponse deletarUsuario(int id){
        User usuarioParaDeletar = null;
        for(User u: database){
            if(u.getId() == id){
                usuarioParaDeletar = u;
                break;
            }
        }
        if (usuarioParaDeletar != null) {
            database.remove(usuarioParaDeletar);
            return new ApiResponse(200, "Usuario removido com sucesso");
        }
        return new ApiResponse(404, "Usuario nao encontrado");
    }

    public ApiResponse editarUsuario(int id, UserRequest userRequest) {
        if ( userRequest.getNome() == null || userRequest.getNome().isEmpty() ||
             userRequest.getEmail() == null || userRequest.getEmail().isEmpty()) {
            return new ApiResponse(400, "Dados nao encontrados");
        }
        for (User u : database) {
            if (u.getId() == id) {
                u.setNome(userRequest.getNome());
                u.setEmail(userRequest.getEmail());
                return new ApiResponse(200, "Usuario editado com sucesso");
            }
        }
        return new ApiResponse(404, "Usuario nao encontrado");
    }

}
