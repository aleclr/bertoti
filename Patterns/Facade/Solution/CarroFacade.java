public class CarroFacade {
    
    private MotorCarro motor;
    private PainelCarro painel;
    private RadioCarro radio;

    public CarroFacade(MotorCarro motor, PainelCarro painel, RadioCarro radio) {
        this.motor = motor;
        this.painel = painel;
        this.radio = radio;
    };

    public void ligarCarro() {
        System.out.println("Chave inserida! Ligando o carro:");
        motor.ligarMotor();
        painel.ligarPainel();
        radio.ligarRadio();
    };

    public void desligarCarro() {
        System.out.println("Chave retirada. Desligando o carro...");
        radio.desligarRadio();
        painel.desligarPainel();
        motor.desligarMotor();
    };

}
