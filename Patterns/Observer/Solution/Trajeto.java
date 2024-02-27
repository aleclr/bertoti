import java.util.LinkedList;

public class Trajeto {

    private double velocidade;
    private double distancia;
    private LinkedList<Observer> observers = new LinkedList<>();

    public Trajeto(double velocidade, double distancia, LinkedList<Observer> observers) {
        this.velocidade = velocidade;
        this.distancia = distancia;
        this.observers = observers;
    }

    public LinkedList<Observer> getObservers() {
        return observers;
    }

    public void setObservers(LinkedList<Observer> observers) {
        this.observers = observers;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void setDados(double velocidade, double distancia) {
        this.velocidade = velocidade;
        this.distancia = distancia;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {

        for (Observer observer : observers) {
            observer.update(getVelocidade(), getDistancia());
        }

    }

}
