package paciencia;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import jogo.classescomum.Fundacao;
import jogo.paciencia.Descarte;
import jogo.classescomum.Baralho;
import jogo.classescomum.Fileira;
import jogo.paciencia.Regras;
import jogo.classescomum.Carta;
import java.util.Stack;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 **Classe que testa metodos da classe Regras
 * @author Andre e Wilson
 */
public class RegrasTest extends TestCase{

    public RegrasTest() {
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
    public void testVerificaPossibilidadeParaMoverCarta() {
        System.out.println("verificaPossibilidadeParaMoverCarta");
        
        Carta cartaMovida = new Carta();
        cartaMovida.setCarta(12, "OURO");

        Carta cartaEstatica = new Carta();
        cartaEstatica.setCarta(13, "PAUS");

        Regras instance = new Regras();
        boolean expResult = true;
        boolean result = instance.verificaPossibilidadeParaMoverCarta(cartaMovida, cartaEstatica);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testMoverCartasDescarteParaFileira() {
        System.out.println("moverCartasDescarteParaFileira");

        Baralho baralho = new Baralho();
        baralho.inicializaBaralho();

        Descarte descarte = new Descarte();
        Fileira fileira = new Fileira();

        Carta cartaDescarte = new Carta();
        cartaDescarte.setCarta(4, "OURO");
        descarte.pilhaDescarte.push(cartaDescarte);

        Carta cartaFileira = new Carta();
        cartaFileira.setCarta(5, "ESPADA");
        fileira.getPilha().push(cartaFileira);
        
        Regras regra = new Regras();
        
        if(regra.verificaPossibilidadeParaMoverCarta(cartaDescarte, cartaFileira)){
            assertTrue(true);
            regra.moverCartasDescarteParaFileira(descarte, fileira);
        }else
            assertFalse(true);              
    }

    
    @Test
    public void testMoverCartasFileiraParaFileira() {
        System.out.println("moverCartasFileiraParaFileira");

        Baralho baralho = new Baralho();
        baralho.inicializaBaralho();

        Fileira fileiraOrigem = new Fileira();
        Fileira fileiraDestino = new Fileira();

        Carta cartafileiraOrigem = new Carta();
        cartafileiraOrigem.setCarta(13, "OURO");
        fileiraOrigem.getPilha().push(cartafileiraOrigem);

        Carta cartafileiraDestino = new Carta();
        cartafileiraDestino.setCarta(14, "ESPADA");
        fileiraDestino.getPilha().push(cartafileiraDestino);

        Regras regra = new Regras();

        if(regra.verificaPossibilidadeParaMoverCarta(cartafileiraOrigem, cartafileiraDestino)){
            assertTrue(true);
            regra.moverCartasFileiraParaFileira(fileiraOrigem, fileiraDestino);
        }else
            assertFalse(true);
    }
 
    
    @Test
    public void testMoverCartasFileiraParaFundacao() {
        System.out.println("moverCartasFileiraParaFundacao");

        Baralho baralho = new Baralho();
        baralho.inicializaBaralho();

        Fileira fileira = new Fileira();
        Fundacao fundacao = new Fundacao();

        Carta cartafileira = new Carta();
        cartafileira.setCarta(13, "OURO");
        fileira.getPilha().push(cartafileira);

        Carta cartaFundacao = new Carta();
        cartaFundacao.setCarta(14, "ESPADA");
        fundacao.getPilha().push(cartaFundacao);

        Regras regra = new Regras();

        if(regra.verificaPossibilidadeParaMoverCarta(cartafileira, cartaFundacao)){
            assertTrue(true);
            regra.moverCartasFileiraParaFundacao(fileira, fundacao);
        }else
            assertFalse(true);
    }

    
    @Test
    public void testMoverCartasFundacaoParaFileiras() {
        System.out.println("moverCartasFundacaoParaFileiras");

        Baralho baralho = new Baralho();
        baralho.inicializaBaralho();

        Fundacao fundacao = new Fundacao();
        Fileira fileira = new Fileira();

        Carta cartaFundacao = new Carta();
        cartaFundacao.setCarta(6, "ESPADA");
        fundacao.getPilha().push(cartaFundacao);

        Carta cartafileira = new Carta();
        cartafileira.setCarta(7, "OURO");
        fileira.getPilha().push(cartafileira);

        Regras regra = new Regras();

        if(regra.verificaPossibilidadeParaMoverCarta(cartaFundacao, cartafileira)){
            assertTrue(true);
            regra.moverCartasFundacaoParaFileiras(fundacao, fileira);
        }else
            assertFalse(true);
    }

    
    @Test
    public void testMoverCartasDescrateParaFundacao() {
        System.out.println("moverCartasDescrateParaFundacao");
        
        Baralho baralho = new Baralho();
        baralho.inicializaBaralho();

        Descarte descarte = new Descarte();
        Fundacao fundacao = new Fundacao();

        Carta cartaDescarte = new Carta();
        cartaDescarte.setCarta(5, "OURO");
        descarte.pilhaDescarte.push(cartaDescarte);

        Carta cartaFundacao = new Carta();
        cartaFundacao.setCarta(6, "ESPADA");
        fundacao.getPilha().push(cartaFundacao);
        
        Regras regra = new Regras();
        
        if(regra.verificaPossibilidadeParaMoverCarta(cartaDescarte, cartaFundacao)){
            assertTrue(true);
            regra.moverCartasDescrateParaFundacao(descarte, fundacao);
        }else
            assertFalse(true);              
    }
    
    @Test
    public void testMoverCartasASFundacaoOrigemParaFundacaoDestino() {
        System.out.println("MoverCartasASFundacaoOrigemParaFundacaoDestino");
        
        Baralho baralho = new Baralho();
        baralho.inicializaBaralho();

        Fundacao fundacaoOrigem = new Fundacao();
        Fundacao fundacaoDestino = new Fundacao();

        Carta cartaFundacaoOrigem = new Carta();
        cartaFundacaoOrigem.setCarta(1, "OURO");
        fundacaoOrigem.getPilha().push(cartaFundacaoOrigem);
        
        Regras regra = new Regras();     
        assertTrue(regra.moverCartasDeASFundacaoParaFundacao(fundacaoOrigem, fundacaoDestino));                
    }


    @Test
    public void testVerDadosCartaTopo() {
        System.out.println("verDadosCartaTopo");

        Stack origem = new Stack();
        Regras regra = new Regras();
        Carta carta = new Carta();
        carta.setCarta(12, "PAUS");
        origem.push(carta);
        Carta result = regra.verDadosCartaTopo(origem);
        assertEquals(carta, result);
        
    }

}