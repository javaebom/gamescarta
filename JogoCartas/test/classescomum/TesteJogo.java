/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package classescomum;

import jogo.classescomum.Pilha;
import jogo.classescomum.Fundacao;
import jogo.freecell.Freecell;
import jogo.classescomum.Baralho;
import jogo.classescomum.Jogo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fernanda
 */
public class TesteJogo {

    public TesteJogo() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    /**
     * Testa se as cartas estão sendo distribuidas corretamente para uma Pilha
     */
    @Test
     public void testaDistribuicaoDeCartas() {
    Baralho baralho = new Baralho();
    baralho.inicializaBaralho();
    baralho.embaralhaBaralho();
    Jogo jogo = new Freecell();
    Pilha fundacoes = new Fundacao();
    jogo.distribuirCartas(fundacoes, baralho, 0, 2);

    assertEquals(baralho.baralho.get(0), fundacoes.getPilha().get(0));
    assertEquals(baralho.baralho.get(1), fundacoes.getPilha().get(1));


    }

}