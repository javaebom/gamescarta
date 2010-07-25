/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FreeCell;

import jogo.classescomum.Carta;
import jogo.classescomum.Fundacao;
import jogo.classescomum.Fileira;
import jogo.freecell.Celula;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Classe de Teste para validar movimentação de cartas cujo destino é uma pilha fundação
 * @author Fernanda e Igo
 */
public class TesteRegrasFundacao {

    Fundacao fundacao1 = new Fundacao();
    Fundacao fundacao2 = new Fundacao();
    Fundacao fundacao3 = new Fundacao();
    Fundacao fundacao4 = new Fundacao();
    Fileira fileira1 = new Fileira();
    Celula celula1 = new Celula();

    public TesteRegrasFundacao() {
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
     * Método que testa movimentação de carta de fileira para fundacao, sendo a carta da pilha de origem
     * com valor MAIOR que a carta da pilha de destino e com NIPES IGUAIS: MOVIMENTAÇÃO DEVE SER VALIDADA
     */
    @Test
    public void testeMoverCartaAscendenteDeMesmoNipe() {


        //Montando fileira 1
        Carta carta3Ouro = new Carta();
        Carta carta11Espada = new Carta();
        Carta carta13Paus = new Carta();
        Carta carta3Paus = new Carta();
        carta3Ouro.setCarta(3, "OURO");
        carta11Espada.setCarta(11, "ESPADA");
        carta13Paus.setCarta(13, "PAUS");
        carta3Paus.setCarta(3, "PAUS");

        //Esta fileira tem como topo: 3 Paus e Base: 3 Ouro
        fileira1.getPilha().push(carta3Ouro);
        fileira1.getPilha().push(carta11Espada);
        fileira1.getPilha().push(carta13Paus);
        fileira1.getPilha().push(carta3Paus);


        //Montando fundacao
        Carta carta2Paus = new Carta();
        Carta carta1Paus = new Carta();

        carta2Paus.setCarta(2, "PAUS");
        carta1Paus.setCarta(1, "PAUS");

        //Esta fundacao tem como topo: 2 Paus e Base: 1 Paus
        fundacao1.getPilha().push(carta1Paus);
        fundacao1.getPilha().push(carta2Paus);


        /*
         * Movendo carta3Paus da fileira para fundacao, que possui no topo carta2Paus
        MOVIMENTACAO VÁLIDA pois 3 < 2 e cartas são do mesmo nipe
         */
        assertTrue(fundacao1.verifyRule(3, "PAUS", fileira1));

    }

    /**
     * Método que testa movimentação de carta de fileira para fundacao, sendo a carta da pilha de origem
     * com valor MAIOR que a carta da pilha de destino, porém com NIPES DIFERENTES: MOVIMENTAÇÃO DEVE SER INVALIDADA
     */
    @Test
    public void testeMoverCartaAscendenteDeNipesDiferentes() {


        //Montando fileira 1
        Carta carta3Ouro = new Carta();
        Carta carta11Espada = new Carta();
        Carta carta13Paus = new Carta();
        Carta carta3Espada = new Carta();
        carta3Ouro.setCarta(3, "OURO");
        carta11Espada.setCarta(11, "ESPADA");
        carta13Paus.setCarta(13, "PAUS");
        carta3Espada.setCarta(3, "ESPADA");

        //Esta fileira tem como topo: 3 Paus e Base: 3 Ouro
        fileira1.getPilha().push(carta3Ouro);
        fileira1.getPilha().push(carta11Espada);
        fileira1.getPilha().push(carta13Paus);
        fileira1.getPilha().push(carta3Espada);


        //Montando fundacao
        Carta carta2Paus = new Carta();
        Carta carta1Paus = new Carta();

        carta2Paus.setCarta(2, "PAUS");
        carta1Paus.setCarta(1, "PAUS");

        //Esta fundacao tem como topo: 2 Paus e Base: 1 Paus
        fundacao2.getPilha().push(carta1Paus);
        fundacao2.getPilha().push(carta2Paus);


        /*
         * Movendo carta3Espada da fileira para fundacao, que possui no topo carta2Paus
        MOVIMENTACAO INVÁLIDA pois, apesar 3 < 2, as cartas não são do mesmo nipe
         */
        assertFalse(fundacao2.verifyRule(3, "ESPADA", fileira1));

    }

    /**
     * Método que testa movimentação de carta de celula para fundacao, sendo a carta da pilha de origem
     * com valor MENOR que a carta da pilha de destino: MOVIMENTAÇÃO DEVE SER INVALIDADA
     */
    @Test
    public void testeMoverCartaDescendente() {


        //Montando celula
        Carta carta3Ouro = new Carta();
        carta3Ouro.setCarta(3, "OURO");

        //Celula ocupada
        celula1.getPilha().push(carta3Ouro);



        //Montando fundacao
        Carta carta4Paus = new Carta();
        Carta carta3Paus = new Carta();
        Carta carta2Paus = new Carta();
        Carta carta1Paus = new Carta();

        carta4Paus.setCarta(4, "PAUS");
        carta3Paus.setCarta(3, "PAUS");
        carta2Paus.setCarta(2, "PAUS");
        carta1Paus.setCarta(1, "PAUS");

        //Esta fundacao tem como topo: 4 Paus e Base: 1 Paus
        fundacao3.getPilha().push(carta1Paus);
        fundacao3.getPilha().push(carta2Paus);
        fundacao3.getPilha().push(carta3Paus);
        fundacao3.getPilha().push(carta4Paus);


        /*
         * Movendo carta3Ouro da celula para fundacao, que possui no topo carta4Paus
        MOVIMENTACAO INVÁLIDA pois, apesar 3 < 4
         */
        assertFalse(fundacao3.verifyRule(3, "OURO", celula1));

    }

    /**
     * Método que testa movimentação de mais de uma carta para fundacao MOVIMENTAÇÃO DEVE SER INVALIDADA
     */
    @Test
    public void testeMoverMaisDeUmaCarta() {

        //Montando fileira 1
        Carta carta3Espada = new Carta();
        Carta carta5Paus = new Carta();
        Carta carta6Ouro = new Carta();
        Carta carta7Paus = new Carta();
        carta3Espada.setCarta(3, "ESPADA");
        carta5Paus.setCarta(5, "PAUS");
        carta6Ouro.setCarta(6, "OURO");
        carta7Paus.setCarta(7, "PAUS");

        //Esta fileira tem como topo: 5 Paus e Base: 3 Espada
        fileira1.getPilha().push(carta3Espada);
        fileira1.getPilha().push(carta7Paus);
        fileira1.getPilha().push(carta6Ouro);
        fileira1.getPilha().push(carta5Paus);


        //Montando fundacao
        Carta carta4Paus = new Carta();
        Carta carta3Paus = new Carta();
        Carta carta2Paus = new Carta();
        Carta carta1Paus = new Carta();

        carta4Paus.setCarta(4, "PAUS");
        carta3Paus.setCarta(3, "PAUS");
        carta2Paus.setCarta(2, "PAUS");
        carta1Paus.setCarta(1, "PAUS");

        //Esta fundacao tem como topo: 4 Paus e Base: 1 Paus
        fundacao3.getPilha().push(carta1Paus);
        fundacao3.getPilha().push(carta2Paus);
        fundacao3.getPilha().push(carta3Paus);
        fundacao3.getPilha().push(carta4Paus);


        /*
         * Movendo mais de uma carta para fundacao (carta7Paus, carta6Ouro, carta5Paus)
        MOVIMENTACAO INVÁLIDA
         */
        assertFalse(fundacao3.verifyRule(7, "PAUS", fileira1));

    }

    /**
     * Método que testa movimentação de carta diferente de As para fundacao vazia: MOVIMENTAÇÃO DEVE SER INVALIDADA
     */
    @Test
    public void testeMoverCartaParaFundacaoVazia() {

        //Montando celula com carta diferente de As
        Carta carta3Ouro = new Carta();
        carta3Ouro.setCarta(3, "OURO");
        celula1.getPilha().push(carta3Ouro);


        /*
         * Movendo carta diferentes de As para uma fundacao vazia (fundacao4)
        MOVIMENTACAO INVÁLIDA
         */
        assertFalse(fundacao4.verifyRule(3, "OURO", celula1));

    }
}
