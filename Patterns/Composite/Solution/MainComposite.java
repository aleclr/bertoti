import java.util.LinkedList;

public class MainComposite {

    public static void main(String[] args) {

        SoldadoComp jonas = new SoldadoComp("Jonas");
        SoldadoComp katie = new SoldadoComp("Katie");
        SoldadoComp deborah = new SoldadoComp("Deborah");

        PelotaoComp pelotaoUm = new PelotaoComp("Pelotão-Um", new LinkedList<UnidadeMilitar>());
        pelotaoUm.addUnidadeMilitar(jonas);
        pelotaoUm.addUnidadeMilitar(katie);

        PelotaoComp pelotaoDois = new PelotaoComp("Pelotão-Dois", new LinkedList<UnidadeMilitar>());
        pelotaoDois.addUnidadeMilitar(pelotaoUm);
        pelotaoDois.addUnidadeMilitar(deborah);

    }

}
