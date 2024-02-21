public class MainHeranca {

    public static void main(String[] args) {

        System.out.println("Main AntiPattern");

        Comum comum = new Comum("Alec", 25, 555);
        comum.fazerEmprestimo();

        Empresa empresa = new Empresa("Pedro", 22, 62423661);
        empresa.fazerEmprestimo();

    }

}
