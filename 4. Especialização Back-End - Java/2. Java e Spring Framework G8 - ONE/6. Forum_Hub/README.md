# ForumHub

ForumHub é uma API REST desenvolvida em **Java** com **Spring Boot**, que simula um fórum onde usuários podem se cadastrar, fazer login e realizar operações de **CRUD** com tópicos. O projeto foi construído com foco em segurança, boas práticas e organização em camadas.

---

## 🚀 Tecnologias utilizadas

- **Java 17**
- **Spring Boot**
    - Spring Web
    - Spring Security
    - Spring Data JPA
    - Bean Validation
- **MySQL** (persistência de dados)
- **JWT (JSON Web Token)** (autenticação)
- **Flyway** (controle de versões do banco)
- **Lombok** (redução de boilerplate)
- **Maven** (gerenciador de dependências)
- **IntelliJ IDEA** (IDE de desenvolvimento)
- Testes via **Postman** ou **Insomnia**

---

## ⚙️ Funcionalidades

- Cadastro de usuários
- Login com geração de token JWT
- Criação, listagem, atualização e exclusão de tópicos (CRUD)
- Respostas associadas aos tópicos
- Segurança com autenticação e autorização via tokens
- Validação de dados com Bean Validation

---

## 📁 Estrutura dos endpoints principais

- `POST /usuarios` – Cadastro de novo usuário
- `POST /login` – Login e obtenção de token JWT
- `GET /topicos` – Listagem de tópicos
- `GET /topicos` – Detalhamento de um único tópico
- `POST /topicos` – Criação de novo tópico
- `PUT /topicos/{id}` – Atualização de tópico
- `DELETE /topicos/{id}` – Exclusão de tópico
- `POST /respostas` – Adicionar resposta a um tópico

---

## 💻 Como executar o projeto localmente

### Pré-requisitos

- Java 17 instalado
- MySQL instalado e em execução
- Maven instalado
- IntelliJ (opcional, mas recomendado)

### Passos

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/Maridev08/Vollmed-api..git
   cd forumHub
   ```
 
2. **Configure o banco de dados MySQL:**
- Crie um banco de dados chamado forum_hub
  
      CREATE DATABASE forum_hub;

- Altere as configurações de acesso ao banco em 
    
      src/main/resources/application.properties :
   

 
      spring.datasource.url=jdbc:mysql://localhost/forumhub
      spring.datasource.username=seu_usuario
      spring.datasource.password=sua_senha
 

- Execute a aplicação

4. **Acesse a API:**
- A aplicação estará disponível em:

  
     http://localhost:8080

### 🔐  Autenticação 
* Para acessar rotas protegidas(como criação de tópicos), é necessario:
1. Cadastrar um usuário em `POST/usuarios` .
2. Fazer login em `POST/login` com email e senha.
3. Copiar o token JWT retornado e adicioná-lo no cabeçalho das requisições .

        Authorization: Bearer SEU_TOKEN

### 📱 Teste da API

***Você pode usar o `Postman` ou `Insomnia` para testar os endpoints.Certifique-se de:***
-  Incluir o token JWT nas requisições protegidas

- Utilizar os métodos HTTP corretos (GET, POST, PUT, DELETE)

- Testar o comportamento com dados válidos e inválidos
![Captura de tela 2025-07-29 170011.png](Captura%20de%20tela%202025-07-29%20170011.png)
![Captura de tela 2025-07-29 170047.png](Captura%20de%20tela%202025-07-29%20170047.png)
![Captura de tela 2025-07-29 170149.png](Captura%20de%20tela%202025-07-29%20170149.png)

### 🔎 Observações 
- As migrações de banco são gerenciadas automaticamente via Flyway

- A estrutura do projeto segue boas práticas de separação de camadas (controller, service, repository, DTO)

- Os dados de autenticação são protegidos com criptografia de senha (BCrypt)


