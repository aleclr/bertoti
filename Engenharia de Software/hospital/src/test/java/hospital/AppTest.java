package hospital;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    LinkedList<Paciente> listaPacientesRecepcao = new LinkedList<Paciente>();

    Enfermidade covid = new Enfermidade("Febre, Dor de cabeça, Coriza", "Otorrino");
    Enfermidade gripe = new Enfermidade("Congestionamento nasal, Tosse, Dor de cabeça", "Otorrino");
    Enfermidade carie = new Enfermidade("Dor de dente, Dor de cabeça", "Odonto");
    Paciente alec = new Paciente("Alec", 25, covid);
    Paciente pedro = new Paciente("Pedro", 17, carie);
    Paciente alice = new Paciente("Alice", 19, gripe);
    Medico bruno = new Medico("Bruno", 29, "Otorrino", listaPacientesRecepcao);
    Medico rodrigo = new Medico("Rodrigo", 42, "Odonto", listaPacientesRecepcao);

    LinkedList<Medico> listaNovosMedicos = new LinkedList<Medico>();
    LinkedList<String> listaNovosDepartamentos = new LinkedList<String>();

    Recepcao recepcao = new Recepcao(1, "São Paulo", listaPacientesRecepcao, listaNovosMedicos,
            listaNovosDepartamentos);

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

    @Test
    public void testeListaPacientesNome() {
        listaPacientesRecepcao.add(alec);
        assertEquals("Alec", listaPacientesRecepcao.get(0).getNome());
    }

    @Test
    public void testeListaPacientesIdade() {
        listaPacientesRecepcao.add(alice);
        assertEquals(19, listaPacientesRecepcao.get(0).getIdade());
    }

    @Test
    public void testeListaPacientesEnfermidade() {
        listaPacientesRecepcao.add(pedro);
        assertEquals(carie, listaPacientesRecepcao.get(0).getEnfermidade());
    }

    @Test
    public void testeListaMedicoNome() {
        listaNovosMedicos.add(bruno);
        assertEquals("Bruno", listaNovosMedicos.get(0).getNome());
    }

    @Test
    public void testeListaMedicoIdade() {
        listaNovosMedicos.add(rodrigo);
        assertEquals(42, listaNovosMedicos.get(0).getIdade());
    }

    @Test
    public void testeListaMedicoDepartamento() {
        listaNovosMedicos.add(bruno);
        assertEquals("Otorrino", listaNovosMedicos.get(0).getDepartamento());
    }

    @Test
    public void testeRecepcaoBuscarPaciente() {
        listaPacientesRecepcao.add(alec);
        listaPacientesRecepcao.add(alice);
        listaPacientesRecepcao.add(pedro);
        assertEquals(alec, recepcao.buscarPacientePorNome("Alec").get(0));
    }

    @Test
    public void testeRecepcaoBuscarPaciente2() {
        listaPacientesRecepcao.add(alec);
        listaPacientesRecepcao.add(alice);
        listaPacientesRecepcao.add(pedro);
        assertEquals(alice, recepcao.buscarPacientePorNome("Alice").get(0));
    }

    @Test
    public void testeRecepcaoCadastrarPaciente() {
        recepcao.cadastrarPaciente(pedro);
        assertEquals(pedro, listaPacientesRecepcao.get(0));
    }

    @Test
    public void testeRecepcaoCadastrarPaciente2() {
        recepcao.cadastrarPaciente(pedro);
        recepcao.cadastrarPaciente(alice);
        assertEquals(alice, listaPacientesRecepcao.get(1));
    }

    @Test
    public void testeRecepcaoCadastrarMedico() {
        recepcao.cadastrarMedico(bruno);
        assertEquals(bruno, listaNovosMedicos.get(0));
    }

    @Test
    public void testeRecepcaoCadastrarMedico2() {
        recepcao.cadastrarMedico(bruno);
        recepcao.cadastrarMedico(rodrigo);
        assertEquals(rodrigo, listaNovosMedicos.get(1));
    }

    @Test
    public void testeRecepcaoCadastrarDepto() {
        recepcao.cadastrarDepartamento("Otorrino");
        assertEquals("Otorrino", listaNovosDepartamentos.get(0));
    }

    @Test
    public void testeRecepcaoCadastrarDepto2() {
        recepcao.cadastrarDepartamento("Otorrino");
        recepcao.cadastrarDepartamento("Odonto");
        assertEquals("Odonto", listaNovosDepartamentos.get(1));
    }
}
