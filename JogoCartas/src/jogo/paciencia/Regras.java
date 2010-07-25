package jogo.paciencia;

import java.util.Stack;
import jogo.classescomum.Carta;
import jogo.classescomum.Fileira;
import jogo.classescomum.Fundacao;

/**
 * Classe que possui todas as regras de movimento do jogo Paciencia.
 * @author Wilson
 * @author Andre
 */

public class Regras {

        /**
         * Verifica se é possivel fazer o movimento da carta.
         * @return <i>true</i> se puder mover a carta, <i>false</i>, em caso contrário
         */
        public boolean verificaPossibilidadeParaMoverCarta(Carta cartaMovida, Carta cartaEstatica) {

            int numCartaMovida = cartaMovida.getNumero();
            int numCartaEstatica = cartaEstatica.getNumero();
            String corCartaMovida = cartaMovida.getCor();
            String corCartaEstatica = cartaEstatica.getCor();

            //Verifica o numero e naipe das cartas, para ver se o movimento é possível
            if(numCartaMovida == (numCartaEstatica - 1) && !(corCartaMovida.equals(corCartaEstatica))){
                return true;
            }
            else
                return false;
	}

        /*
         * Move uma carta de uma pilha para outra.
         */
        public void moverCarta(Stack origem, Stack destino){

            destino.push(origem.pop());
        }

        /*
         * Move carta da pilha de descarte para pilha de fileira.
         */
	public void moverCartasDescarteParaFileira(Descarte descarte, Fileira fileira) {

            if(!(descarte.pilhaDescarte.empty())){

                Carta cartaTopoDescarte = verDadosCartaTopo(descarte.pilhaDescarte);

                Carta cartaTopoFundacao = verDadosCartaTopo(fileira.getPilha());

                if(verificaPossibilidadeParaMoverCarta(cartaTopoDescarte, cartaTopoFundacao)){
                    moverCarta(descarte.pilhaDescarte, fileira.getPilha());
                }
            }

	}

        /*
         * Move carta da pilha de fileira para outra pilha de fileira.
         */
	public void moverCartasFileiraParaFileira(Fileira fileiraOrigem, Fileira fileiraDestino) {

            if(!(fileiraOrigem.getPilha().empty())){

                Carta cartaTopoFileiraOrigem = verDadosCartaTopo(fileiraOrigem.getPilha());

                Carta cartaTopoFileiraDestino = verDadosCartaTopo(fileiraDestino.getPilha());

                if(verificaPossibilidadeParaMoverCarta(cartaTopoFileiraOrigem, cartaTopoFileiraDestino)){
                    moverCarta(fileiraOrigem.getPilha(), fileiraDestino.getPilha());
                }
            }

	}

        /*
         * Move carta da pilha de fileira para pilha de fundacao.
         */
	public void moverCartasFileiraParaFundacao(Fileira fileira, Fundacao fundacao) {

            if(fundacao.getPilha().empty()){
                if(fileira.cartaViradaTopo.getNumero() == 1){
                    fundacao.getPilha().push(fileira.getPilha().pop());
                    fileira.setNullCartaTopo();
                }
            }
            else{
                Carta cartaTopoFileira = verDadosCartaTopo(fileira.getPilha());
                int numCartaFileira = cartaTopoFileira.getNumero();
                String naipeCartaFileira = cartaTopoFileira.getNipe();

                Carta cartaTopoFundacao = verDadosCartaTopo(fundacao.getPilha());
                int numCartaFundacao = cartaTopoFundacao.getNumero();
                String naipeCartaFundacao = cartaTopoFundacao.getNipe();

                if(numCartaFileira == (numCartaFundacao + 1) && naipeCartaFileira.equals(naipeCartaFundacao)){
                    fundacao.getPilha().push(fileira.getPilha().pop());
                    fileira.setNullCartaTopo();
                }
            }
	}

         /*
         * Move carta da pilha de fundacao para pilha de fileira.
         */
	public void moverCartasFundacaoParaFileiras(Fundacao fundacao, Fileira fileira) {

            if(!(fundacao.getPilha().empty())){
                
                Carta cartaTopoFundacao = verDadosCartaTopo(fundacao.getPilha());

                Carta cartaTopoFileira = verDadosCartaTopo(fileira.getPilha());

                if(verificaPossibilidadeParaMoverCarta(cartaTopoFundacao, cartaTopoFileira)){
                    moverCarta(fundacao.getPilha(), fileira.getPilha());
                }
            }
	}

        /*
         * Move carta da pilha de descarte para pilha de fundacao.
         */
	public void moverCartasDescrateParaFundacao(Descarte descarte, Fundacao fundacao) {

            if(!(descarte.pilhaDescarte.empty())){

                Carta cartaTopoDescarte = verDadosCartaTopo(descarte.pilhaDescarte);

                Carta cartaTopoFundacao = verDadosCartaTopo(fundacao.getPilha());

                if(verificaPossibilidadeParaMoverCarta(cartaTopoDescarte, cartaTopoFundacao)){
                    moverCarta(descarte.pilhaDescarte, fundacao.getPilha());
                }
            }
	}

         /*
         * Move cartas de ÁS da pilha de fundação de origem para pilha de fundacao destino.
         * @return <i>true</i> se puder mover a carta, <i>false</i>, em caso contrário
         */
	public boolean moverCartasDeASFundacaoParaFundacao(Fundacao fundacaoOrigem, Fundacao fundacaoDestino) {

                Carta cartaTopoFundacaoOrigem = verDadosCartaTopo(fundacaoOrigem.getPilha());
                int numCartaFundacaoOrigem = cartaTopoFundacaoOrigem.getNumero();         
                
                if(fundacaoDestino.getPilha().isEmpty()){
                    if(numCartaFundacaoOrigem == 1){
                    fundacaoDestino.getPilha().push(fundacaoOrigem.getPilha().pop());
                    return true;
                   } 
                }
                return false;
	}

        /*
         * Retorna carta do topo de determinada pilha
         * @return Carta do topo da pilha
         */
        public Carta verDadosCartaTopo(Stack origem) {

            Object carta = origem.pop();
            Carta cartaTopo = (Carta) carta;
            origem.push(cartaTopo);
            return cartaTopo;
        }
}
