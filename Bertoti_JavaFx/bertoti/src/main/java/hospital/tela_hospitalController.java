package hospital;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class tela_hospitalController implements Initializable {

    @FXML
    public void disableAnchor(AnchorPane anchorPane) {
        anchorPane.setDisable(true);
        anchorPane.setVisible(false);
    }

    @FXML
    public void enableAnchor(AnchorPane anchorPane) {
        anchorPane.setDisable(false);
        anchorPane.setVisible(true);
        System.out.println("Enabling Anchor");
    }

    @FXML
    private AnchorPane anchorAgendarConsulta;

    @FXML
    private AnchorPane anchorBuscarMedico;

    @FXML
    private AnchorPane anchorBuscarPaciente;

    @FXML
    private AnchorPane anchorCadastrarEnfermidade;

    @FXML
    private AnchorPane anchorCadastrarMedico;

    @FXML
    private AnchorPane anchorCadastrarPaciente;

    @FXML
    private Button btnAgendarConsulta;

    @FXML
    private Button btnAgendarConsultaConfirmar;

    @FXML
    private Button btnBuscarMedico;

    @FXML
    private Button btnBuscarMedicoConfirmar;

    @FXML
    private Button btnBuscarPaciente;

    @FXML
    private Button btnBuscarPacienteConfirmar;

    @FXML
    private Button btnCadastrarEnfermidade;

    @FXML
    private Button btnCadastrarEnfermidadeConfirmar;

    @FXML
    private Button btnCadastrarMedico;

    @FXML
    private Button btnCadastrarMedicoConfirmar;

    @FXML
    private Button btnCadastrarPaciente;

    @FXML
    private Button btnCadastroPacienteConfirmar;

    @FXML
    private DatePicker campoDataAgendar;

    @FXML
    private Label campoLocalRecepcao;

    @FXML
    private ChoiceBox<Medico> campoMedicoAgendar;

    @FXML
    private ChoiceBox<Paciente> campoPacienteAgendar;

    @FXML
    private TextField campoSintomas;

    @FXML
    private TextField campodepartamentoCadastroMedico;

    @FXML
    private ChoiceBox<String> campoenfermidadeCadastroPaciente;

    @FXML
    private Spinner<Integer> campoidadeCadastroMedico;

    @FXML
    private Spinner<Integer> campoidadeCadastroPaciente;

    @FXML
    private TextField camponomeBuscaMedico;

    @FXML
    private TextField camponomeBuscaPaciente;

    @FXML
    private TextField camponomeCadastrarEnfermidade;

    @FXML
    private TextField camponomeCadastroMedico;

    @FXML
    private TextField camponomeCadastroPaciente;

    @FXML
    private TableColumn<Medico, String> departamentoMedicosMain;

    @FXML
    private TableColumn<Medico, String> departamentoMedicosResultado;

    @FXML
    private TableColumn<Paciente, Enfermidade> enfermidadePacienteResultado;

    @FXML
    private TableColumn<Paciente, Enfermidade> enfermidadePacientesMain;

    @FXML
    private TableColumn<Medico, Integer> idadeMedicosMain;

    @FXML
    private TableColumn<Medico, Integer> idadeMedicosResultado;

    @FXML
    private TableColumn<Paciente, Integer> idadePacienteResultado;

    @FXML
    private TableColumn<Paciente, Integer> idadePacientesMain;

    @FXML
    private TableColumn<Paciente, String> nomeCadastroMedico;

    @FXML
    private TableColumn<Medico, String> nomeMedicosMain;

    @FXML
    private TableColumn<Medico, String> nomeMedicosResultado;

    @FXML
    private TableColumn<Paciente, String> nomePacienteResultado;

    @FXML
    private TableColumn<Paciente, String> nomePacientesMain;

    @FXML
    private TableColumn<Medico, Paciente> pacientesMedicosMain;

    @FXML
    private TableColumn<Medico, Paciente> pacientesMedicosResultado;

    @FXML
    private TableColumn<Paciente, CheckBox> selecionarCadastroMedico;

    @FXML
    private TableView<Medico> tabelaMedicosMain;

    @FXML
    private TableView<Medico> tabelaMedicosResultado;

    @FXML
    private TableView<Paciente> tabelaPacienteResultado;

    @FXML
    private TableView<Paciente> tabelaPacientesMain;

    @FXML
    private TableView<Paciente> tabelapacientesCadastroMedico;

    @FXML
    void agendarConsulta(MouseEvent event) {
        
    }

    @FXML
    void buscarPaciente(MouseEvent event) {

    }

    @FXML
    void cadastrarMedico(MouseEvent event) {

    }

    @FXML
    void cadastrarPaciente(MouseEvent event) {
        String nome = camponomeCadastroPaciente.getText();
        Integer idade = campoidadeCadastroPaciente.getValue();
        String enfermidade_nome = campoenfermidadeCadastroPaciente.getValue();
        Enfermidade enfermidade = new Enfermidade(null, null, null);
        if (enfermidade_nome == "Gripe") {
            enfermidade = gripe;
        } else if (enfermidade_nome == "Sinusite") {
            enfermidade = sinusite;
        }

        Paciente paciente = new Paciente(nome, idade, enfermidade);
        listaPacientesMain.add(paciente);

        camponomeCadastroPaciente.setText("");
    }

    @FXML
    void castrarEnfermidade(MouseEvent event) {

    }

    @FXML
    void mostrarAgendarConsulta(MouseEvent event) {
        disableAnchor(anchorCadastrarPaciente);
        disableAnchor(anchorCadastrarMedico);
        disableAnchor(anchorCadastrarEnfermidade);
        disableAnchor(anchorBuscarPaciente);
        disableAnchor(anchorBuscarMedico);
        enableAnchor(anchorAgendarConsulta);
    }

    @FXML
    void mostrarBuscaMedico(MouseEvent event) {
        disableAnchor(anchorCadastrarPaciente);
        disableAnchor(anchorCadastrarMedico);
        disableAnchor(anchorCadastrarEnfermidade);
        disableAnchor(anchorBuscarPaciente);
        disableAnchor(anchorAgendarConsulta);
        enableAnchor(anchorBuscarMedico);
    }

    @FXML
    void mostrarBuscaPaciente(MouseEvent event) {
        disableAnchor(anchorCadastrarPaciente);
        disableAnchor(anchorCadastrarMedico);
        disableAnchor(anchorCadastrarEnfermidade);
        disableAnchor(anchorBuscarMedico);
        disableAnchor(anchorAgendarConsulta);
        enableAnchor(anchorBuscarPaciente);
    }

    @FXML
    void mostrarCadastroEnfermidade(MouseEvent event) {
        disableAnchor(anchorCadastrarPaciente);
        disableAnchor(anchorCadastrarMedico);
        disableAnchor(anchorBuscarPaciente);
        disableAnchor(anchorBuscarMedico);
        disableAnchor(anchorAgendarConsulta);
        enableAnchor(anchorCadastrarEnfermidade);
    }

    @FXML
    void mostrarCadastroMedico(MouseEvent event) {
        disableAnchor(anchorCadastrarPaciente);
        disableAnchor(anchorCadastrarEnfermidade);
        disableAnchor(anchorBuscarPaciente);
        disableAnchor(anchorBuscarMedico);
        disableAnchor(anchorAgendarConsulta);
        enableAnchor(anchorCadastrarMedico);
    }

    @FXML
    void mostrarCadastroPaciente(MouseEvent event) {
        disableAnchor(anchorCadastrarMedico);
        disableAnchor(anchorCadastrarEnfermidade);
        disableAnchor(anchorBuscarPaciente);
        disableAnchor(anchorBuscarMedico);
        disableAnchor(anchorAgendarConsulta);
        enableAnchor(anchorCadastrarPaciente);
    }

    //LISTAS DE DADOS PARA AS TABELAS
    Enfermidade sinusite = new Enfermidade("Sinusite", "Dor de cabeça, coriza", "Otorrino");
    Enfermidade gripe = new Enfermidade("Gripe", "Coriza, Tosse", "Otorrino");

    ObservableList<Paciente> listaPacientesMain = FXCollections.observableArrayList(
        new Paciente("Pedro", 22, sinusite),
        new Paciente("Gustavo", 17, sinusite)
    );

    ObservableList<Medico> listaMedicosMain = FXCollections.observableArrayList(
        new Medico("Bruno", 41, "Endócrino", listaPacientesMain)
    );

    //LISTA PARA A CHOICEBOX
    ObservableList<String> listaEnfermidades = FXCollections.observableArrayList(
        sinusite.getNome(), gripe.getNome()
    );


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // SETANDO TABELA PRINCIPAL PACIENTES
        nomePacientesMain.setCellValueFactory(new PropertyValueFactory<Paciente, String>("nome"));
        idadePacientesMain.setCellValueFactory(new PropertyValueFactory<Paciente, Integer>("idade"));
        enfermidadePacientesMain.setCellValueFactory(new PropertyValueFactory<Paciente, Enfermidade>("enfermidade"));
        tabelaPacientesMain.setItems(listaPacientesMain);

        // SETANDO TABELA PRINCIPAL MEDICOS
        nomeMedicosMain.setCellValueFactory(new PropertyValueFactory<Medico, String>("nome"));
        idadeMedicosMain.setCellValueFactory(new PropertyValueFactory<Medico, Integer>("idade"));
        departamentoMedicosMain.setCellValueFactory(new PropertyValueFactory<Medico, String>("departamento"));
        pacientesMedicosMain.setCellValueFactory(new PropertyValueFactory<Medico, Paciente>("pacientes"));
        tabelaMedicosMain.setItems(listaMedicosMain);

        // SETANDO TABELA PACIENTES PARA CADASTRAR MÉDICO
        nomeCadastroMedico.setCellValueFactory(new PropertyValueFactory<Paciente, String>("nome"));
        selecionarCadastroMedico.setCellValueFactory(new PropertyValueFactory<Paciente, CheckBox>("select"));
        tabelapacientesCadastroMedico.setItems(listaPacientesMain);

        // SETANDO CHOICE BOX
        campoenfermidadeCadastroPaciente.setItems(listaEnfermidades);

        //SETANDO SPINNER
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100);
        valueFactory.setValue(18);
        campoidadeCadastroPaciente.setValueFactory(valueFactory);
        campoidadeCadastroMedico.setValueFactory(valueFactory);
        
        

        System.out.println("oi");
    }

}

