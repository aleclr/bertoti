import java.util.LinkedList;
import java.util.List;

public class PelotaoComp implements UnidadeMilitar {

    private String nome;
    private List<UnidadeMilitar> unidades = new LinkedList();

    public PelotaoComp(String nome, List<UnidadeMilitar> unidades) {
        this.nome = nome;
        this.unidades = unidades;
    };

    public String getNome() {
        return nome;
    };

    public void setNome(String nome) {
        this.nome = nome;
    };

    public List<UnidadeMilitar> getUnidades() {
        return unidades;
    };

    public void setUnidades(List<UnidadeMilitar> unidades) {
        this.unidades = unidades;
    };

    public void addUnidadeMilitar(UnidadeMilitar unidade) {
        unidades.add(unidade);
        System.out.println(
                "A unidade militar " + unidade.getNome() + " foi adicionada ao Pelotão " + this.nome + ".");
    };

}
