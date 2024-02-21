public class Idoso extends Cliente {

    private int cpf;

    public Idoso(String nome, int idade, int cpf) {
        super(nome, idade);
        this.cpf = cpf;
    };

    public void fazerEmprestimo() {
        System.out.println("Empréstimo negado.");
        return;
    };

}
