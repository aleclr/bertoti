public class MainAntiFacade {
    
    public static void main(String[] args) {
        
        LuzAmbiente luzAmbiente = new LuzAmbiente();
        Subwoofer subwoofer = new Subwoofer();
        Televisao televisao = new Televisao();

        luzAmbiente.ligarLuz();
        televisao.ligarTelevisao();
        subwoofer.ligarSubwoofer();
        System.out.println("COMEÇANDO FILME >>>");

        System.out.println("FIM DO FILME FILME <<<");
        luzAmbiente.desligarLuz();
        televisao.desligarTelevisao();
        subwoofer.desligarSubwoofer();
        
    }
}

