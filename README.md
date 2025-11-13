#  GS 0 Talent-Platform

## Alunos
| Nome                       | RM     |
|----------------------------|--------|
| Guilherme Bezerra Carvalho | 550282 |
| Rodolfo Sanches Cima       | 99748  |


### Descrição do tema

Plataformas que Conectam Talentos a Projetos com Propósito
Plataformas que conectam talentos a projetos com propósito são ferramentas digitais que buscam ir além da simples colocação profissional, focando na conexão de indivíduos que desejam usar suas habilidades para causar um impacto social ou ambiental positivo com organizações e iniciativas que estão promovendo esse tipo de mudança.

### Finalidade da API

- Essa API possui como principal funcionalidade a consulta das informações relativas ao tema  gs-0-talent-platform

## Instruções de execuçõa 
- Executando a API via CLI com MAVEN
```
mvn spring-boot:run
```

- Executando a API com docker
```
docker build -t  gs-0-talent-platform .
docker compose up 
```
- Executando a API via dockerhub

primeiro: substituir o esse trecho do compose.yml
```
build .
```
por:
```
image: guibezerra/ gs-0-talent-platform
```
e executar em docker
    