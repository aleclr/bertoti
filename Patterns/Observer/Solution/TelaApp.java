public class TelaApp implements Observer {

    public void update(double velocidade, double distancia) {
        System.out.println("Dados do trajeto (velocidade = '" + velocidade + "'" + "e pressao = '" + distancia
                + "') atualizados na Tela do App.");
    }

    public TelaApp() {

    };

}
