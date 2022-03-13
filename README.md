# severino-bot 

Severino BOT, é um chat bot para o Telegram, construindo em Java e utilizando o framework
Java Quarkus. Para saber mais sobre Quarkus -> https://quarkus.io.

## Rodar a aplicação localmente - LINUX

- Pré-requisitos:  Java 11

- Crie um arquivo run.sh na raiz do projeto

- Dê permissão de execução para o arquivo
```shell script
chmod +x run.sh
```

- Adicione o conteudo abaixo no arquivo run.sh 
```shell script
./mvnw quarkus:dev -DBOT_TOKEN=SEU_TOKEN -DBOT_NAME=NOME_DO_CHAT_BOT -DTOKEN_WEATHER=SEU_TOKEN_CLIMA_TEMPO -DLOCALE_ID_WEATHER=ID_DA_LOCALIDADE
```

- Agora só rodar o script
```shell script
./run.sh
```

- A aplicação estará rodando em `http://localhost:8080`

- Execute em PING na aplicação `http://localhost:8080/ping`