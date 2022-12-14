package game;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import player.Player;

/**
 * Game class.
 * On this package we will do everything needed to make the game work in perfect conditions.
 * Actions like: save the game, load the game, create enemies o allies, etc. will be done on this class.
 * 
 * @author Camilo Jené Conde <cjeneconde@gmail.com>
 * @version 0.0.1
 */
public class Game {
    /**
     * Instance variable in order to implement the Singleton design pattern.
     */
    private static Game instance;
    
    /**
     * Instance of the player playing the game.
     */
    private Player player;

    /**
     * Saving instances. We will be able to save up to four different games.
     */
    private Map<Integer, String> savings = new HashMap<>();

    /**
     * Game constructor.
     */
    private Game() {
        try {
            loadGame();
        } catch (Exception e) {
            createGame();
        }
    }

    /**
     * Method that returns the instance of the Singleton DP. 
     * 
     * @return instance Singleton instance.
     */
    public static Game getInstance() {
        if (Game.instance == null) return new Game();
        else return Game.instance;
    }

    /**
     * Method that creates an empty game.
     */
    private void createGame() {
        /* Crearemos el juego. */
        int size = savings.size();

        /* Crear el ficehro. */
        
        savings.put(size, "Nombre del fichero.");
    }

    /**
     * This method is in charged of loading the game if exists the file data.
     */
    private void loadGame() throws FileNotFoundException {
        /* Aquí cargaremos el juego a la hora de crear la instancia. */
    }

    /**
     * This method is in charged of loading the game on the correct data file.
     */
    public void saveGame() {
        /* Aquí guardaremos el juego. */
    }


    /**
     * Method that prints evrything needed from the Game class.
     */
    @Override public String toString() {
        return "Esta es la clase Game.";
    }
}