# Alec Lima Rondel

## :speech_balloon: Introdução

<div style="display: flex; justify-content: space-between;">
    <img src="/Metodologia/assets/_1.png" alt="Alec" style="width: 35%;"/>
</div>

> Olá, eu sou o Alec!

<br>

## Contatos
* [GIT](https://github.com/aleclr)
* [LinkedIn](https://www.linkedin.com/in/alecrondel/)

## Meus Principais Conhecimentos
Apresente seus principais conhecimentos. Foque nos conhecimentos que possui maior domínio e que deseja desenvolver durante sua carreira.


## :card_index_dividers: PORTFOLIO

---

### 1º SEM - Avaliação Democratizada

[Repositório Github](https://github.com/pontopython/api-bd1)

Parceiro acadêmico: [FATEC](https://fatecsjc-prd.azurewebsites.net)

<img src="/Metodologia/assets/api1/fotoapi0.png" alt="PontoPy" style="width: 70%;"/>

>Neste primeiro contato com a metodologia ágil, a FATEC disponibilizou dois professores para realizar a interface de cliente e orientador SCRUM, para garantir que os alunos pudessem ter contato ativo com o cliente e sanar todas as dúvidas, facilitando a experiência e a curva de aprendizado de uma nova metodologia de trabalho.

>O tema do projeto foi a Avaliação 360º, uma técnica de avaliação que visa criar um ambiente de avaliação honesto e abrangente, onde todos os membros de uma equipe podem realizar tanto a autoavaliação quanto a avaliação de seus colegas. Foi criado então um sistema na linguagem Python, que possibilita o login e a criação e controle de toda a estrutura, usuários, equipes, sprints e avaliações.

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
    <br>
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
    <br>
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

### :man_student: Aprendizado

<details>
    <summary>
        :battery: Hard Skills
    </summary>
    <table>
        <tr>
            <td>Github</td>
            <td>Consolidação do entendimento de estrutura de repositórios e código fonte, além de contato com documentação de projetos.</td>
        </tr>
        <tr>
            <td>Python</td>
            <td>Entendimento da linguagem, e de como criar e estruturar um projeto do zero, com funções, módulos e dependências.</td>
        </tr>
        <tr>
            <td>Visual Studio Code</td>
            <td>Contato com a IDE e experiência com trabalho em equipe num mesmo repositório. Estrutura de commits e a importância da estratégia, documentação e colaboração durante o processo de desenvolvimento.</td>
        </tr>
        <tr>
            <td>Scrum</td>
            <td>Primeiro contato com a metodologia ágil, entendimento das funções, do cronograma, das sprints e dos entregáveis.</td>
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
            <td>Foi necessário muita proatividade para assumir uma função desconhecida de Product Owner, compreender a função e a importância da posição, e realizar as tarefas necessárias.</td>
        </tr>
        <tr>
            <td>Comunicação Efetiva</td>
            <td>Essencial para o trabalho com a metodologia ágil, para interagir com os membros da equipe, e ajudar a todos evoluir em conjunto.</td>
        </tr>
        <tr>
            <td>Visão de Negócio</td>
            <td>Primeiro contato com a responsabilidade de compreender as necessidades de um cliente, e como traduzir estas necessidades para requisitos que podem ser desenvolvidos por uma equipe ágil.</td>
        </tr>
    </table>
</details>

---

### 2º SEM - Controle de Jornada

[Repositório Github](https://github.com/aleclr/api-2sem)

Parceiro acadêmico: [2RPnet](https://2rpnet.com.br/)

<p align="center">
  <img src="/Metodologia/assets/api2/fotoapi1.png" alt="Imagem 1" width="45%">
  <img src="/Metodologia/assets/api2/fotoapi4.png" alt="Imagem 2" width="45%">
</p>

>A 2RP possui mais de 20 anos de experiência disponibilizando para o mercado soluções para análise de informações em tempo real, e também análise de transações financeiras e de dados, para geração de insights e o aprimoramento da experiência de seus clientes.

>Nosso parceiro buscava uma ferramenta web que fizesse o controle da jornada de trabalho do colaborador, identificasse e classificasse horas extras, controle das horas extras e sobreavisos. Acesso de administrador para o departamento de RH, gestor para aprovação e lançamento das horas e colaborador para apontar horas extras.

### :computer: Tecnologias Utilizadas

![Tecnologias](/Metodologia/assets/api2/tecnologias.png)

<br>

- [Java](https://www.java.com/pt-BR/) : Linguagem utilizada para o desenvolvimento das funcionalidades back-end e front-end do projeto.
- [JavaFX](https://openjfx.io) : Livraria de Java utilizada para criar o design, a lógica de programação, e renderizar as telas da aplicação.
- [PostgreSQL](https://www.postgresql.org) : Banco de Dados escolhido para a aplicação.

### Contribuições Pessoais
Meu principal papel durante o desenvolvimento deste projeto foi como Desenvolvedor Front-End, onde ajudei transformar o layout pensado pelo Product Owner da equipe em telas funcionais e atraentes, com o uso do SceneBuilder para JavaFX, além de trabalhar na integração de classes do java com o front-end.

<details>
    <summary>
        Criação de layouts com JavaFX.
    </summary>
    <div>
        <img src="/Metodologia/assets/api2/fotoapi6.jpeg" alt="Layout Inicial"/>
        <img src="/Metodologia/assets/api2/fotoapi5.png" alt="SceneBuilder"/>
    </div>
    <br>
    Transformação do layout inicial idealizado pelo Product Owner, após discussões com a equipe.

</details>

<details>
    <summary>
        Integração de tabelas.
    </summary>
    <br>
    Trabalhei desde a criação da tabela e sua classe em Java, até a integração na tela do front-end.
    <br>
    <details>
        <summary>
                Criação da Tabela:
        </summary>
            <pre>
                <code>
                    package frontend.util;
                    import javafx.scene.control.CheckBox;
                    <br>
                    public class TabelaAprova {
                        <br>
                        private String colaborador;
                        private String dataHoraInicial;
                        private String dataHoraFinal;
                        private String cliente;
                        private String tipo;
                        private String totalDeHoras;
                        private CheckBox selecione;
                        <br>
                        public TabelaAprova(String colaborador, String dataHoraInicial, String dataHoraFinal, String cliente, String tipo,
                                String totalDeHoras) {
                            this.colaborador = colaborador;
                            this.dataHoraInicial = dataHoraInicial;
                            this.dataHoraFinal = dataHoraFinal;
                            this.cliente = cliente;
                            this.tipo = tipo;
                            this.totalDeHoras = totalDeHoras;
                            this.selecione = new CheckBox();
                        }
                        <br>
                        public String getColaborador() {
                            return colaborador;
                        }
                        public String getDataHoraInicial() {
                            return dataHoraInicial;
                        }
                        public String getDataHoraFinal() {
                            return dataHoraFinal;
                        }
                        public String getCliente() {
                            return cliente;
                        }
                        public String getTipo() {
                            return tipo;
                        }
                        public String getTotalDeHoras() {
                            return totalDeHoras;
                        }
                        public CheckBox getSelecione() {
                            return selecione;
                        }
                    }
                </code>
            </pre>
    </details>
    <details>
        <summary>
            Código Java para Integração:
        </summary>
        <pre>
            <code>
                    @Override
                    public void initialize(URL url, ResourceBundle resourceBundle){
                        // Verificando acesso para todas as telas
                        VerificaAcesso.verificarAcesso(btnAprovaHora, usuario.getCargo(), NomesArquivosFXML.aprovaHora);
                        VerificaAcesso.verificarAcesso(btnConsultar, usuario.getCargo(), NomesArquivosFXML.consultaHora);
                        VerificaAcesso.verificarAcesso(btnRegistrarHora, usuario.getCargo(), NomesArquivosFXML.registraHora);
                        VerificaAcesso.verificarAcesso(btnCadastra, usuario.getCargo(), NomesArquivosFXML.admin);
                        VerificaAcesso.verificarAcesso(btnEdita, usuario.getCargo(), NomesArquivosFXML.admin);
                        <br>
                        // Para preencher o campo de equipe
                        campoEscolhaEquipe.getItems().addAll(conn.getListaColuna(usuario.getMatricula(),"equipe"));
                        <br>
                        // Dados para Teste
                        ObservableList&lt;TabelaAprova&gt; listaHorasPendentes = FXCollections.observableArrayList();
                        listaHorasPendentes.add(new TabelaAprova("Alec", "12/05/2023 18:00", "12/05/2023 19:00", "Americanas", "Sobreaviso", "01:00"));
                        listaHorasPendentes.add(new TabelaAprova("Pedro", "12/05/2023 18:00", "12/05/2023 20:00", "Apple", "Hora Extra", "02:00"));
                        listaHorasPendentes.add(new TabelaAprova("Lucas", "12/05/2023 18:00", "12/05/2023 18:30", "Americanas", "Sobreaviso", "00:30"));
                        tabela.setItems(listaHorasPendentes);
                        <br>
                        // Atribuição
                        colunaColaborador.setCellValueFactory(new PropertyValueFactory&lt;TabelaAprova, String&gt;("colaborador"));
                        colunaDataHoraInicial.setCellValueFactory(new PropertyValueFactory&lt;TabelaAprova, String&gt;("dataHoraInicial"));
                        colunaDataHoraFinal.setCellValueFactory(new PropertyValueFactory&lt;TabelaAprova, String&gt;("dataHoraFinal"));
                        colunaCliente.setCellValueFactory(new PropertyValueFactory&lt;TabelaAprova, String&gt;("cliente"));
                        colunaTipo.setCellValueFactory(new PropertyValueFactory&lt;TabelaAprova, String&gt;("tipo"));
                        colunaTotalDeHoras.setCellValueFactory(new PropertyValueFactory&lt;TabelaAprova, String&gt;("totalDeHoras"));
                        colunaSelecione.setCellValueFactory(new PropertyValueFactory&lt;TabelaAprova, Checkbox&gt;("selecione"));
                    }
            </code>
        </pre>
    </details>
</details>

### :man_student: Aprendizado

<details>
    <summary>
        :battery: Hard Skills
    </summary>
    <table>
        <tr>
            <td>Java</td>
            <td>Primeiro contato com a linguagem, muito aprendizado a respeito de estrutura de projetos, estrutura de classes e programação orientada a objetos.</td>
        </tr>
        <tr>
            <td>JavaFX / SceneBuilder</td>
            <td>O domínio rápido de um novo software e uma nova maneira de desenvolver layouts de front-end se provou extremamente importante para o sucesso do projeto como um todo.</td>
        </tr>
        <tr>
            <td>PostgreSQL</td>
            <td>Primeiro contato com um banco de dados, conhecimentos de como instalar em uma máquina, acessar o SGBD, e como o banco funciona juntamente com a linguagem SQL.</td>
        </tr>
    </table>
</details>

<details>
    <summary>
        :speaking_head: Soft Skills
    </summary>
    <table>
        <tr>
            <td>Proatividade</td>
            <td>Novamente de extrema importância, para ter coragem e aprender uma plataforma nova e conseguir desenvolver os layouts a tempo das entregas de sprint.</td>
        </tr>
        <tr>
            <td>Entrega de Resultados</td>
            <td>Neste semestre consegui compreender a pressão que existe em cima dos desenvolvedores dentro de uma metodologia ágil, para que todos façam suas entregas e ninguém prejudique o trabalho do outro.</td>
        </tr>
        <tr>
            <td>Trabalho em Equipe</td>
            <td>Foi imperativo desenvolver o senso de trabalho em equipe neste semestre, pois entrei em um time novo e precisei aprender muitas tecnologias novas. Sem o trabalho em equipe como um dos pilares de desenvolvimento pessoal neste processo, não teria sido possível conciliar todas as responsabilidades e ainda ser um bom colega de trabalho.</td>
        </tr>
    </table>
</details>

---

### 3º SEM - Controle de Jornada WEB

[Repositório Github](https://github.com/aleclr/Controle-de-jornada)

Parceiro acadêmico: [2RPnet](https://2rpnet.com.br/)

<p align="center">
  <img src="/Metodologia/assets/api3/fotoapi4.png" alt="Imagem 1" width="45%">
  <img src="/Metodologia/assets/api3/fotoapi2.png" alt="Imagem 2" width="50%">
</p>

>A 2RP possui mais de 20 anos de experiência disponibilizando para o mercado soluções para análise de informações em tempo real, e também análise de transações financeiras e de dados, para geração de insights e o aprimoramento da experiência de seus clientes.

>Nosso parceiro buscava uma ferramenta web que fizesse o controle da jornada de trabalho do colaborador, identificasse e classificasse horas extras, controle das horas extras e sobreavisos. Acesso de administrador para o departamento de RH, gestor para aprovação e lançamento das horas e colaborador para apontar horas extras.

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

---

### 4º SEM - Sistema de Análise de Parceiros ORACLE

[Repositório Github](https://github.com/aleclr/OraclePartnerTracker)

Parceiro acadêmico: [Oracle](https://www.oracle.com)

<p align="center">
  <img src="/Metodologia/assets/api4/fotoapi2.png" alt="Imagem 2" width="100%">
</p>

>A Oracle está a décadas no mercado de tecnologia, e é uma das pioneiras em oferecer serviço de banco de dados e ambientes em nuvem. Nos buscou para uma aplicação web que permita a análise e o controle do seu programa de parceria.

### :computer: Tecnologias Utilizadas

![Tecnologias](/Metodologia/assets/api4/tecnologias2.png)

- [Java](https://www.java.com/pt-BR/) : Linguagem utilizada para o desenvolvimento das funcionalidades back-end do projeto.
- [Spring](https://spring.io/) : Framework escolhido para melhorar a estrutura e a conexão do projeto com o banco de dados.
- [MySQL](https://www.mysql.com/) : SGBD escolhido para criação e manipulação do banco de dados.
- [VueJS](https://vuejs.org) : Framework para criação da estrutura e desenvolvimento da parte web da nossa aplicação.
- [Vuetify](https://vuetifyjs.com/en/) : Biblioteca para complementar o VueJS com funções e componentes mais estéticos e otimizados.
- [Hibernate](https://hibernate.org) : Framework para mapear o banco de dados e fazer a integração com o back-end.

### Contribuições Pessoais

Desempenhei a função de desenvolvedor full-stack neste projeto, trabalhando em diversas tarefas como mapeamento de tabelas do banco de dados, criação de lógica no back-end, criação de controllers e endpoints para recebimento e postagem de dados, criação e implementação de layouts no front-end, estilização de páginas e lógica de programação no front-end com javascript.

<details>
    <summary>
        Mapeamento de tabela
    </summary>
    <br>
    DTO:
    <pre>
        <code>
            package Oracle.Partner.Tracker.dto;
            import Oracle.Partner.Tracker.utils.IngestionOperation;
            import lombok.AllArgsConstructor;
            import lombok.Data;
            import lombok.NoArgsConstructor;
            <br>
            @Data
            @AllArgsConstructor
            @NoArgsConstructor
            public class CertificationDTO implements GenericDTO {
                <br>
                private String name;
                private String description;
                private IngestionOperation ingestionOperation;
                <br>
            }
        </code>
    </pre>
    <br>
    Repository:
    <pre>
        <code>
        package Oracle.Partner.Tracker.repositories;
        import org.springframework.data.jpa.repository.JpaRepository;
        import Oracle.Partner.Tracker.entities.Certification;
        <br>
        public interface CertificationRepository extends JpaRepository<Certification, Long> {
            //
        }
        </code>
    </pre>
</details>

<details>
    <summary>
        Lógica Back-end:
    </summary>
    <br>
    Service:
    <pre>
        <code>
            package Oracle.Partner.Tracker.services;
            import java.util.List;
            import java.util.Optional;
            import java.util.stream.Collectors;
            import org.springframework.beans.factory.annotation.Autowired;
            import org.springframework.stereotype.Service;
            import Oracle.Partner.Tracker.dto.CertificationDTO;
            import Oracle.Partner.Tracker.entities.Certification;
            import Oracle.Partner.Tracker.repositories.CertificationRepository;
            <br>
            @Service
            public class CertificationService {
                <br>
                @Autowired
                private CertificationRepository certificationRepository;
                public List<CertificationDTO> getAllCertifications() {
                    List<Certification> certifications = certificationRepository.findAll();
                    return certifications.stream().map(this::convertToDto).collect(Collectors.toList());
                };
                <br>
                private CertificationDTO convertToDto(Certification certification) {
                    CertificationDTO dto = new CertificationDTO();
                    dto.setName(certification.getName());
                    dto.setDescription(certification.getDescription());
                    dto.setIngestionOperation(certification.getIngestionOperation());
                    return dto;
                };
                <br>
                public CertificationDTO getCertificationById(Long id) {
                    Optional<Certification> certification = certificationRepository.findById(id);
                    return certification.map(this::convertToDto).orElse(null);
                };
                <br>
            }
        </code>
    </pre>
</details>

<details>
    <summary>
        Controller e Endpoints
    </summary>
    <br>
    <pre>
        <code>
            package Oracle.Partner.Tracker.controllers;
            import java.util.List;
            import org.springframework.beans.factory.annotation.Autowired;
            import org.springframework.http.HttpStatus;
            import org.springframework.http.ResponseEntity;
            import org.springframework.web.bind.annotation.CrossOrigin;
            import org.springframework.web.bind.annotation.GetMapping;
            import org.springframework.web.bind.annotation.PathVariable;
            import org.springframework.web.bind.annotation.RequestMapping;
            import org.springframework.web.bind.annotation.RestController;
            import Oracle.Partner.Tracker.dto.CertificationDTO;
            import Oracle.Partner.Tracker.services.CertificationService;
            <br>
            @CrossOrigin
            @RestController
            @RequestMapping(value = "/certification")
            public class CertificationController {
                <br>
                @Autowired
                private CertificationService certificationService;
                <br>
                @GetMapping
                public List<CertificationDTO> getAllCertifications() {
                    return certificationService.getAllCertifications();
                };
                <br>
                @GetMapping("/{id}")
                public ResponseEntity<CertificationDTO> getCertificationById(@PathVariable Long id) {
                    CertificationDTO dto = certificationService.getCertificationById(id);
                    if (dto != null) {
                        return ResponseEntity.ok(dto);
                    } else {
                        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
                    }
                };
            }
        </code>
    </pre>
</details>

<details>
    <summary>
        Criação e implementação de filtro para tabela
    </summary>
    <br>
    Criação do filtro:
    <pre>
        <code>
            const sortedWorkloadNames = computed(() => {
                return ['Visualizar todas workloads', ...Object.keys(workloadData.value).sort((a, b) => a.localeCompare(b))];
            });
            <br>
            const tableItems = computed(() => {
                let items = Object.keys(workloadData.value).map(workloadName => ({
                    workloadName,
                    companyNames: workloadData.value[workloadName]
            }));
            <br>
            if (selectedWorkload.value !== 'Visualizar todas workloads') {
                items = items.filter(item => item.workloadName === selectedWorkload.value);
            }
            if (partnerFilter.value === 'Workloads com parceiros aptos') {
                items = items.filter(item => item.companyNames.length > 0);
            } else if (partnerFilter.value === 'Workloads sem parceiros aptos') {
                items = items.filter(item => item.companyNames.length === 0);
            }
                return items.sort((a, b) => a.workloadName.localeCompare(b.workloadName));
            });
        </code>
    </pre>
    <br>
    Implementação do filtro:
    <pre>
        <code>
            &lt;VRow&gt;
                &lt;VCol cols="6"&gt;
                    &lt;VSelect
                        class="filtro"
                        v-model="selectedWorkload"
                        :items="sortedWorkloadNames"
                        label="Select Workload"
                        dense
                    /&gt;
                &lt;/VCol&gt;
                &lt;VCol cols="6"&gt;
                    &lt;VSelect
                        class="filtro"
                        v-model="partnerFilter"
                        :items="['Visualizar todos', 'Workloads com parceiros aptos', 'Workloads sem parceiros aptos']"
                        label="Filtrar por Parceiros"
                        dense
                    /&gt;
                &lt;/VCol&gt;
            &lt;/VRow&gt;
        </code>
    </pre>
</details>

<details>
    <summary>
        Funcionalidade front-end de CRUD para certificações
    </summary>
    <br>
    <img src="/Metodologia/assets/api4/fotoapi5.png" alt="Tela de Formulário"/>
    <img src="/Metodologia/assets/api4/fotoapi3.png" alt="Tabela com todas as Certificações"/>
</details>

<details>
    <summary>
        Criação do Logotipo OraclePartnerTracker
    </summary>
    <br>
    <img src="/Metodologia/assets/api4/fotoapi1.png" alt="Menus"/>
</details>

<details>
    <summary>
        Desenvolvimento da funcionalidade de vencimento
    </summary>
    <br>
    <img src="/Metodologia/assets/api4/fotoapi4.png" alt="Menus"/>
</details>

### :man_student: Aprendizado

<details>
    <summary>
        :battery: Hard Skills
    </summary>
    <table>
        <tr>
            <td>Springboot</td>
            <td>Por ter sido um desenvolvedor full-stack neste semestre, pude ter mais contato com o banco de dados e o back-end do nosso projeto, e pude aprender de fato como o springboot consegue estruturar o back-end de um projeto de maneira sólida e modular.</td>
        </tr>
        <tr>
            <td>SQL</td>
            <td>Também tive a oportunidade de evoluir meus conhecimentos em SQL, criando queries na prática, testanto, e as utilizando na criação de endpoints para o nosso RestAPI.</td>
        </tr>
        <tr>
            <td>VueJS</td>
            <td>Primeira experiência com VueJS e com o conceito de componentização dos elementos do front-end, foi desafiador aprender uma estrutura e tecnologia nova em tão pouco tempo, mas com ajuda dos professores e colegas de equipe, foi uma ótima experiência.</td>
        </tr>
    </table>
</details>

<details>
    <summary>
        :speaking_head: Soft Skills
    </summary>
    <table>
        <tr>
            <td>Colaboração</td>
            <td>A partir deste ponto, os projetos e soluções desenvolvidas começaram a ficar mais robustos e com mais funcionalidades, e a colaboração entre todos os membros da equipe se mostrou crucial para o andamento do projeto, tanto pela parte de código quanto pela parte de documentação e processos ágeis.</td>
        </tr>
        <tr>
            <td>Autonomia</td>
            <td>Como desenvolvedor full-stack, tive contato com tecnologias, linguagens e frameworks que nunca havia trabalhado antes, em todas as áreas da nossa aplicação, e isso exigiu muita autonomia para aprender como tudo funciona com rapidez e eficiência, e conseguir ser útil e produtivo ao longo de todas as sprints.</td>
        </tr>
        <tr>
            <td>Feedback Construtivo</td>
            <td>Com a complexidade dos sistemas desenvolvidos aumentando, aumenta também a responsabilidade de cada desenvolvedor, e corre o risco de desentendimentos e brigas internas a respeito da diferença na metodologia pessoal de trabalho de cada colega. O feedback positivo é essencial para manter o bom espírito e a positividade como uma equipe.</td>
        </tr>
    </table>
</details>
