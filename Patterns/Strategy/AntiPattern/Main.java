public class Main {

    public static void main(String[] args) {

        Comum comum = new Comum("Alec", "25", "555");
        comum.fazerEmprestimo();

        Empresa empresa = new Empresa("Pedro", "22", "562423661");
        empresa.fazerEmprestimo();

    }

}
