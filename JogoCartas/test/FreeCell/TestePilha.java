/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FreeCell;

import jogo.Carta;
import java.util.Stack;
import jogo.Pilha;
import jogo.Fileiras;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class TestePilha {

    Pilha pilhaFileiras = new Fileiras();
    Stack<Carta> pilha = new Stack<Carta>();

    public TestePilha() {
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
    @Test
    public void testeAdicionarCarta() {
        Carta carta2Ouro = new Carta();
        Carta carta3Ouro = new Carta();
        Carta carta4Ouro = new Carta();

        carta2Ouro.setCarta(2, "OURO");
        carta3Ouro.setCarta(3, "OURO");
        carta4Ouro.setCarta(4, "OURO");
   
        pilha.push(carta4Ouro);
        pilha.push(carta3Ouro);
        pilha.push(carta2Ouro);

        pilhaFileiras.adicionarCarta(pilha);
        assertEquals(carta4Ouro,pilhaFileiras.getPilha().get(2));
        assertEquals(carta3Ouro,pilhaFileiras.getPilha().get(1));
        assertEquals(carta2Ouro,pilhaFileiras.getPilha().get(0));
    }
}
