

/**
 * un juego de cartas basado en la baraja de cartas francesas o de póker. En el mismo pueden participar de 2 a 8 
 * jugadores. Basta con conseguir que las cartas se repartan entre los jugadores.
 */
public class Carta
{
    // guarda el valor de la carta.
    private int valor;
    // guarda el nombre del palo de la baraja.
    private String palo;

    /**
     * Constructor for objects of class Carta
     */
    public Carta(int valor, String palo)
    {
        this.valor =  valor;
        this.palo = palo;
    }

    /**
     * devuelve una cadena con el nombre de la carta.
     */
    public String getNombre(){
        String nombre = "";
        if(valor == 1){
            nombre = "As de " +palo;
        }
        else if(valor == 11){
            nombre = "J de " +palo;
        }
        else if(valor == 12){
            nombre = "Q de " +palo;
        }
        else if(valor == 13){
            nombre = "K de " +palo;
        }
        else{
            nombre = valor+ " de " +palo;
        } 
        return nombre;
    }
    
    /**
     * retorna un entero con el valor correspondiente a la carta (1, 2, ..., 13).
     */
    public int getValor(){
        return valor;
    }
    
    /**
     * retorna un entero con el valor correspondiente a la carta (1, 2, ..., 13).
     */
    public String getPalo(){
        return palo;
    }
    
}



























