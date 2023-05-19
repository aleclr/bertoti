package hospital;

import java.util.LinkedList;
import java.util.List;

public class Recepcao {
    private int id;
    private String local;
    private LinkedList<Paciente> pacientes = new LinkedList<Paciente>();
    private LinkedList<Medico> medicos = new LinkedList<Medico>();
    private LinkedList<String> departamentos = new LinkedList<String>();

    public Recepcao(int id, String local, LinkedList<Paciente> pacientes, LinkedList<Medico> medicos,
            LinkedList<String> departamentos) {
        this.id = id;
        this.local = local;
        this.pacientes = pacientes;
        this.medicos = medicos;
        this.departamentos = departamentos;
    };

    public int getId() {
        return id;
    };

    public void setId(int id) {
        this.id = id;
    };

    public String getLocal() {
        return local;
    };

    public void setLocal(String local) {
        this.local = local;
    };

    public List<Paciente> getPacientes() {
        return pacientes;
    };

    public void setPacientes(LinkedList<Paciente> pacientes) {
        this.pacientes = pacientes;
    };

    public List<Medico> getMedicos() {
        return medicos;
    };

    public void setMedicos(LinkedList<Medico> medicos) {
        this.medicos = medicos;
    };

    public List<String> getDepartamentos() {
        return departamentos;
    };

    public void setDepartamentos(LinkedList<String> departamentos) {
        this.departamentos = departamentos;
    };

    public void cadastrarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    };

    public void cadastrarMedico(Medico medico) {
        medicos.add(medico);
    };

    public void cadastrarDepartamento(String departamento) {
        departamentos.add(departamento);
    };

    public LinkedList<Paciente> buscarPacientePorNome(String nome) {
        LinkedList<Paciente> resultado = new LinkedList<Paciente>();

        for (int i = 0; i < pacientes.size(); i++) {
            if (nome.equals(pacientes.get(i).getNome())) {
                resultado.add(pacientes.get(i));
            }
        }
        ;

        return resultado;
    };

}
