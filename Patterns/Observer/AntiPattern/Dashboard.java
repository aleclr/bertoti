public class Dashboard extends Estacao {

    public Dashboard(double temperatura, double pressao) {
        super(temperatura, pressao);
    }

    public void update(double temperatura, double pressao) {
        // temperatura = getTemperatura();
        // pressao = getPressao();
        System.out.println("Temperatura e Pressao atualizadas no Dashboard!");
    }

}
