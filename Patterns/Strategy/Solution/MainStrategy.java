public class MainStrategy {

    public static void main(String[] args) {

        System.out.println("Main Pattern");

        Cliente cliente = new Cliente("Alec", new Permitido());

        cliente.setEmprestimo(new Proibido());

        cliente.fazerEmprestimo();

    };

}
