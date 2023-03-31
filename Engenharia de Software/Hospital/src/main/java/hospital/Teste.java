package hospital;

import java.util.LinkedList;
import java.util.List;

public class Teste {
    
    public static void main(String[] args) {
        
            Enfermidade gripe = new Enfermidade("tosse, coriza", "otorrino");
            System.out.println(gripe.getSintomas());

            Paciente pedro = new Paciente("Pedro Costa", 23, new Enfermidade("dor de cabeça, mau estar", "otorrino"));
            System.out.println(pedro.getIdade() + " " + pedro.getEnfermidade());

            Paciente maria = new Paciente("Maria Ferreira", 18, new Enfermidade("dor de dente", "odonto"));

            List<Paciente> novosPacientes = new LinkedList<Paciente>();
            novosPacientes.add(pedro);
            novosPacientes.add(maria);

    }
}
