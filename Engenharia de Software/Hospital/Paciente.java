package Hospital;

public class Paciente {
    
    private String nome;
    private int idade;
    private Enfermidade enfermidade;

    public Paciente(String nome, int idade, Enfermidade enfermidade) {
        this.nome = nome;
        this.idade = idade;
        this.enfermidade = enfermidade;
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

    public Enfermidade getEnfermidade() {
        return enfermidade;
    };

    public void setEnfermidade(Enfermidade enfermidade) {
        this.enfermidade = enfermidade;
    };
    
}
