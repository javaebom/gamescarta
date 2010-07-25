/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FreeCell;

import jogo.classescomum.Carta;
import jogo.classescomum.Pilha;
import jogo.classescomum.Fileiras;
import java.util.Stack;
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
    /**
     * Metodo que testa a adicao de carta(s) em uma pilha
     */
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
        assertEquals(carta4Ouro, pilhaFileiras.getPilha().get(2));
        assertEquals(carta3Ouro, pilhaFileiras.getPilha().get(1));
        assertEquals(carta2Ouro, pilhaFileiras.getPilha().get(0));
    }

    /**
     * Metodo que testa a remocao de carta(s) em uma pilha
     */
    @Test
    public void testeRemoverCarta() {

        Carta carta2Ouro = new Carta();
        Carta carta3Ouro = new Carta();
        Carta carta4Ouro = new Carta();
        Carta carta1Paus = new Carta();
        Carta carta2Paus = new Carta();
        Carta carta3Paus = new Carta();

        carta2Ouro.setCarta(2, "OURO");
        carta3Ouro.setCarta(3, "OURO");
        carta4Ouro.setCarta(4, "OURO");
        carta1Paus.setCarta(1, "PAUS");
        carta2Paus.setCarta(2, "PAUS");
        carta3Paus.setCarta(3, "PAUS");

        //A pilha tem no topo carta2Ouro e na base carta3Paus
        pilha.push(carta3Paus);
        pilha.push(carta2Paus);
        pilha.push(carta1Paus);
        pilha.push(carta4Ouro);
        pilha.push(carta3Ouro);
        pilha.push(carta2Ouro);

        pilhaFileiras.adicionarCarta(pilha);
        pilhaFileiras.removerCarta(carta1Paus);

        assertEquals(carta4Ouro, pilhaFileiras.getPilha().get(2));
        assertEquals(carta3Ouro, pilhaFileiras.getPilha().get(1));
        assertEquals(carta2Ouro, pilhaFileiras.getPilha().get(0));
    }

    /**
     * Metodo que testa a obtencao da posicao de uma carta na pilha
     */
    @Test
    public void testeCapturarPosicaoCarta() {
        Carta carta2Ouro = new Carta();
        Carta carta3Ouro = new Carta();
        Carta carta4Ouro = new Carta();
        Carta carta5Ouro = new Carta();

        carta2Ouro.setCarta(2, "OURO");
        carta3Ouro.setCarta(3, "OURO");
        carta4Ouro.setCarta(4, "OURO");
        carta4Ouro.setCarta(5, "OURO");


        //topo: 2 e base: 5
        pilha.push(carta5Ouro);
        pilha.push(carta4Ouro);
        pilha.push(carta3Ouro);
        pilha.push(carta2Ouro);

        pilhaFileiras.adicionarCarta(pilha);

        assertEquals(1, pilhaFileiras.capturarPosicaoCarta(carta4Ouro));

    }

    /**
     * Metodo que testa a obtencao de carta em uma pilha a partir de nipe e valor
     */
    @Test
    public void testeSelecionarCarta() {
        Carta carta2Ouro = new Carta();
        Carta carta3Ouro = new Carta();
        Carta carta4Ouro = new Carta();
        Carta carta5Ouro = new Carta();

        carta2Ouro.setCarta(2, "OURO");
        carta3Ouro.setCarta(3, "OURO");
        carta4Ouro.setCarta(4, "OURO");
        carta4Ouro.setCarta(5, "OURO");


        //topo: 2 e base: 5
        pilha.push(carta5Ouro);
        pilha.push(carta4Ouro);
        pilha.push(carta3Ouro);
        pilha.push(carta2Ouro);

        pilhaFileiras.adicionarCarta(pilha);

        assertEquals(carta3Ouro, this.pilhaFileiras.selecionarCarta(3, "OURO"));

    }

    /**
     * Metodo que testa a obtencao da quantidade maxima de cartas que podem ser movidas entre fileiras
     */
    @Test
    public void testeSetAndGetQtdMaxCartasMover() {

        int numCelulasVazias = 4;
        pilhaFileiras.setQtdMaxCartasMover(numCelulasVazias);

        assertEquals(5, pilhaFileiras.getQtdMaxCartasMover());


        numCelulasVazias = 1;
        pilhaFileiras.setQtdMaxCartasMover(numCelulasVazias);

        assertEquals(2, pilhaFileiras.getQtdMaxCartasMover());


    }
}
