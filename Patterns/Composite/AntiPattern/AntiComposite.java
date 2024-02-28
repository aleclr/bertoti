import java.util.LinkedList;

public class AntiComposite {

    public static void main(String[] args) {
        Soldado alec = new Soldado("Alec");
        Soldado pedro = new Soldado("Pedro");
        Soldado lucas = new Soldado("Lucas");

        Pelotao pelotao = new Pelotao("Pelotao1", new LinkedList<Soldado>());
        pelotao.addSoldado(alec);
        pelotao.addSoldado(pedro);
        System.out.println(pelotao.getSoldados());

        Batalhao batalhao = new Batalhao("Batalhao1", new LinkedList<Soldado>(), new LinkedList<Pelotao>());
        batalhao.addUnidadeMilitar(lucas);
        batalhao.addUnidadeMilitar(pelotao);
    }

}
