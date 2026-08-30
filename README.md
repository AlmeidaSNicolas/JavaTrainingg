# ☕ Jornada Java: Da Sintaxe ao Backend Comercial

Bem-vindo ao meu laboratório de estudos em Java! Sou desenvolvedor focado no ecossistema TypeScript/React e decidi expandir meu arsenal técnico dominando o ecossistema Java. Este repositório é o registro da minha evolução diária, saindo dos conceitos básicos de sintaxe até a estruturação de arquiteturas de software backend robustas.

O objetivo final dessa jornada é consolidar uma base sólida em Programação Orientada a Objetos (POO), API Core do Java e manipulação de dados na memória antes de dar o próximo grande passo: o ecossistema **Spring Boot**.

> 📺 A trilha teórica segue o curso **Maratona Java (DevDojo)** — com cada conceito reforçado por exercícios e desafios práticos neste repositório.

---

## 🗺️ Roadmap de Aprendizado

Um panorama rápido do que já foi dominado e do que vem pela frente. Serve tanto de bússola pra mim quanto de vitrine pra quem chega no repo.

| Status | Módulo |
| :---: | :--- |
| ✅ | Fundamentos (tipos primitivos, condicionais, laços de repetição) |
| ✅ | POO — Classes, atributos, encapsulamento, getters/setters |
| ✅ | Sobrecarga de métodos e Construtores personalizados |
| ✅ | Associação entre classes |
| ✅ | Herança, Sobrescrita de métodos e Modificador `final` |
| ✅ | Enums, Classes Abstratas, Interfaces e Polimorfismo |
| ✅ | Coleções (`List`, `ArrayList`) + desafios com generics e polimorfismo |
| ✅ | Testes automatizados (JUnit) e uso do Lombok |
| ✅ | Tratamento de Exceções (checked/unchecked, `finally`, exceções customizadas) |
| ✅ | **Core API & Classes Utilitárias (Wrapper Classes, Strings, Dates & Java Time API)** |
| 🔄 | **Manipulação de Recursos & I/O** |
| ⏳ | Generics avançado, Streams & Lambdas |
| ⏳ | Próximo grande salto: **Spring Boot** |

---

## 🛠️ Tópicos Dominados

Os conceitos abaixo já estão aplicados nos códigos deste repositório:

* **Fundamentos Básicos e Estruturais:** Tipos primitivos, estruturas condicionais e de repetição.
* **Orientação a Objetos (POO):** Classes, atributos, encapsulamento rigoroso, getters/setters, sobrecarga de métodos, construtores personalizados e associação entre objetos.
* **Hierarquia e Abstração:** Herança, sobrescrita de métodos, modificador `final`, classes abstratas, interfaces e polimorfismo.
* **Enums:** Modelagem de conjuntos fixos de constantes com comportamento.
* **Manipulação de Dados em Memória:** Transição de arrays fixos para coleções dinâmicas com `List` e `ArrayList`, incluindo desafios que combinam coleções e polimorfismo.
* **Tratamento de Exceções:** Diferença entre exceções *checked* e *unchecked*, lançamento controlado, bloco `finally` e criação de exceções personalizadas de domínio.
* **Classes Utilitárias e API Moderna de Datas:**
    * **Wrapper Classes:** Autoboxing, unboxing e comportamento de tipos primitivos envelopados.
    * **Strings & Imutabilidade:** Comportamento de manipulação de textos no Heap e String Pool.
    * **Java Time API (`java.time`):** Uso de `LocalDate`, `LocalTime`, `LocalDateTime`, timestamps universais com `Instant` (UTC/Zulu Time), medição de intervalos com `Duration` e formatação customizada via `DateTimeFormatter`.
* **Qualidade e Ferramental:** Testes automatizados com **JUnit**, uso do **Lombok** para reduzir boilerplate e organização profissional em pacotes (*packages*) seguindo convenções Java.

---

## 🏛️ Por que Estudar Arquitetura de Software?

Dominar a sintaxe de uma linguagem é apenas o primeiro passo. Construir sistemas comerciais exige ir além de simplesmente "fazer o código funcionar". O estudo de **Arquitetura de Software** se tornou um pilar central nesta jornada pelos seguintes motivos:

