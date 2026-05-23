☕ Jornada Java: Da Sintaxe ao Backend Comercial
Bem-vindo ao meu laboratório de estudos em Java! Sou desenvolvedor focado no ecossistema TypeScript/React e decidi expandir meu arsenal técnico dominando o ecossistema Java. Este repositório é o registro da minha evolução diária, saindo dos conceitos básicos de sintaxe até a estruturação de arquiteturas de software backend robustas.

O objetivo final dessa jornada é consolidar uma base sólida em Programação Orientada a Objetos (POO) e manipulação de dados na memória antes de dar o próximo grande passo: o ecossistema Spring Boot.

🛠️ O Que Estou Estudando?
Minha trilha de aprendizado está organizada de forma incremental. Atualmente, os tópicos dominados e aplicados nos códigos deste repositório incluem:

Fundamentos Básicos e Estruturais: Tipos primitivos, estruturas condicionais e de repetição.

Orientação a Objetos (POO): Classes, atributos, encapsulamento rigoroso, métodos getters/setters, construtores personalizados e polimorfismo.

Manipulação Avançada de Dados: Transição de arrays fixos para coleções dinâmicas utilizando List e ArrayList.

Padrões de Mercado (Clean Code): Separação de responsabilidades em múltiplos arquivos, estruturação profissional de pacotes (packages) e convenções CamelCase.

🚀 Destaque do Repositório: Mock API REST (CRUD)
O projeto mais maduro dessa pasta é uma API REST Mockada desenvolvida puramente em Java, sem a utilização de frameworks (como Spring). O objetivo foi simular o comportamento de um servidor real para entender como os dados trafegam por baixo dos panos no ecossistema de backend.

📐 Arquitetura do Mini-Projeto
O código foi desacoplado em arquivos isolados por responsabilidade, simulando um padrão arquitetural de mercado:

User.java: Entidade que representa o modelo de dados que seria persistido no banco.

UserRequest.java: DTO (Data Transfer Object) para trafegar os payloads enviados pelo cliente com segurança.

ApiResponse.java: Envelopamento padrão de respostas contendo statusCode e message.

UserController.java: O "coração" da API. Controla as rotas de cadastro (POST), listagem (GET), edição (PUT) e exclusão (DELETE).

🧠 Desafios Vencidos Nesse Projeto
Validações em Escopo: Métodos de validação de e-mails duplicados e dados nulos antes da criação do usuário.

A Pegadinha da Exclusão: Resolução do clássico erro ConcurrentModificationException ao tentar remover itens de uma lista sendo percorrida por um loop for-each, resolvido com a estratégia de isolamento do objeto alvo fora do escopo.

Códigos de Status HTTP: Implementação das convenções mundiais de respostas (201 Created, 200 OK, 400 Bad Request e 404 Not Found).

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
    
💻 Saída Esperada dos Testes (Console)
(Só testando pra descobrir)

Estudos em constante atualização. Rumo ao Spring Boot! 🚀
