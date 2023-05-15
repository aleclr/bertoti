package hospital;

import java.util.LinkedList;
import java.util.List;

public class Teste {
    
    public static void main(String[] args) {
        
            //TESTE CLASSES BASE
            Enfermidade gripe = new Enfermidade("tosse, coriza", "otorrino");
            System.out.println(gripe.getSintomas());

            Paciente pedro = new Paciente("Pedro Costa", 23, new Enfermidade("dor de cabeça, mau estar", "otorrino"));
            System.out.println(pedro.getIdade() + " " + pedro.getEnfermidade());

            Paciente maria = new Paciente("Maria Ferreira", 18, new Enfermidade("dor de dente", "odonto"));

            LinkedList<Paciente> listaNovosPacientes = new LinkedList<Paciente>();
            listaNovosPacientes.add(pedro);
            listaNovosPacientes.add(maria);

            LinkedList<Medico> listaNovosMedicos = new LinkedList<Medico>();
            LinkedList<String> listaNovosDepartamentos = new LinkedList<String>();

            System.out.println(listaNovosPacientes.get(0).getNome());

            //DADOS PARA SEREM CADASTRADOS
            Paciente lucas = new Paciente("Lucas Martines", 25, gripe);
            LinkedList<Paciente> listaPacientesBruno = new LinkedList<Paciente>();
            listaPacientesBruno.add(pedro);
            listaPacientesBruno.add(lucas);
            Medico bruno = new Medico("Bruno Rodrigo", 41, "Proctologia", listaPacientesBruno);

            //TESTES RECEPCAO
            Recepcao recepcao = new Recepcao(0, "São Paulo", listaNovosPacientes , listaNovosMedicos, listaNovosDepartamentos);
            System.out.println(recepcao.getLocal());
            System.out.println(recepcao.getPacientes());
            System.out.println(recepcao.getMedicos());

            //cadastro de paciente pela recepção
            recepcao.cadastrarPaciente(lucas);
            System.out.println(recepcao.getPacientes().get(2).getNome());

            //cadastro de medico pela recepção
            recepcao.cadastrarMedico(bruno);
            System.out.println(listaNovosMedicos.get(0).getNome());

            //cadastro de departamento
            recepcao.cadastrarDepartamento("Proctologia");

            //teste busca de pacientes
            System.out.println(recepcao.buscarPacientePorNome("Pedro Costa"));

    }
}
