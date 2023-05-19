package hospital;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    Enfermidade covid = new Enfermidade("Febre, Dor de cabeça, Coriza", "Otorrino");
    Paciente alec = new Paciente("Alec", 25, covid);

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    };

    @Test
    public void testePaciente() {
        assertTrue("Success", alec.getNome().equals("Alec"));
    };

    @Test
    public void testePacienteEnfermidade() {
        assertEquals("Otorrino", alec.getEnfermidade().getDepartamento());
    };

}
