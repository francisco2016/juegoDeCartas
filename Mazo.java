import java.util.ArrayList;
import java.util.Collections;
/**
 * un juego de cartas basado en la baraja de cartas francesas o de póker. En el mismo pueden participar de 2 a 8 
 * jugadores. Basta con conseguir que las cartas se repartan entre los jugadores.
 * 
 * Esta clase contendrá todas las cartas de la baraja. 
 */
public class Mazo
{
    // colección de String para poder guardar todas las cartas de la baraja.
    private ArrayList<Carta> cartas;

    /**
     * Constructor for objects of class Mazo
     */
    public Mazo()
    {
      cartas = new ArrayList<>();
      cartas.add(new Carta(1,"picas"));
        cartas.add(new Carta(2,"picas"));
        cartas.add(new Carta(3,"picas"));
        cartas.add(new Carta(4,"picas"));
        cartas.add(new Carta(5,"picas"));
        cartas.add(new Carta(6,"picas"));
        cartas.add(new Carta(7,"picas"));
        cartas.add(new Carta(8,"picas"));
        cartas.add(new Carta(9,"picas"));
        cartas.add(new Carta(10,"picas"));
        cartas.add(new Carta(11,"picas"));
        cartas.add(new Carta(12,"picas"));
        cartas.add(new Carta(13,"picas"));
        cartas.add(new Carta(1,"treboles"));
        cartas.add(new Carta(2,"treboles"));
        cartas.add(new Carta(3,"treboles"));
        cartas.add(new Carta(4,"treboles"));
        cartas.add(new Carta(5,"treboles"));
        cartas.add(new Carta(6,"treboles"));
        cartas.add(new Carta(7,"treboles"));
        cartas.add(new Carta(8,"treboles"));
        cartas.add(new Carta(9,"treboles"));
        cartas.add(new Carta(10,"treboles"));
        cartas.add(new Carta(11,"treboles"));
        cartas.add(new Carta(12,"treboles"));
        cartas.add(new Carta(13,"treboles"));
        cartas.add(new Carta(1,"diamantes"));
        cartas.add(new Carta(2,"diamantes"));
        cartas.add(new Carta(3,"diamantes"));
        cartas.add(new Carta(4,"diamantes"));
        cartas.add(new Carta(5,"diamantes"));
        cartas.add(new Carta(6,"diamantes"));
        cartas.add(new Carta(7,"diamantes"));
        cartas.add(new Carta(8,"diamantes"));
        cartas.add(new Carta(9,"diamantes"));
        cartas.add(new Carta(10,"diamantes"));
        cartas.add(new Carta(11,"diamantes"));
        cartas.add(new Carta(12,"diamantes"));
        cartas.add(new Carta(13,"diamantes"));
        cartas.add(new Carta(1,"corazones"));
        cartas.add(new Carta(2,"corazones"));
        cartas.add(new Carta(3,"corazones"));
        cartas.add(new Carta(4,"corazones"));
        cartas.add(new Carta(5,"corazones"));
        cartas.add(new Carta(6,"corazones"));
        cartas.add(new Carta(7,"corazones"));
        cartas.add(new Carta(8,"corazones"));
        cartas.add(new Carta(9,"corazones"));
        cartas.add(new Carta(10,"corazones"));
        cartas.add(new Carta(11,"corazones"));
        cartas.add(new Carta(12,"corazones"));
        cartas.add(new Carta(13,"corazones"));
         
    }
    
    /**
     * baraja el mazo de cartas
     */
     public void barajar(){
        Collections.shuffle(cartas);
    }
    
    /**
     * retorna la primera carta del mazo y modifica el estado del mazo para reflejar que esa carta ya no se 
     * encuentra en el mazo. En caso de que no queden cartas en el mazo devuelve null.
     */
     public Carta tomarPrimera(){
         Carta primera = null;
        if (cartas.size() > 0)
        {
            primera = cartas.get(0);
            cartas.remove(0);
        }
        return primera;
    }
      
     /**
     * retorna el número de cartas que quedan en el mazo.
     */
    public int quedan(){
        
        return cartas.size();
    }
    
    }
    
   
 








