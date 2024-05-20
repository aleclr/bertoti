public class MainFacade {
    
    public static void main(String[] args) {
        
        MotorCarro motorCarro = new MotorCarro();
        PainelCarro painelCarro = new PainelCarro();
        RadioCarro radioCarro = new RadioCarro();

        CarroFacade carroFacade = new CarroFacade(motorCarro, painelCarro, radioCarro);

        carroFacade.ligarCarro();

    }

}
