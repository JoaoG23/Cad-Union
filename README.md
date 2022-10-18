

<div  align=center >

<h1>Cad-Union 🤳🏽</h1>

Um CRUD de registro de pessoas usuário e senha, didático para melhor aprendizado,
da Linguagem JAVA
meio genenico, mas estava sem criatividade no momento para escolher o tema do CRUD😅... 

</div>

### Indice 👨‍💻

<p align=center>
 <li> <a href="#desenvolvimento">1 - 👩🏽‍🌾 Criação e Tecnologias</a> • </li>
 <li> <a href="#instalar">2 - 👇🤘 Como instalar</a> • </li>
 <li> <a href="#usar">3 - 🤘Como Usar</a> • </li>
 <li> <a href="#consideraçoesfinais">4 - Considerações finais </a> • </li>
 <li> <a href="#autor">5 -🧑‍💻 Autor</a> • </li>
 <li> <a href="#licensa"> 6- Licença</a> • </li>
</p>

## Edições ✏️📑

|             Alterações             |   Data   | Versão |
| :--------------------------------: | :------: | :----: |
| Emissão Inicial | 18/10/2022 | 1.0.1  |




<h2 id='desenvolvimento'><b>1- Criação e Tecnologias 🤺😰 </b></h2>


### 👥 Principais Tecnologia usadas até o momento

**• Java**
**• Spring e SpringBoot**
**• PostgresSQL**

<section>  
    <img width="85px" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg" />
    <img width="90px" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original-wordmark.svg" />
    <img width="80px" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/postgresql/postgresql-original-wordmark.svg" />
</section>

<br>

Novamente, como sempre como nos projetos anteriores utilizei arquitura **MVC**

<h2 id='instalar'><b>2- Como instalar 🧑‍🔧</b></h2>

1. Tenha o todo o ambiente de desenvolvimento Java instalado com maven
1. Tenha um banco de dados Relacional **postgresSQL**
1. Clone o projeto.
1. Abrá entre na classe principal execute o comando run no vscode
1. Ou similar a esse abaixo pasta **raiz** do projeto 

        cmd /C ""C:\Program Files\Java\jdk-15.0.2\bin\java.exe" -XX:+ShowCodeDetailsInExceptionMessages @C:\Users\ (**nome_usuario**)\AppData\Local\Temp\cp_1zx7osk2skegb828bfv1lu3hy.argfile com.api.cadunion.CadUnionApplication "


<h2 id='usar'><b>3- Como usar 👩‍💻</b></h2>

1. Abrá um postman ou insommia 
1. Coloque na URL http://localhost:8080/users/

Execute o método GET users/ : para lista todos usuarios

Execute o método GET users?page=1 : para lista 10 primeiro usuário

Execute o método GET users?page=1&size=4 : para lista seleciona 4
usuário irá aparece na tela.

Execute o método POST users/ : para adicionar um usuario

com o corpo = body coloque esse dados

    {
        "nome":"Carlinhos",
        "sobrenome":"Teste",
        "usuario":"Carlinhos",
        "senha":"Carlinhos"
    }

Execute o método PUT users/{id} : para editar um usuario

com o corpo : **body** coloque esse dados

    {
        "nome":"Nome Mudado",
        "sobrenome":"sobrenome Mudado",
        "usuario":"usuário Mudado",
        "senha":"senha mudada"
    }

Execute o método DELETE users/{id} : para deletar um usuario




<h2 id='consideraçoesfinais'><b>4 -🥺😭 Considerações finais</b></h2>

Ahhh, mas você já vai ir embora 😢 ...

Esse projetinho, foi só um tira gosto, para os demais aptitivo do que viram adiante da linguagem **JAVA**.
Estou amando de mais essa linguagem e todo ecossitema **Spring**, obrigado a todos que viram esse projeto e a todos que me indicaram a linguagem. Xau
🤗🙋‍♂️!


<h2 id='autor'><b>5 - Autor 🧙🏽‍♂️<b></h2>

---

![avatar](https://images.weserv.nl/?url=https://avatars.githubusercontent.com/u/80895578?v=4?v=4&h=100&w=100&fit=cover&mask=circle&maxage=7d
)

 <sub><b>Joao Guilherme</b></sub></h4> <a href="https://github.com/JoaoG23/">🚀</a>

Feito com 🤭 por Joao Guilherme 👋🏽 Entre em contato!

[![Linkedin Badge](https://img.shields.io/badge/-Joao-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/jaoo/)](https://www.linkedin.com/in/joaog123/)
[![Badge](https://img.shields.io/badge/-joaoguilherme94@live.com-c80?style=flat-square&logo=Microsoft&logoColor=white&link=mailto:joaoguilherme94@live.com)](mailto:joaoguilherme94@live.com)

<h2 id='licenca'><b>6 - Licença</b></h2>

[![Licence](https://img.shields.io/github/license/Ileriayo/markdown-badges?style=for-the-badge)](./LICENSE)

