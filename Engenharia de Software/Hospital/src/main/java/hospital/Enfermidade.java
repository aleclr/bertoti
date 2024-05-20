package hospital;

public class Enfermidade {
    
    private String sintomas;
    private String departamento;

    public Enfermidade(String sintomas, String departamento) {
        this.sintomas = sintomas;
        this.departamento = departamento;
    };

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
