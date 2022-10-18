package acao;
import base.Roda;
import base.Jogada;
/**
 * @author Felippe
 * @Version 2.0
 */

public class Mais2 extends Acao {

/**
 * @param roda é um objeto da Classe Roda que é um vetor um ciclo (roda do jogo).
 * A função faz o proximo Jogador da roda comprar 2 cartas, após a compra o mesmo perde a vez,
 * pulando para o proximo jogador - roda.pular - 
 * 
 */

  public String getAcao(){
    return "Mais2";
  }

  public void relizar(Roda roda, int n) { 
    roda.comprar(n, roda.jogadores[roda.proximoJogador]);
    roda.pular(); 
  }
  public void realizar (Jogada jogada) {
    System.out.println("Você está utilizando os parâmetros errados: colocando uma jogada, e faltando roda e inteiro para uma ação +2");
    return;
  }
  public void realizar (Jogada jogada, Roda roda, int n) {
    System.out.println("Você está utilizando os parâmetros errados: colocando uma jogada e um inteiro para uma ação +2");
    return;
  }
  public void realizar (Roda roda) {
    System.out.println("Você está utilizando os parâmetros errados: faltando numero de acumulo para a ação +2");
    return;
  }
}