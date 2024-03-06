public class MainAutoAcoplamento {

    public static void main(String[] args) {

        Estacao estacao = new Estacao(0, 0);
        Dashboard dashboard = new Dashboard(0, 0);
        TelaEstatistica telaEstatistica = new TelaEstatistica(0, 0);
        TelaPrevisaoDoTempo telaPDT = new TelaPrevisaoDoTempo(0, 0);

        estacao.setMedidas(30, 7);
        dashboard.update(estacao.getTemperatura(), estacao.getPressao());
        telaEstatistica.update(estacao.getTemperatura(), estacao.getPressao());
        telaPDT.update(estacao.getTemperatura(), estacao.getPressao());

    }

}
