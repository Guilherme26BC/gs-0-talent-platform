#  GS 0 Talent-Platform

## Alunos - 🫂
| Nome                       | RM          |
|----------------------------|-------------|
| Guilherme Bezerra Carvalho |  **550282** |
| Rodolfo Sanches Cima       |  **99748**  |
| *Soma dos RMs*             |***650.030***|

## Descrição do tema - ✍️

Plataformas que conectam talentos a projetos com propósito são ferramentas digitais que buscam ir além da simples colocação profissional, focando na conexão de indivíduos que desejam usar suas habilidades para causar um impacto positivo, social ou ambiental, com organizações e iniciativas que estão promovendo esse tipo de mudança.

## Finalidade da API - 🌐

Essa API possui como principal funcionalidade a consulta das informações relativas ao tema **gs-0-talent-platform**

## Instruções de execução - 🖥️
### Executando a API via CLI com MAVEN
```
mvn spring-boot:run
```

### Executando a API com docker
```
docker build -t  gs-0-talent-platform .
docker compose up 
```
### Executando a API via dockerhub
#### Link: https://hub.docker.com/r/guibezerra/gs-0-talent-platform
1. Substituir o esse trecho do compose.yml
```
build .
```
por:
```
image: guibezerra/gs-0-talent-platform:latest
```
2. Executar em docker
```
docker build -t  gs-0-talent-platform .
docker compose up 
```


## Swagger UI - 📗
Para acessar o Swagger UI e verificar a documentação da API, use o link:
```
http://localhost:8081/
```

## CI - Continuous Integration 📲
A cada **push** efetuado nas branches: *release, feature e hotfix*, independente do sufixo, ele irá fazer o build da aplicação e a **execução dos teste unitários.**


## CD - Continuous Delivery 📩
Toda vez que realizar um **pull request** na branch **develop**, será utilizado uma imagem *Ubuntu / Linux* que irá logar no **Dockerhub** usando **variáveis de ambiente** cadastradas no **Git** e irá fazer o push da imagem no Dockerhub.
    

