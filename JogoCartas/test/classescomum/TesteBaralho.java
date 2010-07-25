/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classescomum;

import jogo.classescomum.Baralho;
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
public class TesteBaralho {

    public TesteBaralho() {
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
     * Testa se o baralho tem 52 cartas
     */
    @Test
    public void testeBaralho52Carta() {
        Baralho baralho = new Baralho();
        baralho.inicializaBaralho();
        assertEquals(52, baralho.baralho.size());
    }

    /**
     * Testa se foram criado as 13 cartas com o nipe Espada
     */
    @Test
    public void testeNipesEspada() {
        Baralho baralho = new Baralho();
        baralho.inicializaBaralho();
        for (int i = 0; i < 13; i++) {
            assertEquals("ESPADA", baralho.baralho.get(i).getNipe());
            assertEquals(i + 1, baralho.baralho.get(i).getNumero());
        }
    }

    /**
     * Testa se foram criado as 13 cartas com o nipe Paus
     */
    @Test
    public void testeNipesPaus() {
        Baralho baralho = new Baralho();
        baralho.inicializaBaralho();
        for (int i = 0; i < 13; i++) {
            assertEquals("PAUS", baralho.baralho.get(i + 13).getNipe());
            assertEquals(i + 1, baralho.baralho.get(i + 13).getNumero());
        }
    }

    /**
     * Testa se foram criado as 13 cartas com o nipe Copas
     */
    @Test
    public void testeNipesCopas() {
        Baralho baralho = new Baralho();
        baralho.inicializaBaralho();
        for (int i = 0; i < 13; i++) {
            assertEquals("COPAS", baralho.baralho.get(i + 26).getNipe());
            assertEquals(i + 1, baralho.baralho.get(i + 26).getNumero());
        }
    }

    /**
     * Testa se foram criado as 13 cartas com o nipe Ouro
     */
    @Test
    public void testeNipesOuro() {
        Baralho baralho = new Baralho();
        baralho.inicializaBaralho();
        for (int i = 0; i < 13; i++) {
            assertEquals("OURO", baralho.baralho.get(i + 39).getNipe());
            assertEquals(i + 1, baralho.baralho.get(i + 39).getNumero());
        }
    }
}
