public class TelaEstatistica extends Estacao {

    public TelaEstatistica(double temperatura, double pressao) {
        super(temperatura, pressao);
    }

    public void update(double temperatura, double pressao) {
        // temperatura = getTemperatura();
        // pressao = getPressao();
        System.out.println("Temperatura e Pressao atualizadas na Tela de Estatistica!");
    }

}
