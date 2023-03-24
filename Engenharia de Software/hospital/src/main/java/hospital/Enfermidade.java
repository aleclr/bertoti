package hospital;

public class Enfermidade {
    
    private String descricao;
    private String departamento;

    public Enfermidade(String descricao, String departamento) {
        this.descricao = descricao;
        this.departamento = departamento;
    };

    public String getDescricao() {
        return descricao;
    };

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    };
    public String getDepartamento() {
        return departamento;
    };
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    };
    
}