1. **Desacoplamento e Manutenibilidade:** Em aplicações reais, o código muda constantemente. Uma boa arquitetura garante que alterar uma regra de negócio ou um banco de dados não quebre o sistema inteiro.
2. **Preparação para o ecossistema Spring:** O Spring Boot utiliza intensamente padrões como injeção de dependências, inversão de controle (IoC) e o padrão MVC (Model-View-Controller). Entender esses conceitos na prática "pura" (*Vanilla Java*) evita que o framework pareça "mágica" e me torna um desenvolvedor muito mais analítico.
3. **Escalabilidade:** Estruturar o software em camadas (Controladores, Serviços, Repositórios e DTOs) permite que a aplicação cresça de forma ordenada, facilitando o trabalho em equipe e a inclusão de novos recursos sem gerar débito técnico.

---

## 📂 Como o Repositório é Organizado

Para simular um fluxo de trabalho profissional e manter o histórico de estudos rastreável, cada tópico vive em seu **próprio pacote isolado**. Os pacotes usam um **prefixo alfabético sequencial** (`A`, `B`, `C`, `D`, `F`, `G`, `H`...) que força a ordenação cronológica no explorador de arquivos — assim o repositório se lê na mesma ordem em que os conceitos foram aprendidos.

### Vantantages dessa abordagem
* **Histórico de evolução claro:** Dá pra rastrear exatamente o que foi aprendido e implementado em cada bloco de estudos.
* **Sandbox isolado por tópico:** Posso errar, refatorar e testar conceitos complexos sem poluir o código dos módulos já consolidados.
* **Separação de responsabilidades:** Os projetos e exercícios seguem divisões em pacotes como `domain`, `test` e `service`, aproximando o código dos padrões de mercado.

---

## 🚀 Projetos e Exercícios em Destaque

### 1. Sistema de Monitoramento de SLA de Pedidos (`SlaOrderService`)
Simulação prática de um serviço de checkout e backend e-commerce para medir tempos de processamento e projeção de entregas usando a API moderna do Java (`java.time`).
* Marcação de auditoria com `Instant` em tempo UTC.
* Projeção de entregas locais combinando `LocalDateTime` e `DateTimeFormatter`.
* Cálculo e extração de métricas de performance em milissegundos usando `Duration`.

### 2. Mock API REST em Vanilla Java
Uma API REST *mockada* desenvolvida puramente em Java, **sem frameworks**, simulando o comportamento de um servidor real para entender como os dados trafegam por baixo dos panos.

**Arquitetura desacoplada por responsabilidade:**
* `User.java` — Entidade que representa o modelo de dados a ser persistido.
* `UserRequest.java` — DTO (*Data Transfer Object*) para trafegar os payloads do cliente com segurança.
* `ApiResponse.java` — Envelope padrão de respostas com `statusCode` e `message`.
* `UserController.java` — O "coração" da API: rotas de cadastro (POST), listagem (GET), edição (PUT) e exclusão (DELETE).

### 3. Módulo de Exceções & Testes Automatizados
Exercícios de tratamento de exceções já estruturados com separação de pacotes de domínio e testes com JUnit, cobrindo cenários de *runtime* e regras de negócio de alta fidelidade.

---

## 📁 Estrutura do Repositório

```text
src/
└── nicolas.dev.aulasJava/
    └── AJavacoreClasses/
        ├── Api/                                 # Mock REST API em Vanilla Java
        ├── BintroduçãoMetodos.dominio/           # Métodos e parâmetros
        ├── CSobreCargaMetodos/                  # Sobrecarga de métodos
        ├── Dconstrutores/                       # Construtores
        ├── F2exercicios/                        # Exercícios de fixação
        ├── GexerciciosVoo/                      # Domínio "Voo"
        ├── Hassociacao/                         # Associação entre objetos
        ├── Iherenca/                            # Herança
        ├── JSobreescrita/                       # Sobrescrita de métodos
        ├── KmodificadorFinal/                   # Modificador final e constantes
        ├── Lenums/                              # Enums com atributos e métodos
        ├── MclassesAbstratas/                   # Abstração de classes
        ├── Ninterfaces/                         # Contratos e interfaces
        ├── Opolimorfismo/                       # Polimorfismo e desacoplamento
        ├── Owrapper.teste/                      # Autoboxing e Wrapper Classes
        ├── Pexception/                          # Tratamento de exceções e testes JUnit
        ├── QclassesUtilitariasString.test/      # Imutabilidade e métodos de String
        ├── RclassesDate.teste/                  # API Moderna (LocalDate, LocalTime, Instant, Duration)
        └── SlaOrderService.java                 # Serviço prático de cálculo de SLA de pedidos