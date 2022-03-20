# Severino Bot (severino-bot)

## Descrição do Projeto

Severino BOT, é um chatbot para o Telegram, construido em linguagem Java e utilizando o framework Java Quarkus. Para saber mais sobre Quarkus -> https://quarkus.io.

## Funcionalidades da Versão 

Construído como atividade prática da disciplina de _Java Plataform_ do __MBA de Fullstack Development__ da FIAP, em sua primeira versão a aplicação está preparada para reconhecer interações do usuário e realizar consultas tai como: 
* Busca de um endereço pelo CEP informado
* Consulta da previsão do tempo para a cidade de São Paulo
* Consulta da data e hora. 

## Como usar?

### Interagindo com o Severino

Visto que a aplicação já está deployada e consumindo os serviços de nuvem da plataforma Heroku (https://severinoappbot.herokuapp.com/ping), para interagir com o Severino, basta buscar por _@severino_app_bot_ na busca do Telegram e iniciar uma conversa com o bot. 

### Baixando o projeto e rodando a aplicação de forma local - Linux

O projeto Severino Bot está disponível para [acesso ou download](https://github.com/grupojavafiap/severino-bot) via GitHub. 

- [x] Pré-requisitos:  Java 11


#### Instruções 
1. Crie um arquivo _run.sh_ na raiz do projeto
2. Dê permissão de execução para o arquivo
```shell script
chmod +x run.sh
```

3. Adicione o conteudo abaixo no arquivo run.sh 
```shell script
./mvnw quarkus:dev -DBOT_TOKEN=SEU_TOKEN -DBOT_NAME=NOME_DO_CHAT_BOT -DTOKEN_WEATHER=SEU_TOKEN_CLIMA_TEMPO -DLOCALE_ID_WEATHER=ID_DA_LOCALIDADE
```

Pronto! Agora só rodar o script  `shell script ./run.sh`. A aplicação estará rodando em `http://localhost:8080`. Para pingar a aplicação, execute `http://localhost:8080/ping`. 

### Deploy da Aplicação
O Deploy no ambiente do Heroku é realizado a cada push na branch master do GitHub.

### Desenvolvedores

| RM  | Aluno | Turma |
| ------------- |:-------------:| --------- | 
| 344792      | Benisson dos Santos Lopes     | 1SCJRBB-2022 |
| 344799      | Leonardo Guerra Torres Filho     | 1SCJRBB-2022 |
| 344801      | Lucas Eugenio Ribeiro     | 1SCJRBB-2022 |
| 344794      | César de Lira Santos     | 1SCJRBB-2022 |
| 344791      | Anderson Evangelista     | 1SCJRBB-2022 |