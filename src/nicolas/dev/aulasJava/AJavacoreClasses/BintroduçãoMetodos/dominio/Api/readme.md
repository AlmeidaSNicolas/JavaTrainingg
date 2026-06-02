🚀 Mock API REST com Java Puro (POO)
Um projeto prático desenvolvido em Java puro para simular o comportamento, a arquitetura e o fluxo de dados de um CRUD completo em uma API REST, sem a necessidade de frameworks externos (como Spring Boot). O objetivo principal foi aplicar conceitos de Programação Orientada a Objetos (POO) combinados com padrões de arquitetura de software de mercado.

📌 O que foi aprendido e aplicado?
Arquitetura Baseada em Request/Response: Separação clara entre o que o cliente envia (UserRequest), o processamento das regras de negócio (UserController) e o que o servidor devolve (ApiResponse).

Encapsulamento e Data Transfer Object (DTO): Isolamento da entidade de banco de dados (User) das classes de tráfego de dados (UserRequest), garantindo segurança, controle e impedindo que o cliente altere dados sensíveis diretamente.

Gerenciamento Dinâmico de Memória com Coleções: Substituição de arrays fixos pela interface List e a implementação ArrayList, permitindo que o banco de dados em memória cresça e diminua dinamicamente.

Controle de Fluxo e Modificação Concorrente: Resolução do comportamento de loops ao lidar com remoção de itens em listas (ConcurrentModificationException) através da estratégia de isolamento do objeto alvo.

Convenções HTTP Mundiais: Implementação de códigos de status oficiais do protocolo HTTP (201 Created para sucesso, 200 OK para atualizações/deleções bem-sucedidas e 404 Not Found para registros não encontrados).

📐 Estrutura do Projeto
A arquitetura foi dividida em arquivos separados por responsabilidade, simulando a estrutura de um ecossistema backend real:


```
src/
└── nicolas/dev/aulasJava/AJavacoreClasses/dominio/Api/
├── Main.java            # Inicializa o "servidor" e simula as requisições HTTP (GET, POST, PUT, DELETE)
├── User.java            # Entidade principal que representa o usuário no banco
├── UserRequest.java     # Dados de entrada (payload enviado pelo cliente para cadastro/edição)
├── ApiResponse.java     # Estrutura padrão de resposta da API (Status e Mensagem)
└── UserController.java  # Rotas e regras de negócio (Validações, persistência e manipulação)
```
🛠
️ Regras de Negócio e Endpoints Implementados
O UserController gerencia o estado dos dados através dos seguintes métodos simulados:

```
1. Criar Usuário (POST) -> registrarUsuario(UserRequest)
   Valida se os campos estão nulos ou vazios, retornando status 400 (Dados inválidos).

Varre o banco de dados para impedir e-mails duplicados, retornando status 400 (Email ja cadastrado).

Gera um ID auto-incrementado (idCounter++), salva o usuário no ArrayList e retorna status 201.

2. Listar Usuários (GET) -> listarUsuarios()
   Expõe a lista database de forma controlada para que a Main possa renderizar os dados dos usuários ativos no console.

3. Editar Usuário (PUT) -> editarUsuario(int id, UserRequest)
   Valida se os novos dados enviados são válidos (status 400).

Busca o usuário pelo ID trafegado. Se encontrado, altera as informações usando os métodos setters da entidade e retorna status 200 (Usuario editado com sucesso).

Garante que a lista toda seja percorrida antes de determinar se o ID existe ou não, evitando retornos precoces. Caso não encontre, retorna status 404.

4. Deletar Usuário (DELETE) -> deletarUsuario(int id)
   Busca o usuário correspondente ao ID.
```

Aplica a estratégia de armazenar o objeto alvo fora do escopo do loop para evitar erros de concorrência ao usar o método .remove().

Retorna status 200 (Usuario removido com sucesso) se deletado, ou status 404 (Usuario nao encontrado) se o ID for inválido.

```
💻 Exemplo de Saída no Console (Main)
Ao rodar a classe principal com todos os cenários de teste, o comportamento simulado do servidor entrega o seguinte resultado:

Plaintext
--- TESTE 1: Cadastro com Sucesso ---
Status: 201 | Mensagem: Registro realizado com sucesso

--- TESTE 2: Tentando cadastrar o mesmo e-mail ---
Status: 400 | Mensagem: Email ja cadastrado

--- TESTE 3: Cadastro com dados inválidos (Nome vazio) ---
Status: 400 | Mensagem: Dados invalidos

--- LISTAGEM DE USUÁRIOS CADASTRADOS ---
ID: 0 | Nome: Nicolas | E-mail: nicolas@email.com | Ativo: false

--- TESTE 4: Atualizar Usuário ---
Status: 200 | Mensagem: Usuario editado com sucesso

--- TESTE 5: Testando o Erro 404 na Edição ---
Status: 404 | Mensagem: Id nao encontrado

--- TESTE 6: Deletar Usuário ---
Status: 200 | Mensagem: Usuario removido com sucesso

--- TESTE 7: Testando o Erro 404 na Deleção ---
Status: 404 | Mensagem: Usuario nao encontrado
```