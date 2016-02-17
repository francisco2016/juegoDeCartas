import java.util.ArrayList;
/**
 * un juego de cartas basado en la baraja de cartas francesas o de póker. En el mismo pueden participar de 2 a 8 
 * jugadores. Basta con conseguir que las cartas se repartan entre los jugadores.
 */
public class Jugador
{
    //para guardar el id del jugador.
    private int id;
    //para almacenar un grupo de jugadores
    private ArrayList<Carta> cartas;

    //para inicializar el ArrayList.
    public Jugador(int id){
        this.id = id;
    }

    /**
     * agrega la carta unaCarta a las que posee el jugador.
     */
    public void recibirCarta(Carta unaCarta){
        cartas.add(unaCarta);
    }

    /**
     * devuelve una colección de cadenas con los nombres de las cartas
     */
    public ArrayList<String> cartasQueTieneEnLaMano(){
        ArrayList<String> cartasTiene = new ArrayList<>();// VL de tipo A..List para guardar las cartas que va adquiriendo.
        for(Carta carta : cartas){//recorro la colección de cartas 
            cartasTiene.add(carta.getNombre());
        }
        return cartasTiene;
    }





}
