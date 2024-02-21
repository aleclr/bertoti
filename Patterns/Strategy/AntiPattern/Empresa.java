public class Empresa extends Cliente {

    private int cnpj;

    public Empresa(String nome, int idade, int cnpj) {
        super(nome, idade);
        this.cnpj = cnpj;
    };

    public void fazerEmprestimo() {
        System.out.println("Empréstimo concedido com sucesso.");
    };

}
