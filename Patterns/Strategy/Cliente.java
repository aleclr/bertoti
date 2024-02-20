public class Cliente {

    private String nome;
    private Emprestimo emprestimo;

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    public Cliente(String nome, Emprestimo emprestimo) {
        this.nome = nome;
        this.emprestimo = emprestimo;
    }

    public void fazerEmprestimo() {

        emprestimo.emprestar();

    };
}
