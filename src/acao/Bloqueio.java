package acao;
import base.Roda;
import base.Jogada;
/**
 * @author Lucas Patrizi
 * @version 2.2
 * @since 03/10/22
 * @see Roda
 */

public class Bloqueio extends Acao {
  /**
   * Pula a jogada de um jogador, usando a função pular da roda
   * (roda.pular()), para o proximo jogador
   * 
   * @param roda - é a roda usada no próprio jogo
   * @return
   * 
   */
  public void realizar(Roda roda) {
    roda.pular();
  }

  /**
   * Função realizar para cartas de compras (não faz nada em Bloqueio);
   * 
   * @param roda
   * @param n
   */
  public void realizar(Roda roda, int n) {
    System.out.println("Você está utilizando os parâmetros errados: colocando um inteiro na ação de bloquear");
    return;
  }
  public void realizar (Jogada jogada) {
    System.out.println("Você está utilizando os parâmetros errados: colocando uma Jogada na ação de bloquear");
    return;
  }
  public void realizar (Jogada jogada, Roda roda, int n) {
    System.out.println("Você está utilizando os parâmetros errados: colocando Jogada e um inteiro na ação de bloquear");
    return;
  }

  /**
   * função que retorna qual o tipo da ação
   * 
   * @return String bloqueio
   */
  public String getAcao() {
    return "Bloqueio";
  }
}