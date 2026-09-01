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
| 🔄 | **Manipulação de Recursos, Fusos Horários (ZonedDateTime) & I/O** |
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
* **Tratamento de Exceções:** Diferença entre exceções *checked* e *unchecked*, lançamento controlled, bloco `finally` e criação de exceções personalizadas de domínio.
* **Classes Utilitárias e API Moderna de Datas:**
    * **Wrapper Classes:** Autoboxing, unboxing e comportamento de tipos primitivos envelopados.
    * **Strings & Imutabilidade:** Comportamento de manipulação de textos no Heap e String Pool.
    * **Java Time API (`java.time`):** Manipulação de datas e horas com `LocalDate`, `LocalTime`, `LocalDateTime`, auditoria UTC com `Instant`, cálculo de prazos com `Period`, medição de SLAs com `Duration`, métricas e truncamento de logs com `ChronoUnit` e formatação customizada via `DateTimeFormatter`.
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
* **Separação de responsabilidades:** Os projetos e exercícios seguem divisões em pacotes como `domain`, `test`, `service` e pacotes específicos para `desafios`, aproximando o código dos padrões de mercado.

---

## 🚀 Projetos e Exercícios em Destaque

### 1. Delivery Core — Sistema de Logística & Auditoria (`DeliveryServiceTest`)
Simulação completa de um pipeline backend para e-commerce e logística utilizando a suite `java.time`:
* Registro e auditoria universal em UTC utilizando `Instant`.
* Projeção de prazos de entrega e validade de assinaturas combinando `LocalDateTime`, `Period` e `DateTimeFormatter`.
* Medição de SLA de processamento de notas e estoque em milissegundos com `Duration`.
* Consolidação de métricas de fidelidade do cliente e truncamento de timestamps para agrupamento de logs em banco de dados usando `ChronoUnit`.

### 2. Sistema de Monitoramento de SLA de Pedidos (`SlaOrderService`)
Serviço prático de cálculo de SLA e checkout, calculando janelas de atendimento, atrasos e tempos de resposta do servidor.

### 3. Gestão de Contratos e Assinaturas (`ContractService`)
Gerenciamento de vigência de planos com cálculo de renovação em anos, meses e dias utilizando `Period`.

### 4. Mock API REST em Vanilla Java
Uma API REST *mockada* desenvolvida puramente em Java, **sem frameworks**, simulando o comportamento de um servidor real para entender como os dados trafegam por baixo dos panos.
* `User.java` — Entidade do modelo de dados.
* `UserRequest.java` — DTO (*Data Transfer Object*) para payloads do cliente.
* `ApiResponse.java` — Envelope padrão de respostas com `statusCode` e `message`.
* `UserController.java` — Rotas de cadastro (POST), listagem (GET), edição (PUT) e exclusão (DELETE).

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
        ├── RclassesDate.teste/                  # API Moderna (Aulas e testes de conceitos)
        └── Desafios/                            # Miniprojetos e Desafios de Consolidação
            ├── Core/                            # Gerenciador de Tarefas, etc.
            └── Date/                            # DeliveryServiceTest, SlaOrderService, ContractService, RegistrationDonate