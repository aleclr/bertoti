package hospital;

public class Enfermidade {
    
    private String nome;
    private String sintomas;
    private String departamento;

    public Enfermidade(String nome, String sintomas, String departamento) {
        this.nome = nome;
        this.sintomas = sintomas;
        this.departamento = departamento;
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSintomas() {
        return sintomas;
    };

    public void setSintomas(String descricao) {
        this.sintomas = descricao;
    };
    public String getDepartamento() {
        return departamento;
    };
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    };
    
}
