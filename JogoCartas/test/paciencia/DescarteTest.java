package pilhas.tipo;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import jogo.classescomum.Carta;
import jogo.paciencia.Descarte;
import jogo.paciencia.Paciencia;
import java.util.Stack;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dede do Bem
 */
public class DescarteTest {

    public DescarteTest() {
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

    
    @Test
    public void TesteVirarUmaCartaPilhaEstoque() {
        System.out.println("virarUmaCartaPilhaEstoque");
        
        Paciencia novoJogo = new Paciencia();
        novoJogo.iniciarJogo();
        
        Stack estoque = new Stack();
        Descarte descarte = new Descarte();
        
        Carta cartaEstoque = new Carta();
        cartaEstoque.setCarta(4, "OURO");
        estoque.push(cartaEstoque);
        
        assertEquals(cartaEstoque, descarte.virarUmaCartaPilhaEstoque(estoque));       
        
    }

}