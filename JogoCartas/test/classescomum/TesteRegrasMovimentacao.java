/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FreeCell;

import jogo.classescomum.Carta;
import jogo.classescomum.Pilha;
import jogo.classescomum.Fundacao;
import jogo.freecell.RegrasCelulas;
import jogo.classescomum.RegrasMovimentacao;
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
public class TesteRegrasMovimentacao {

    RegrasMovimentacao regras = new RegrasCelulas();

    public TesteRegrasMovimentacao() {
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
     * Método de teste responsável por verificar se uma pilha esta vazia
     */
    @Test
    public void testePilhaVazia() {
        Pilha pilha = new Fundacao();
        assertTrue(regras.pilhaVazia(pilha));
    }

    /**
     * Teste do método que recebe um conjunto de cartas e verifica se estas são descendentes
     * É criado um conjunto de cartas e então testado
     */
    @Test
    public void testeVerificaDescendenciaDeConjuntoDeCarta() {
        Stack<Carta> pilha = new Stack<Carta>();
        Carta carta2Ouro = new Carta();
        Carta carta3Ouro = new Carta();
        Carta carta4Ouro = new Carta();
        carta2Ouro.setCarta(2, "OURO");
        carta3Ouro.setCarta(3, "OURO");
        carta4Ouro.setCarta(4, "OURO");
        pilha.push(carta3Ouro);
        pilha.push(carta2Ouro);
        assertTrue(regras.verificaDescendenciaDeConjuntoDeCarta(pilha));
        pilha.push(carta4Ouro);
        assertFalse(regras.verificaDescendenciaDeConjuntoDeCarta(pilha));
    }

    /**
     * Teste do método que recebe um conjunto de cartas e verifica se estas são descendentes
     * É criado um conjunto de cartas e então testado
     */
    @Test
    public void testeVerificaAlternanciaDeCorDeConjuntoDeCarta() {
        Stack<Carta> pilha = new Stack<Carta>();
        Carta carta2Espada = new Carta();
        Carta carta3Ouro = new Carta();
        Carta carta4Ouro = new Carta();
        Carta carta4Espada = new Carta();
        carta2Espada.setCarta(2, "ESPADA");
        carta3Ouro.setCarta(3, "OURO");
        carta4Espada.setCarta(4, "ESPADA");
        pilha.push(carta3Ouro);
        pilha.push(carta2Espada);
        assertTrue(regras.verificaAlternanciaDeCorDeConjuntoDeCarta(pilha));
        pilha.push(carta4Espada);
        assertFalse(regras.verificaAlternanciaDeCorDeConjuntoDeCarta(pilha));
    }

    /**
     * Teste do método que analisa se a cor informada na forma de String passada como referência
     * é igual a cor da carta topo da pilha também passada como referência
     */
    @Test
    public void testeCorAlternada() {
        Pilha pilha = new Fundacao();
        Carta carta2Espada = new Carta();
        carta2Espada.setCarta(2, "ESPADA");
        pilha.getPilha().push(carta2Espada);
        assertTrue(regras.corAlternada(pilha, "VERMELHA"));
        assertFalse(regras.corAlternada(pilha, "PRETA"));
    }

    /**
     * Teste do método que analisa se o nipe informado na forma de String passada como referência
     * é igual ao nipe da carta topo da pilha também passada como referência
     */
    @Test
    public void testeMesmoNipe() {
        Pilha pilha = new Fundacao();
        Carta carta2Espada = new Carta();
        carta2Espada.setCarta(2, "ESPADA");
        pilha.getPilha().push(carta2Espada);
        assertTrue(regras.mesmoNipe(pilha, "ESPADA"));
        assertFalse(regras.mesmoNipe(pilha, "PAUS"));
    }

    /**
     * Teste do método que analisa se o valor informado na forma de int e passado como referência
     * é igual a um valor a mais em relação ao valor da carta topo da pilha também passada como referência
     * Testado a ascendencia
     */
    @Test
    public void testeAscendente() {
        Pilha pilha = new Fundacao();
        Carta carta2Espada = new Carta();
        carta2Espada.setCarta(2, "ESPADA");
        pilha.getPilha().push(carta2Espada);
        assertTrue(regras.ascendente(pilha, 3));
        assertFalse(regras.ascendente(pilha, 1));
    }

    /**
     * Teste do método que analisa se o valor informado na forma de int e passado como referência
     * é igual a um valor a menos em relação ao valor da carta topo da pilha também passada como referência
     * Testado a descendencia
     */
    @Test
    public void testeDescendente() {
        Pilha pilha = new Fundacao();
        Carta carta2Espada = new Carta();
        carta2Espada.setCarta(2, "ESPADA");
        pilha.getPilha().push(carta2Espada);
        assertTrue(regras.descendente(pilha, 1));
        assertFalse(regras.descendente(pilha, 3));
    }

    /**
     * Testa se um valor inteiro passado como referência é igual ao valor de uma carta As
     */
    @Test
    public void testeEAs() {
        assertTrue(regras.eAs(1));
        assertFalse(regras.eAs(3));
    }

    /**
     * Testa se um valor inteiro passado como referência é igual ao valor de uma carta K
     */
    @Test
    public void testeEK() {
        assertTrue(regras.eK(13));
        assertFalse(regras.eK(3));
    }
}
