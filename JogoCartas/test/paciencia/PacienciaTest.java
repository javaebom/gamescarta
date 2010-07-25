package paciencia;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import jogo.paciencia.Paciencia;
import jogo.classescomum.Baralho;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * *Classe que testa metodos da classe Paciencia
 * @author Andre e Wilson
 */

public class PacienciaTest {

    public static final int TOTALCARTAS = 52;
    
    public PacienciaTest() {
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

    /**
     * Test of iniciarJogo method, of class Paciencia.
     */
    @Test
    public void testParaVerificarSeComecaComONumeroCorretoDeCartas() {
        System.out.println("Verificar total de cartas!");
        Baralho testeNumeroCarta = new Baralho();
        testeNumeroCarta.inicializaBaralho();
        assertEquals(TOTALCARTAS, testeNumeroCarta.baralho.size());
        
    }

    @Test
    public void testParaVerificarSeAFundacao1FoiCriadaVazia() {
        System.out.println("Verificar fundacao 1!");
        Paciencia novoJogo = new Paciencia();
        novoJogo.iniciarJogo();        
        assertTrue(novoJogo.fundacao1.getPilha().empty());
        
    }
    
    @Test
    public void testParaVerificarSeAFundacao2FoiCriadaVazia() {
        System.out.println("Verificar fundacao 2!");
        Paciencia novoJogo = new Paciencia();
        novoJogo.iniciarJogo();

        assertTrue(novoJogo.fundacao2.getPilha().empty());
        
    }
    
    @Test
    public void testParaVerificarSeAFundacao3FoiCriadaVazia() {
        System.out.println("Verificar fundacao 3!");
        Paciencia novoJogo = new Paciencia();
        novoJogo.iniciarJogo();        
        assertTrue(novoJogo.fundacao3.getPilha().empty());
        
    }
    
    @Test
    public void testParaVerificarSeAFundacao4FoiCriadaVazia() {
        System.out.println("Verificar fundacao 4!");
        Paciencia novoJogo = new Paciencia();
        novoJogo.iniciarJogo();        
        assertTrue(novoJogo.fundacao4.getPilha().empty());
        
    }

    @Test
    public void testParaVerificarSeAFileira1FoiCriadaComApenasUmaCarta() {
        System.out.println("Teste inicio fileira 1!");
        Paciencia novoJogo = new Paciencia();
        novoJogo.iniciarJogo();

        assertEquals(1, novoJogo.fileira1.getPilha().size());

    }       

    @Test
    public void testParaVerificarSeAFileira2FoiCriadaComApenasDuasCartas() {
        System.out.println("Teste inicio fileira 2!");

        Paciencia novoJogo = new Paciencia();
        novoJogo.iniciarJogo();

        assertEquals(2, novoJogo.fileira2.getPilha().size());
        

    }

    @Test
    public void testParaVerificarSeAFileira3FoiCriadaComApenasTresCartas() {
        System.out.println("Teste inicio fileira 3!");
        

        Paciencia novoJogo = new Paciencia();
        novoJogo.iniciarJogo();

        assertEquals(3, novoJogo.fileira3.getPilha().size());

    }
    
    @Test
    public void testParaVerificarSeAFileira4FoiCriadaComApenasQuatroCartas() {
        System.out.println("Teste inicio fileira 4!");
        
        Paciencia novoJogo = new Paciencia();
        novoJogo.iniciarJogo();

        assertEquals(4, novoJogo.fileira4.getPilha().size());

    }

    @Test
    public void testParaVerificarSeAFileira5FoiCriadaComApenasCincoCartas() {
        System.out.println("Teste inicio fileira 5!");
        Paciencia novoJogo = new Paciencia();
        novoJogo.iniciarJogo();

        assertEquals(5, novoJogo.fileira5.getPilha().size());

    }
    
    @Test
    public void testParaVerificarSeAFileira6FoiCriadaComApenasSeisCartas() {
        System.out.println("Teste inicio fileira 6!");
        Paciencia novoJogo = new Paciencia();
        novoJogo.iniciarJogo();

        assertEquals(6, novoJogo.fileira6.getPilha().size());
        
    }

    @Test
    public void testParaVerificarSeAFileira7FoiCriadaComApenasSeteCartas() {
        System.out.println("Teste inicio fileira 7!");
        Paciencia novoJogo = new Paciencia();
        novoJogo.iniciarJogo();

        assertEquals(7, novoJogo.fileira7.getPilha().size());
        
    }
       
    

}