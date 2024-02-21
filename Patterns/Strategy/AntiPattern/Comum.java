public class Comum extends ClienteHeranca {

    private int carteirinha;

    public Comum(String nome, int idade, int carteirinha) {
        super(nome, idade);
        this.carteirinha = carteirinha;
    };

    public void fazerEmprestimo() {
        System.out.println("Empréstimo negado.");
        return;
    };

}
