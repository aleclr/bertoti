import javax.swing.UIDefaults.ProxyLazyValue;

public class Cliente {

    private String nome;
    private Emprestimo emprestimo;

    public void setNome(String nome) {
        this.nome = nome;
    };

    public String getNome() {
        return nome;
    };

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    };

    public Cliente(String nome, Emprestimo emprestimo) {
        this.nome = nome;
        this.emprestimo = emprestimo;
    };

    public void fazerEmprestimo() {

        emprestimo.emprestar();

    };
}
