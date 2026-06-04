```markdown
# ☕ Jornada Java: Da Sintaxe ao Backend Comercial

Bem-vindo ao meu laboratório de estudos em Java! Sou desenvolvedor focado no ecossistema TypeScript/React e decidi expandir meu arsenal técnico dominando o ecossistema Java. Este repositório é o registro da minha evolução diária, saindo dos conceitos básicos de sintaxe até a estruturação de arquiteturas de software backend robustas.

O objetivo final dessa jornada é consolidar uma base sólida em Programação Orientada a Objetos (POO) e manipulação de dados na memória antes de dar o próximo grande passo: o ecossistema Spring Boot.

---

## 🛠️ O Que Estou Estudando?
Minha trilha de aprendizado está organizada de forma incremental. Atualmente, os tópicos dominados e aplicados nos códigos deste repositório incluem:

* **Fundamentos Básicos e Estruturais:** Tipos primitivos, estruturas condicionais e de repetição.
* **Orientação a Objetos (POO):** Classes, atributos, encapsulamento rigoroso, métodos getters/setters, construtores personalizados e polimorfismo.
* **Manipulação Avançada de Dados:** Transição de arrays fixos para coleções dinâmicas utilizando `List` e `ArrayList`.
* **Padrões de Mercado (Clean Code):** Separação de responsabilidades em múltiplos arquivos, estruturação profissional de pacotes (*packages*) e convenções CamelCase.

---

## 🏛️ Por que Estudar Arquitetura de Software?
Dominar a sintaxe de uma linguagem é apenas o primeiro passo. Construir sistemas comerciais exige ir além de simplesmente "fazer o código funcionar". O estudo de **Arquitetura de Software** se tornou um pilar central nesta jornada pelos seguintes motivos:

1. **Desacoplamento e Manutenibilidade:** Em aplicações reais, o código muda constantemente. Uma boa arquitetura garante que alterar uma regra de negócio ou um banco de dados não quebre o sistema inteiro.
2. **Preparação para o ecossistema Spring:** O Spring Boot utiliza intensamente padrões como injeção de dependências, inversão de controle (IoC) e o padrão MVC (Model-View-Controller). Entender esses conceitos teoricamente e na prática "pura" (Vanilla Java) evita que o framework pareça "mágica" e me torna um desenvolvedor muito mais analítico.
3. **Escalabilidade:** Estruturar o software pensando em camadas (como Controladores, Serviços, Repositórios e DTOs) permite que a aplicação cresça de forma ordenada, facilitando o trabalho em equipe e a inclusão de novos recursos sem gerar débito técnico.

---

## 🌿 Estratégia de Branches (Organização das Aulas)
A partir de hoje, para manter o repositório organizado e simular um fluxo de trabalho profissional do mundo real, adotei uma estratégia de **múltiplas branches isoladas** para cada módulo, aula ou grande grupo de exercícios.

### Como vai funcionar?
* **Branch `main`:** Atuará como a linha de produção estável, contendo os projetos consolidados e as estruturas macro da jornada.
* **Branches Temáticas (`feat/aula-X-nome-do-topico`):** Cada nova aula ou treino prático ganhará sua própria branch dedicada (ex: `feat/aula-interfaces`, `feat/exercicios-solid`, `feat/tratamento-excecoes`).

### Vantagens dessa abordagem:
* **Histórico de Evolução Claro:** Consigo rastrear exatamente o que aprendi e implementei em cada dia ou bloco de estudos.
* **Prática de Git Avançada:** Reforça o uso cotidiano de comandos como `git checkout`, `git merge` e resolução de conflitos, habilidades indispensáveis para o dia a dia de um desenvolvedor backend.
* **Sandbox Isolado:** Posso errar, refatorar e testar conceitos complexos sem poluir o código que já está funcionando na `main`.

---

## 🚀 Destaque do Repositório: Mock API REST 
O projeto mais maduro dessa pasta é uma API REST Mockada desenvolvida puramente em Java, sem a utilização de frameworks (como Spring). O objetivo foi simular o comportamento de um servidor real para entender como os dados trafegam por baixo dos panos no ecossistema de backend.

### 📐 Arquitetura do Mini-Projeto
O código foi desacoplado em arquivos isolados por responsabilidade, simulando um padrão arquitetural de mercado:
* `User.java`: Entidade que representa o modelo de dados que seria persistido no banco.
* `UserRequest.java`: DTO (Data Transfer Object) para trafegar os payloads enviados pelo cliente com segurança.
* `ApiResponse.java`: Envelopamento padrão de respostas contendo `statusCode` e `message`.
* `UserController.java`: O "coração" da API. Controla as rotas de cadastro (POST), listagem (GET), edição (PUT) e exclusão (DELETE).

### 🧠 Desafios Vencidos Nesse Projeto
* **Validações em Escopo:** Métodos de validação de e-mails duplicados e dados nulos antes da criação do usuário.
* **A Pegadinha da Exclusão:** Resolução do clássico erro `ConcurrentModificationException` ao tentar remover itens de uma lista sendo percorrida por um loop *for-each*, resolvido com a estratégia de isolamento do objeto alvo fora do escopo.
* **Códigos de Status HTTP:** Implementação das convenções mundiais de respostas (201 Created, 200 OK, 400 Bad Request e 404 Not Found).

---

📁 Estrutura do Repositório
src/
└── nicolas/dev/aulasJava/
    ├── AJavacoreClasses/
    │   └── dominio/
    │       └── Api/          # 🚀 Mini-projeto da API REST Mockada
    │           ├── Main.java
    │           ├── User.java
    │           ├── UserRequest.java
    │           ├── ApiResponse.java
    │           └── UserController.java
    └── [Outros treinos e exercícios de lógica e fundamentos]