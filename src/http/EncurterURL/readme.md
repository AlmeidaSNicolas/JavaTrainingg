# Native Java HTTP URL Shortener

Um encurtador de URLs resiliente, construído do zero utilizando apenas Java Core nativo, sem dependências de frameworks externos (como Spring Boot). O projeto explora a criação de servidores HTTP nativos com a API com.sun.net.httpserver, concorrência e persistência de dados em disco com Java NIO.2.

---

## 🚀 Arquitetura e Decisões de Design

### 1. Servidor HTTP Nativo (com.sun.net.httpserver)
A aplicação utiliza o servidor HTTP embutido da JDK, mapeando endpoints através de implementações da interface HttpHandler. Todo o ciclo de vida das requisições e respostas (validação de métodos HTTP, leitura de streams de entrada e escrita de headers) é gerenciado manualmente via HttpExchange.

### 2. Estrutura em Memória (ConcurrentHashMap)
Para garantir alta performance e thread-safety no acesso concorrente, as URLs encurtadas são mantidas em um ConcurrentHashMap<String, String>. As buscas de código para redirecionamento ocorrem com complexidade O(1) sem causar gargalos de I/O de disco por requisição.

### 3. Persistência de Dados (java.nio.file)
O armazenamento permanente é realizado em arquivo texto (app/storage/urls.txt) utilizando manipuladores NIO.2 (Path, Files, BufferedWriter com StandardOpenOption.APPEND).
* Inicialização Idempotente: O método de inicialização valida a existência de diretórios e arquivos com Files.notExists() para evitar exceções FileAlreadyExistsException.
* Recuperação de Estado: Ao reiniciar o servidor, o arquivo é lido linha a linha e o estado da aplicação é completamente restaurado no mapa de memória.

---

## 🛠️ Endpoints da Aplicação

### 1. Encurtar URL
* Rota: POST /encurtar
* Descrição: Recebe a URL original no corpo da requisição, gera um identificador único de 6 caracteres via UUID, persiste em disco e retorna o link encurtado.
* Headers: Content-Type: text/plain; charset=utf-8
* Status HTTP:
    * 200 OK — Sucesso na geração do link.
    * 405 Method Not Allowed — Método HTTP diferente de POST.

Exemplo de requisição via cURL:
curl -X POST -d "https://github.com/nicolas" http://localhost:8080/encurtar

---

### 2. Redirecionamento
* Rota: GET /r/{codigo}
* Descrição: Extrai o código da URI, realiza a busca no mapa de memória e redireciona o cliente para a URL original.
* Status HTTP:
    * 302 Found — Redirecionamento bem-sucedido via cabeçalho Location.
    * 404 Not Found — Código encurtado não encontrado.
    * 405 Method Not Allowed — Método HTTP diferente de GET.

Exemplo de navegação:
Acessar no navegador: http://localhost:8080/r/a1b2c3

---

## 💻 Como Rodar o Projeto

### Pré-requisitos
* Java JDK 17 ou superior instalado.
* Git.

### Passos
1. Clone o repositório:
   git clone https://github.com/SEU_USUARIO/SEU_REPOSITORIO.git
2. Abra o projeto na sua IDE Java (IntelliJ IDEA, Eclipse, VS Code).
3. Execute a classe principal http.EncurterURL.UrlShortenerService.
4. O servidor iniciará na porta 8080:
   Servidor HTTP rodando na porta 8080...

---

## 🧪 Testando com o cURL

# 1. Encurtar uma nova URL
curl -X POST -d "https://youtube.com/StackDoAlmeida" http://localhost:8080/encurtar

# 2. Testar o redirecionamento (Inspecionar cabeçalhos HTTP)
curl -i http://localhost:8080/r/CODIGO_GERADO

# 3. Testar rota 404 (Código inexistente)
curl -i http://localhost:8080/r/999999

---

## ✒️ Autor
Desenvolvido por Nicolas Sales de Almeida.