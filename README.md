# ☕ Java Training — Do Core ao Backend

Repositório de estudos de Java. Sou estudante de Engenharia de Software e desenvolvedor backend (Java, Spring Boot, PostgreSQL, MongoDB, Docker), e uso este repo para consolidar a base da linguagem antes de aprofundar no ecossistema **Spring**.

> 📺 A trilha teórica segue o curso **Maratona Java (DevDojo)**. Cada aula vira código aqui, reforçado com desafios práticos.

---

## 🗺️ Roadmap

| Status | Módulo |
| :---: | :--- |
| ✅ | Fundamentos, métodos, sobrecarga e construtores |
| ✅ | POO: encapsulamento, associação, herança, sobrescrita, `final` |
| ✅ | Enums, classes abstratas, interfaces e polimorfismo |
| ✅ | Exceções: checked/unchecked, `finally`, exceções customizadas |
| ✅ | Wrapper classes, `String` e String Pool |
| ✅ | Java Time API e formatação (`DateTimeFormatter`) |
| ✅ | Internacionalização com `ResourceBundle` |
| ✅ | Regex (`Pattern`/`Matcher`) e `Scanner` com delimitadores |
| ✅ | I/O clássico (`java.io`) |
| ✅ | NIO.2 (`java.nio.file`) |
| ✅ | Serialização |
| ✅ | Servidor HTTP nativo (`com.sun.net.httpserver`) |
| 🔄 | **Coleções: `equals`/`hashCode` e `HashSet`** |
| ⏳ | Coleções avançadas (`Map`, `Comparable`/`Comparator`, `Queue`) |
| ⏳ | Generics, Lambdas e Streams |
| ⏳ | Testes automatizados com JUnit |
| ⏳ | Spring Boot |

---

## 🛠️ O que já foi praticado

* **POO:** encapsulamento, associação, herança, sobrescrita, classes abstratas, interfaces e polimorfismo, com camadas `dominio`/`servico`/`repositorio` nos exercícios maiores.
* **Exceções:** hierarquia `Error`/`Exception`/`RuntimeException`, `try-with-resources` e exceções de domínio.
* **Core API:** wrapper classes, imutabilidade de `String`, `java.time` (`LocalDate`, `Instant`, `Period`, `Duration`, `ChronoUnit`), `DateTimeFormatter` e `ResourceBundle`.
* **Regex e entrada de dados:** `Pattern`, `Matcher`, quantificadores, delimitadores e `Scanner`.
* **I/O clássico:** `File`, `FileWriter`/`FileReader` e `BufferedWriter`/`BufferedReader`.
* **NIO.2:** `Path`, `Files`, `resolve`, `relativize` e `normalize`; `BasicFileAttributes`/`DosFileAttributes`, `DirectoryStream`, `SimpleFileVisitor`, `PathMatcher` e compactação com `ZipOutputStream`.
* **Serialização:** `ObjectOutputStream`/`ObjectInputStream`, `transient`, `serialVersionUID` e `writeObject`/`readObject` customizados.
* **Coleções:** `List`/`ArrayList` com polimorfismo; contrato de `equals` (reflexivo, simétrico, transitivo, consistente) e `hashCode` em `HashSet`.
* **Ferramental:** Maven, Lombok (`@Getter`, `@Setter`, construtores) e IntelliJ IDEA.

---

## 🚀 Projetos em destaque

### 🔗 Encurtador de URL nativo — [`src/http/EncurterURL`](src/http/EncurterURL)
Servidor HTTP feito só com o JDK, sem framework.
* `POST /encurtar` gera um código curto via `UUID` e persiste em disco.
* `GET /r/{codigo}` redireciona com `302`, ou responde `404`.
* Estado em memória com `ConcurrentHashMap` e persistência em arquivo com NIO.2, restaurada ao reiniciar.
* Detalhes no [README do projeto](src/http/EncurterURL/readme.md).

### 📁 FilePulse e pipelines NIO — [`Wnio/desafios`](src/nicolas/dev/aulasJava/AJavacoreClasses/Wnio/desafios)
Exercícios de armazenamento e auditoria de arquivos com `java.nio.file`.
* `StoreManagerService`: cria a estrutura de diretórios de forma idempotente, registra eventos de log e gera relatório de auditoria a partir de `BasicFileAttributes`.
* `PipelineStorageNio` e `PipelineLogsNio`: pipelines de criação, escrita e inspeção de arquivos com `Files` e `Path`.

---

## 📂 Organização

Cada tópico vive no próprio pacote dentro de `AJavacoreClasses`. O prefixo alfabético (`B`, `C`, `D`, ..., `Y`) mantém os pacotes na ordem em que foram estudados.

```text
src/
├── nicolas/dev/aulasJava/
│   ├── AJavacoreClasses/
│   │   ├── Api/                     # Mock de API REST em Java puro
│   │   ├── BintroduçãoMetodos/      # Métodos e parâmetros
│   │   ├── CSobreCargaMetodos/      # Sobrecarga
│   │   ├── Dconstrutores/           # Construtores
│   │   ├── F2exercicios/, GexerciciosVoo/
│   │   ├── Hassociacao/             # Associação
│   │   ├── Iherença/                # Herança
│   │   ├── JSobreescrita/           # Sobrescrita
│   │   ├── KmodificadorFinal/       # final
│   │   ├── Lenums/                  # Enums
│   │   ├── MclassesAbstratas/       # Classes abstratas
│   │   ├── Ninterfaces/             # Interfaces
│   │   ├── Opolimorfismo/           # Polimorfismo (dominio/servico/repositorio)
│   │   ├── Owrapper/                # Wrapper classes
│   │   ├── Pexception/              # Exceções
│   │   ├── QclassesUtilitariasString/
│   │   ├── RClassesDate/            # java.time + desafios
│   │   ├── Sformat/                 # DateTimeFormatter
│   │   ├── TresourceBundle/         # Internacionalização
│   │   ├── Uregex/                  # Regex e Scanner
│   │   ├── Vio/                     # java.io
│   │   ├── Wnio/                    # NIO.2
│   │   ├── Xserializacao/           # Serialização
│   │   └── Ycolections/             # Coleções, equals/hashCode (em andamento)
│   ├── Desafios/                    # Desafios de ArrayList polimórfico
│   └── SuperExercicioGemini/
├── http/                            # Servidor HTTP nativo e encurtador de URL
└── testeLombok/                     # Experimentos com Lombok
```

Dentro de cada pacote, o padrão é `dominio/` para as classes de modelo, `test/` (ou `teste/`) para as classes com `main` que exercitam o conceito, e `desafios/` para os exercícios extras.

---

## ▶️ Como rodar

Requisitos: **JDK 17** e **IntelliJ IDEA**.

1. Abra o projeto no IntelliJ. Ele reconhece o `pom.xml` e baixa o Lombok.
2. Ative *annotation processing* (`Settings → Build → Compiler → Annotation Processors`).
3. Rode o `main` da classe que quer testar (as classes em `test/`/`teste/`).
