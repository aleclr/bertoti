public class TelaWeb implements Observer {

    public void update(double velocidade, double distancia) {
        System.out.println("Dados do trajeto (velocidade = '" + velocidade + "'" + "e distância = '" + distancia
                + "') atualizados na Tela do Website.");
    }

    public TelaWeb() {
    };

}
