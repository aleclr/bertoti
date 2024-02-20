public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Alec", new Permitido());

        cliente.setEmprestimo(new Proibido());

        cliente.fazerEmprestimo();

    };

}
