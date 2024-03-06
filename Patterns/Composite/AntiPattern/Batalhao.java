import java.util.LinkedList;

public class Batalhao {

    private String nome;
    private LinkedList<Soldado> soldados;
    private LinkedList<Pelotao> pelotoes;

    public Batalhao(String nome, LinkedList<Soldado> soldados, LinkedList<Pelotao> pelotoes) {
        this.nome = nome;
        this.soldados = soldados;
        this.pelotoes = pelotoes;
    };

    public String getNome() {
        return nome;
    };

    public void setNome(String nome) {
        this.nome = nome;
    };

    public LinkedList<Soldado> getSoldados() {
        return soldados;
    };

    public void setSoldados(LinkedList<Soldado> soldados) {
        this.soldados = soldados;
    };

    public LinkedList<Pelotao> getPelotoes() {
        return pelotoes;
    };

    public void setPelotoes(LinkedList<Pelotao> pelotoes) {
        this.pelotoes = pelotoes;
    };

    public void addUnidadeMilitar(Soldado soldado) {
        soldados.add(soldado);
        System.out.println("O soldado " + soldado.getNome() + " foi listado para o " + this.getNome() + ".");
    };

    public void addUnidadeMilitar(Pelotao pelotao) {
        pelotoes.add(pelotao);
        System.out.println("O pelotão " + pelotao.getNome() + " foi listado para o " + this.getNome() + ".");
    };

}
