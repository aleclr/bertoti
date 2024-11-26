# Alec Lima Rondel

## :speech_balloon: Introdução

Faça uma breve introdução sobre você. Fale de sua formação e carreira. Caso aplicável, fale de publicações ou apresentações em eventos da área de computação. Inclua uma foto!

## Contatos
* [GIT](https://github.com/aleclr)
* [LinkedIn](https://www.linkedin.com/in/alecrondel/)

## Meus Principais Conhecimentos
Apresente seus principais conhecimentos. Foque nos conhecimentos que possui maior domínio e que deseja desenvolver durante sua carreira.


## :card_index_dividers: PORTFOLIO

### 1º SEM - Avaliação Democratizada

[Repositório Github](https://github.com/pontopython/api-bd1)

Parceiro acadêmico: [FATEC](https://fatecsjc-prd.azurewebsites.net)

<img src="/Metodologia/assets/api1/fotoapi0.png" alt="PontoPy" style="width: 70%;"/>

Neste primeiro contato com a metodologia ágil, a FATEC disponibilizou dois professores para realizar a interface de cliente e orientador SCRUM, para garantir que os alunos pudessem ter contato ativo com o cliente e sanar todas as dúvidas, facilitando a experiência e a curva de aprendizado de uma nova metodologia de trabalho.

O tema do projeto foi a Avaliação 360º, uma técnica de avaliação que visa criar um ambiente de avaliação honesto e abrangente, onde todos os membros de uma equipe podem realizar tanto a autoavaliação quanto a avaliação de seus colegas. Foi criado então um sistema na linguagem Python, que possibilita o login e a criação e controle de toda a estrutura, usuários, equipes, sprints e avaliações.

### :computer: Tecnologias Utilizadas

![Tecnologias](/Metodologia/assets/api1/tecnologias.png)

<br>

- [Python](https://www.python.org) : Linguagem utilizada para o desenvolvimento do projeto.
- [Github](https://github.com) : Plataforma utilizada para gerenciamento do código fonte do projeto.
- [Visual Studio Code](https://code.visualstudio.com) : Software utilizado como ambiente de desenvolvimento.

### Contribuições Pessoais
Para o primeiro semestre, tive a oportunidade de trabalhar a primeira metade do projeto como Product Owner, realizando a interface com o cliente e criando a estrutura do Product Backlog. Na segunda metade do cronograma, pude ter experiência como developer, trabalhando em desenvolver novas funcionalidades e otimizar o código fonte do projeto.

<details>
    <summary>
        Criação do Product Backlog.
    </summary>
    Após o Kickoff do projeto, pude trabalhar em conjunto com o cliente e com a equipe para criar o primeiro Backlog do Projeto, levantando os requisitos, e posteriormente transformando os requisitos em User Stories, desenvolvendo as prioridades e as entregas de valor para o projeto.
    <br>
    <img src="/Metodologia/assets/api1/fotoapi6.png" alt="Tela de Consulta de Horas"/>
    <br>
    <img src="/Metodologia/assets/api1/fotoapi7.png" alt="Tela de Consulta de Horas"/>
</details>

<details>
    <summary>
        Desenvolvimento de funcionalidades.
    </summary>
    Também tive a oportunidade de desenvolver meu conhecimento, criando novas funcionalidades para a aplicação, como por exemplo melhorar a estrutura de busca, adicionando uma limitação condicional:
    <br>
    <pre>
        <code>
            def generate_members_list(team):
                members = []
                for member in team["members"]:
                    members.append(member)
            return members
        </code>
    </pre>
    <br>
    <pre>
        <code>        
            def student_limitation(student, turma):
                limitation = False
                teams = get_teams_from_turma(turma)
                for team in teams:
                    members = generate_members_list(team)
                    for member in members:    
                        if student["id"] == member["id"]:
                            limitation = True
                            break
            return limitation
        </code>
    </pre>
</details>

### 3º SEM - Controle de Jornada

[Repositório Github](https://github.com/aleclr/Controle-de-jornada)

Parceiro acadêmico: [2RPnet](https://2rpnet.com.br/)

<img src="/Metodologia/assets/api3/fotoapi4.png" alt="Tela de Login" style="width: 50%;"/>

A 2RP possui mais de 20 anos de experiência disponibilizando para o mercado soluções para análise de informações em tempo real, e também análise de transações financeiras e de dados, para geração de insights e o aprimoramento da experiência de seus clientes.

Nosso parceiro buscava uma ferramenta web que fizesse o controle da jornada de trabalho do colaborador, identificasse e classificasse horas extras, controle das horas extras e sobreavisos. Acesso de administrador para o departamento de RH, gestor para aprovação e lançamento das horas e colaborador para apontar horas extras.

### :computer: Tecnologias Utilizadas

![Tecnologias](/Metodologia/assets/api3/fotoapi5.png)

<br>

- [Java](https://www.java.com/pt-BR/) : Linguagem utilizada para o desenvolvimento das funcionalidades back-end do projeto.
- [Spring](https://spring.io/) : Framework escolhido para melhorar a estrutura e a conexão do projeto com o banco de dados.
- [MySQL](https://www.mysql.com/) : SGBD escolhido para criação e manipulação do banco de dados.
- [HTML](https://developer.mozilla.org/en-US/docs/Web/HTML), [CSS](https://developer.mozilla.org/en-US/docs/Web/CSS) e [Javascript](https://developer.mozilla.org/en-US/docs/Web/JavaScript) : Linguagens para o desenvolvimento front-end da aplicação web.
- [SQL](https://aws.amazon.com/pt/what-is/sql/) : Linguagem para realizar as querys dentro do SGBD.
- [JWT](https://jwt.io/) : Tecnologia usada para criptografia e segurança dos dados da aplicação.
- [Figma](https://www.figma.com/) : Aplicação web escolhida para organização da documentação e design do projeto.

### Contribuições Pessoais
Durante o semestre em que o projeto foi desenvolvido, tive a oportunidade de atuar como desenvolvedor front-end, ajudando a transformar o design pensado pelo P.O. em páginas reais da web, além da comunicação entre aplicação e banco de dados. Dentre as funções realizadas estão: a criação das páginas, o trabalho na comunicação dos elementos com o banco de dados, bem como a manipulação e a disposição destes dados.

<details>
    <summary>
        Criação e estilização das páginas.
    </summary>
    <br>
    Com base no protótipo pensado pelo Product Owner, e com a utilização das linguagens HTML e CSS, o desenvolvimento das páginas se         iniciou, e depois de conversas com o cliente e alinhamento de preferências, o design final foi atingido. Após isso pude trabalhar na     implementação do design e na criação das páginas para o projeto. Me utilizando de HTML, CSS e Bootstrap.
    <br>
    <img src="/Metodologia/assets/api3/fotoapi1.png" alt="Tela de Consulta de Horas"/>
    <br>
    - Implementação de todas as decisões de design, paleta de cores, fontes, organização dos dados e o formato da tabela que trará os dados do banco. Responsividade das páginas, conteúdos e menus implementada do zero.
    <br>
    <img src="/Metodologia/assets/api3/fotoapi2.png" alt="Tela de Cadastro de Horas"/>
    <br>
    - Padronização de todas as telas, montagem dos formulários e manipulação dos dados inseridos.
</details>

<br>

<details>
    <summary>
        Menus e conteúdos dinâmicos.
    </summary>
    <img src="/Metodologia/assets/api3/fotoapi3.png" alt="Menus"/>
    <br>
    Criação de funções em JavaScript, capazes de identificar qual tipo de usuário está logado na plataforma, e de acordo com suas permissões, carregar o menu principal e seus conteúdos dinamicamente.

</details>

### :man_student: Aprendizado

<details>
    <summary>
        :battery: Hard Skills
    </summary>
    <table>
        <tr>
            <td>HTML/CSS</td>
            <td>Consolidação das habilidades préviamente desenvolvidas.</td>
        </tr>
        <tr>
            <td>JavaScript</td>
            <td>Conhecimentos em funções e consumo de API's com fetch, buscando informações do banco de dados, e manipulando os dados para serem mostrados no DOM.</td>
        </tr>
        <tr>
            <td>Java</td>
            <td>Noções backend e de programação orientada a objeto, mapeamento de entidades e comunicação com o banco de dados.</td>
        </tr>
        <tr>
            <td>MySQL</td>
            <td>Prática de linguagem SQL, entendimento de modelagem e criação de banco de dados, além da conexão com o banco, e posteriormente com o front-end.</td>
        </tr>
        <tr>
            <td>Scrum</td>
            <td>Vivência da metodologia ágil, criação e priorização de tasks, organização de código e de repositórios.</td>
        </tr>
    </table>
</details>

<br>

<details>
    <summary>
        :speaking_head: Soft Skills
    </summary>
    <table>
        <tr>
            <td>Proatividade</td>
            <td>Importante para ter oportunidades de aprender coisas novas, e realizar tarefas que inicialmente não seria possível.</td>
        </tr>
        <tr>
            <td>Comunicação Efetiva</td>
            <td>Essencial para o trabalho com a metodologia ágil, para interagir com os membros da equipe, e ajudar a todos evoluir em conjunto.</td>
        </tr>
        <tr>
            <td>Visão de Negócio</td>
            <td>Desenvolver a habilidade de visão de negócio é extremamente importante, para poder entender as necessidades do cliente, e por consequência entender o valor que cada funcionalidade possui dentro do projeto.</td>
        </tr>
        <tr>
            <td>Inteligência Emocional</td>
            <td>Habilidade necessária para identificar e prevenir conflitos antes deles acontecerem, e conseguir lidar com os conflitos que inevitavelmente surgem em um ambiente de pressão e entrega.</td>
        </tr>
        <tr>
            <td>Mentoria</td>
            <td>Tive a oportunidade de desenvolver bastante a habilidade de mentoria, ao trabalhar em conjunto com um colega no desenolvimento Front-End, e passar para ele bastante do conhecimento que eu já possuía.</td>
        </tr>
    </table>
</details>






