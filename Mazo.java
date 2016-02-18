import java.util.ArrayList;
import java.util.Collections;
/**
 * un juego de cartas basado en la baraja de cartas francesas o de póker. En el mismo pueden participar de 2 a 8 
 * jugadores. Basta con conseguir que las cartas se repartan entre los jugadores.
 * 
 * Esta clase contendrá todas las cartas de la baraja. 
 */
public class Mazo{
    //creamos una colección de ArrayList para poder almacenar todas las cartas del mazo.
    private ArrayList<Carta> baraja;

    //para dar valor a la colección.
    public Mazo(){
        baraja = new ArrayList<>();
        baraja.add(new Carta(1, "corazones"));        baraja.add(new Carta(1, "picas"));
        baraja.add(new Carta(2, "corazones"));        baraja.add(new Carta(2, "picas"));
        baraja.add(new Carta(3, "corazones"));        baraja.add(new Carta(3, "picas"));
        baraja.add(new Carta(4, "corazones"));        baraja.add(new Carta(4, "picas"));
        baraja.add(new Carta(5, "corazones"));        baraja.add(new Carta(5, "picas"));
        baraja.add(new Carta(6, "corazones"));        baraja.add(new Carta(6, "picas"));
        baraja.add(new Carta(7, "corazones"));        baraja.add(new Carta(7, "picas"));
        baraja.add(new Carta(8, "corazones"));        baraja.add(new Carta(8, "picas"));
        baraja.add(new Carta(9, "corazones"));        baraja.add(new Carta(9, "picas"));
        baraja.add(new Carta(10, "corazones"));        baraja.add(new Carta(10, "picas"));
        baraja.add(new Carta(11, "corazones"));        baraja.add(new Carta(11, "picas"));
        baraja.add(new Carta(12, "corazones"));        baraja.add(new Carta(12, "picas"));
        baraja.add(new Carta(13, "corazones"));        baraja.add(new Carta(13, "picas"));

        baraja.add(new Carta(1, "treboles"));        baraja.add(new Carta(1, "diamantes"));
        baraja.add(new Carta(2, "treboles"));        baraja.add(new Carta(2, "diamantes"));
        baraja.add(new Carta(3, "treboles"));        baraja.add(new Carta(3, "diamantes"));
        baraja.add(new Carta(4, "treboles"));        baraja.add(new Carta(4, "diamantes"));
        baraja.add(new Carta(5, "treboles"));        baraja.add(new Carta(5, "diamantes"));
        baraja.add(new Carta(6, "treboles"));        baraja.add(new Carta(6, "diamantes"));
        baraja.add(new Carta(7, "treboles"));        baraja.add(new Carta(7, "diamantes"));
        baraja.add(new Carta(8, "treboles"));        baraja.add(new Carta(8, "diamantes"));
        baraja.add(new Carta(9, "treboles"));        baraja.add(new Carta(9, "diamantes"));
        baraja.add(new Carta(10, "treboles"));        baraja.add(new Carta(10, "diamantes"));
        baraja.add(new Carta(11, "treboles"));        baraja.add(new Carta(11, "diamantes"));
        baraja.add(new Carta(12, "treboles"));        baraja.add(new Carta(12, "diamantes"));
        baraja.add(new Carta(13, "treboles"));        baraja.add(new Carta(13, "diamantes"));
    }
    
    /**
     *baraja el mazo de cartas.
     */
    public void barajar(){
        Collections.shuffle(baraja);
    }
    
    /**
     * retorna la primera carta del mazo y modifica el estado del mazo para reflejar que esa carta ya no 
     * se encuentra en el mazo. En caso de que no queden cartas en el mazo devuelve null.
     */
    public Carta tomarPrimera(){
        Carta cartaP = null;
        int cont = 0;
        while(cont < baraja.size()){
            cartaP = baraja.get(0);
            cartaP = baraja.remove(0);
        }
        return cartaP;
    }
    
    /**
     * retorna el número de cartas que quedan en el mazo.
     */
    public int quedan(){
        return baraja.size();
    }
}

 




