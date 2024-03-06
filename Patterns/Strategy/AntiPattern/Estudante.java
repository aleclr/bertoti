public class Estudante extends Cliente {

    private int ra;

    public Estudante(String nome, int idade, int ra) {
        super(nome, idade);
        this.ra = ra;
    };

    public void fazerEmprestimo() {
        System.out.println("Empréstimo concedido para clientes " + this.getClass() + ".");
    };

}
