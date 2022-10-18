package acao;
import base.Roda;
import base.Jogada;
/**
  * @author Pedro;
  * @version 2.0;
  */

public class Inverter extends Acao {
 /**
  * @deprecated;
  * Função para inverter o sentido do jogo;
  * @param Roda representa objeto referente a classe Roda;
  * recebe o sentido e inverte, retornando a jogada para o jogador anterior;
  */
  public void realizar(Roda roda) {
    roda.inverter();
  }
  public void realizar(Roda roda, int n) {
    System.out.println("Você está utilizando os parâmetros errados: Colocando um inteiro para uma ação de inverter");
    return;
  }
  public void realizar (Jogada jogada) {
    System.out.println("Você está utilizando os parâmetros errados: Colocando uma jogada para uma ação de inverter");
    return;
  }
  public void realizar (Jogada jogada, Roda roda, int n) {
    System.out.println("Você está utilizando os parâmetros errados: Colocando uma jogada e um inteiro para uma ação de inverter");
    return;
  }
  /**
  * Função para retornar qual a ação da carta
  */
  public String getAcao(){
    return "Inverter";
  }

}