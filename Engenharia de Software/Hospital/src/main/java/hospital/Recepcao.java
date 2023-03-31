package hospital;

import java.util.LinkedList;
import java.util.List;

public class Recepcao {
    private int id;
    private String local;
    private List<Paciente> pacientes = new LinkedList<Paciente>();
    private List<Medico> medicos = new LinkedList<Medico>();
    private List<String> departamentos = new LinkedList<String>();

    public Recepcao(int id, String local, List<Paciente> pacientes, List<Medico> medicos, List<String> departamentos) {
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

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    };

    public List<Medico> getMedicos() {
        return medicos;
    };

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    };

    public List<String> getDepartamentos() {
        return departamentos;
    };

    public void setDepartamentos(List<String> departamentos) {
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

}
