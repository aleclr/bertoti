package hospital;

import javafx.scene.control.CheckBox;

public class Paciente 
{

    private String nome;
    private int idade;
    private Enfermidade enfermidade;
    private CheckBox select;

    public Paciente(String nome, int idade, Enfermidade enfermidade) {
        this.nome = nome;
        this.idade = idade;
        this.enfermidade = enfermidade;
        this.select = new CheckBox();
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

    public CheckBox getSelect() {
        return select;
    }

    public void setSelect(CheckBox select) {
        this.select = select;
    }
    
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
