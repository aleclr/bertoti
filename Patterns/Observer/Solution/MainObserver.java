import java.util.LinkedList;

public class MainObserver {

    public static void main(String[] args) {

        TelaApp app = new TelaApp();
        TelaCarro carro = new TelaCarro();
        TelaWeb website = new TelaWeb();

        Trajeto trajeto = new Trajeto(80, 50, new LinkedList<Observer>());
        trajeto.addObserver(app);
        trajeto.addObserver(carro);
        trajeto.addObserver(website);

        trajeto.notifyObservers();

    }

}
