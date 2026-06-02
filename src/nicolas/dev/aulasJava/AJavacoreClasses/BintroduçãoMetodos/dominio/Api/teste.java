package nicolas.dev.aulasJava.AJavacoreClasses.BintroduçãoMetodos.dominio.Api;

import java.util.List;

public class teste {
    public static void main(String[] args) {
        // 1. Inicia o servidor (instancia o controlador)
        UserController api = new UserController();

        System.out.println("\n--- TESTE 1: Cadastro com Sucesso ---");
        UserRequest req1 = new UserRequest("Nicolas", "nicolas@email.com");
        ApiResponse res1 = api.registrarUsuario(req1);
        System.out.println("Status: " + res1.getStatusCode() + " | Mensagem: " + res1.getMessage());

        System.out.println("\n---Teste 2: Cadastro com duplicidade");
        UserRequest req2 = new UserRequest("Nicolas", "nicolas@email.com");
        ApiResponse res2 = api.registrarUsuario(req2);
        System.out.println("Status: " + res2.getStatusCode() + " | Mensagem: " + res2.getMessage());

        System.out.println("\n---Teste 3: Cadastro com Nomes invalidos ----");
        UserRequest req3 = new UserRequest("", "teste3@gmail.com");
        ApiResponse res3 = api.registrarUsuario(req3);
        System.out.println("Status : " + res3.getStatusCode() + " | Mensagem: " + res3.getMessage());

        UserRequest req4= new UserRequest("Ana julia", "juba@gmail.com");
        ApiResponse res4 = api.registrarUsuario(req4);
        System.out.println("Status : " + res4.getStatusCode() + " | Mensagem: " + res4.getMessage());

        ApiResponse resDel = api.deletarUsuario(100);
        System.out.println("Status: " + resDel.getStatusCode() + " | Mensagem: " + resDel.getMessage());

        UserRequest req11 = new UserRequest("Nicolas2", "Email2@gmail.com");
        ApiResponse attUser = api.editarUsuario(0, req11);
        System.out.println("Status: " + attUser.getStatusCode() + " | Mensagem: " + attUser.getMessage());

        System.out.println("\n ----- Listagem de Usuarios : ");
        List<User> usuariosCadastrados = api.listarUsuarios();
        for(User u : usuariosCadastrados){
            System.out.println("ID: " + u.getId() + " | Nome: " + u.getNome() + " | Email: " + u.getEmail() + " | Ativo " + u.isAtivo());
        }


    }
}
