

/**
 * un juego de cartas basado en la baraja de cartas francesas o de póker. En el mismo pueden participar de 2 a 8 
 * jugadores. Basta con conseguir que las cartas se repartan entre los jugadores.
 */
public class Carta
{
  //guarda el valor de la carta; 1, 2 ,...K
  private int valor;
  //guarda el palo de la baraja 
  private String palo;
  
  //Para dar valor a los atributos.
  public Carta(int valor, String palo){
    this.valor = valor;
    this.palo = palo;    
  }
  /**
   * devuelve una cadena con el nombre de la carta.
   */  
  public String getNombre(){
      String carta = "";
      if(valor == 1){
      carta = "As de: " +palo;  
      }
      else if(valor == 11){
      carta = "J de: "  +palo;  
      }
      else if(valor == 12){
      carta = "Q de: "  +palo;  
      }
      else if(valor == 13){
      carta = "K de: "  +palo;  
      }
      else{        
          carta = valor + " de:  "  +palo;
      } 
      return carta;
  }
  
  /**
   * con el valor correspondiente a la carta (1, (): retorna un entero 2, ..., 13).
   */
  public int getValor(){
      return valor;
  }
  
  /**
   *retorna una cadena que contiene el palo correspondiente a la carta (picas, treboles, diamantes o corazones).
   */
  public String getPalo(){
      return palo;  
  }
    
}



























