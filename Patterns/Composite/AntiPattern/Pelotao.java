import java.util.LinkedList;

public class Pelotao {

    private String nome;
    private LinkedList<Soldado> soldados;

    public Pelotao(String nome, LinkedList<Soldado> soldados) {
        this.nome = nome;
        this.soldados = soldados;
    };

    public LinkedList<Soldado> getSoldados() {
        return soldados;
    };

    public void setSoldados(LinkedList<Soldado> soldados) {
        this.soldados = soldados;
    };

    public String getNome() {
        return nome;
    };

    public void setNome(String nome) {
        this.nome = nome;
    };

    public void addSoldado(Soldado soldado) {
        soldados.add(soldado);
        System.out.println("O soldado " + soldado.getNome() + " foi listado para o " + this.getNome() + ".");
    };

}
