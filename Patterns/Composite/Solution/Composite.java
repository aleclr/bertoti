import java.util.LinkedList;

public class Composite {

    public static void main(String[] args) {

        SoldadoComp s1 = new SoldadoComp("Jonas");
        SoldadoComp s2 = new SoldadoComp("Katie");
        SoldadoComp s3 = new SoldadoComp("Deborah");

        PelotaoComp pelotaoUm = new PelotaoComp("CompositePattern", new LinkedList<UnidadeMilitar>());
        pelotaoUm.addUnidadeMilitar(s1);
        pelotaoUm.addUnidadeMilitar(s2);

        PelotaoComp pelotaoDois = new PelotaoComp("O melhor pattern", new LinkedList<UnidadeMilitar>());
        pelotaoDois.addUnidadeMilitar(pelotaoUm);
        pelotaoDois.addUnidadeMilitar(s3);

    }

}
