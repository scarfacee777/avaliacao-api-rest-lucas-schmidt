API REST de Alunos
👨‍💻 Desenvolvedor
Seu Nome Completo

📋 Descrição do Projeto
API REST desenvolvida em Spring Boot para gerenciamento de alunos com operações CRUD completas (Create, Read, Update, Delete).

🛠 Tecnologias Utilizadas
Java 24

Spring Boot

Maven

Postman (para testes dos endpoints)

🚀 Como Executar a Aplicação
Pré-requisitos
Java 17 ou superior

Maven 3.6+

Git

Passos para Execução
Clone o repositório:

bash
git clone https://github.com/seu-usuario/avaliacao-api-rest-nome-sobrenome.git
cd avaliacao-api-rest-nome-sobrenome
Execute a aplicação:

bash
mvn spring-boot:run
Acesse a API:

text
http://localhost:8080
📡 Endpoints da API
GET /alunos
Descrição: Retorna a lista completa de alunos
Resposta:

json
["João Silva", "Maria Santos", "Pedro Oliveira"]
POST /alunos
Descrição: Adiciona um novo aluno
Body:

json
"Ana Costa"
Resposta:

json
"Aluno adicionado: Ana Costa"
PUT /alunos/{id}
Descrição: Atualiza um aluno existente pelo ID
Exemplo: PUT /alunos/1
Body:

json
"Maria Souza"
Resposta:

json
"Aluno atualizado para: Maria Souza"
DELETE /alunos/{id}
Descrição: Remove um aluno pelo ID
Exemplo: DELETE /alunos/1
Resposta:

json
"Aluno removido: Maria Souza"
🧪 Testes Realizados
Evidências de Teste
Os prints dos testes realizados no Postman estão disponíveis na pasta:

text
prints-postman/
Arquivos de Teste:
get-alunos.png - Listagem de alunos

post-aluno.png - Adição de novo aluno

put-aluno.png - Atualização de aluno

delete-aluno.png - Remoção de aluno

📁 Estrutura do Projeto
text
avaliacao-api-rest/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── alysson/
│                   └── apirest/
│                       ├── ApiRestApplication.java
│                       └── controller/
│                           └── AlunoController.java
├── prints-postman/
│   ├── get-alunos.png
│   ├── post-aluno.png
│   ├── put-aluno.png
│   └── delete-aluno.png
├── pom.xml
└── README.md
🔄 Versionamento
Branches Principais
main - Branch principal com código estável

testes - Branch para desenvolvimento e testes

Comandos Git Utilizados
bash
# Criação da branch de testes
git checkout -b testes

# Merge com a main
git checkout main
git merge testes
✅ Funcionalidades Implementadas
Operação GET - Listar alunos

Operação POST - Adicionar aluno

Operação PUT - Atualizar aluno

Operação DELETE - Remover aluno

Validação de índices

Tratamento de erros básico

Testes completos no Postman

📞 Contato
Repositório GitHub: https://github.com/scarfacee777/avaliacao-api-rest-lucas-schmidt)
Desenvolvido para a Avaliação de Aprendizagem - Programador Web 2025

