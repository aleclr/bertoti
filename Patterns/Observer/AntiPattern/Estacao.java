public class Estacao {

    private double temperatura;
    private double pressao;

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getPressao() {
        return pressao;
    }

    public void setPressao(double pressao) {
        this.pressao = pressao;
    }

    public Estacao(double temperatura, double pressao) {
        this.temperatura = temperatura;
        this.pressao = pressao;
    }

    public void setMedidas(double temperatura, double pressao) {

        this.temperatura = temperatura;
        this.pressao = pressao;

    }
}
