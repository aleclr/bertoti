package hospital;

import java.util.LinkedList;
import java.util.List;

public class Medico {
    
    private String nome;
    private int idade;
    private String departamento;
    private List<Paciente> pacientes = new LinkedList<Paciente>();

    public Medico(String nome, int idade, String departamento, List<Paciente> pacientes) {
        this.nome = nome;
        this.idade = idade;
        this.departamento = departamento;
        this.pacientes = pacientes;
    };

    public String getNome() {
        return nome;
    };

    public void setNome(String nome) {
        this.nome = nome;
    };

    public int getIdade() {
        return idade;
    };

    public void setIdade(int idade) {
        this.idade = idade;
    };

    public String getDepartamento() {
        return departamento;
    };

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    };

    public List<Paciente> getPacientes() {
        return pacientes;
    };

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

}
