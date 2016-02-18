import java.util.ArrayList;
import java.util.Collections;
/**
 * Francisco Javier
 * un juego de cartas basado en la baraja de cartas francesas o de póker. En el mismo pueden participar de 2 a 8 
 * jugadores. Para comenzar nos basta con conseguir que las cartas se repartan entre los jugadores.
 */
public class Juego
{
    // instance variables - replace the example below with your own
    private ArrayList<Jugador> jugadores;
    //para crear el mazo
    private Mazo mazo;

    /**
     * Constructor for objects of class Juego
     */
    public Juego(int numeroJugadores){
        mazo = new Mazo();
        jugadores = new ArrayList<>();
        if(numeroJugadores < 2 || numeroJugadores > 8){
            numeroJugadores = 4;
        }
    }

    /**
     *  método que reparte todas las cartas a los jugadores en la forma habitual en que se hace en un juego de cartas, es 
     *  decir, barajando el mazo y entregando alternativamente cartas a los jugadores tomando siempre la primera carta del
     *  mazo. Al finalizar el reparto todos los jugadores deben tener el mismo número de cartas, por lo que es posible,
     *   dependiendo del número de estos, que queden cartas en el mazo.
     */
   public void repartir()
    { 
        mazo .barajar(); 
        int numeroJugadores = jugadores.size();
        while (mazo .quedan() >= numeroJugadores) {
            int index = 0;
            while (index < numeroJugadores) {
                jugadores.get(index).recibirCarta(mazo .tomarPrimera());
                index++;
            }
        }
    }
    
    /**
     * Muestra por pantalla el id de cada jugador junto con la cartas que tiene en la mano
     */
    public void mostrarCartasJugadores()
    {
        for (Jugador jugador : jugadores) {
            System.out.println("Id: " + jugador.getId());
            System.out.println("Cartas: " + jugador.cartasQueTieneEnLaMano());
        }
    }
}





















